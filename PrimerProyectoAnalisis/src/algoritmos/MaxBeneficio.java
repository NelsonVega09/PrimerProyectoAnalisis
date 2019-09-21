package algoritmos;

import grafo.Grafo;
import grafo.Vertice;
import static primerproyectoanálisis.PrimerProyectoAnálisis.asig;
import static primerproyectoanálisis.PrimerProyectoAnálisis.comp;
import static primerproyectoanálisis.PrimerProyectoAnálisis.lin;

public class MaxBeneficio {
    
    /**
     * Este algortimo permite saber el mayor beneficio que puede ser obtenido
     * teniendo en cuanta que los restaurantes no queden uno continuo del otro
     * @param grafo 
     */
    public void maxBeneficio(Grafo grafo){
        asig+=2;
        comp++;
        lin+=3;
        int benTotal = 0;
        for(int i=0 ; i<grafo.grafo.size() ; i++){
            lin+=3;
            comp+=2;
            asig++;
            if(!grafo.grafo.get(i).visitado){
                lin+=2;
                asig++;
                comp++;
                grafo.grafo.get(i).visitado = true;
                if(maxBeneficioAux(grafo,grafo.grafo.get(i))){                  
                    asig+=2;
                    lin+=3;
                    benTotal += grafo.grafo.get(i).beneficio;
                    marcar(grafo,grafo.grafo.get(i));
                    grafo.grafo.get(i).marcar = true;
                }
                else{
                    asig++;
                    comp++;
                    lin+=2;
                    for(int j=0 ; j<grafo.grafo.get(i).listaArcos.size() ; j++){
                        comp+=2;
                        asig++;
                        lin+=3;
                        if(!grafo.buscarVertice(grafo.grafo.get(i).listaArcos.get(j).destino).visitado){
                            asig++;
                            comp++;
                            lin+=2;
                            grafo.buscarVertice(grafo.grafo.get(i).listaArcos.get(j).destino).visitado = true;
                            if(maxBeneficioAux(grafo,grafo.buscarVertice(grafo.grafo.get(i).listaArcos.get(j).destino))){
                                asig+=2;
                                lin+=3;
                                grafo.buscarVertice(grafo.grafo.get(i).listaArcos.get(j).destino).marcar = true;
                                benTotal += grafo.buscarVertice(grafo.grafo.get(i).listaArcos.get(j).destino).beneficio;
                                marcar(grafo,grafo.buscarVertice(grafo.grafo.get(i).listaArcos.get(j).destino));
                            }
                            else{
                                lin++;
                                asig++;
                                benTotal += sumaArcos(grafo,grafo.buscarVertice(grafo.grafo.get(i).listaArcos.get(j).destino));                                             
                            }
                        }
                    }
                }
            }
        }
        System.out.println("El beneficio total es: " + benTotal);
        System.out.println("Asignaciones: "+asig);
        System.out.println("Comparaciones: "+comp);
    }

    /**
     * Esta funcion marca el vertice si 
     * su beneficio fue contado para el resultado final
     * @param grafo
     * @param vertice 
     */
    public void marcar(Grafo grafo, Vertice vertice){
        asig++;
        comp++;
        lin+=2;
        for(int i=0 ; i<vertice.listaArcos.size() ; i++){
            comp++;
            asig+=2;
            lin++;
            grafo.buscarVertice(vertice.listaArcos.get(i).destino).visitado = true;
        }
    }

    /**
     * Esta funcion auxiliar pertimte al algoritmo saber 
     * si la suma del beneficio de sus vecinos es mayor que el beneficio
     * del vertice.
     * @param grafo
     * @param vertice
     * @return 
     */
    public boolean maxBeneficioAux(Grafo grafo, Vertice vertice){
        asig+=2;
        comp+=2;
        lin+=4;
        int cont = 0;
        for(int i=0 ; i<vertice.listaArcos.size() ; i++){
            comp+=3;
            asig++;
            lin+=4;
            if(!grafo.buscarVertice(vertice.listaArcos.get(i).destino).visitado){
                asig++;
                lin++;
                cont += grafo.buscarVertice(vertice.listaArcos.get(i).destino).beneficio;
            }
            if(grafo.buscarVertice(vertice.listaArcos.get(i).destino).marcar)
                return false;           
        }
        return vertice.beneficio >= cont;
    }

    /**
     * Retorna la suma de los vertices vecinos en 
     * caso de que sea mayor al beneficio del vertice
     * @param grafo
     * @param vertice
     * @return 
     */
    public int sumaArcos(Grafo grafo, Vertice vertice){
        asig+=2;
        comp++;
        lin+=3;
        int cont = 0;
        for(int i=0 ; i<vertice.listaArcos.size() ; i++){
            comp+=2;
            asig++;
            lin+=3;
            if(!grafo.buscarVertice(vertice.listaArcos.get(i).destino).visitado){
                asig++;
                lin+=3;
                cont += grafo.buscarVertice(vertice.listaArcos.get(i).destino).beneficio;
                grafo.buscarVertice(vertice.listaArcos.get(i).destino).marcar = true;
                grafo.buscarVertice(vertice.listaArcos.get(i).destino).visitado = true;
            }
        }
        return cont;
    }       
}
