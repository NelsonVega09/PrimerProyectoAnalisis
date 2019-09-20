package algoritmos;

import grafo.Grafo;
import grafo.Vertice;

public class MaxBeneficio {
    
    public static int comp = 0;
    public static int asig = 0;
    public static int lin = 0;
    
    public void maxBeneficio(Grafo grafo){
        asig++;
        int benTotal = 0;
        asig++;
        comp++;
        for(int i=0 ; i<grafo.grafo.size() ; i++){
            comp++;
            asig++;
            comp++;
            if(!grafo.grafo.get(i).visitado){
                asig++;
                grafo.grafo.get(i).visitado = true;
                comp++;
                if(maxBeneficioAux(grafo,grafo.grafo.get(i))){                  //Entrar
                    asig++;
                    benTotal += grafo.grafo.get(i).beneficio;
                    marcar(grafo,grafo.grafo.get(i));
                    asig++;
                    grafo.grafo.get(i).marcar = true;
                    //System.out.println(grafo.grafo.get(i).nombre);
                }
                else{
                    asig++;
                    comp++;
                    for(int j=0 ; j<grafo.grafo.get(i).listaArcos.size() ; j++){
                        comp++;
                        comp++;
                        asig++;
                        if(!grafo.buscarVertice(grafo.grafo.get(i).listaArcos.get(j).destino).visitado){
                            asig++;
                            grafo.buscarVertice(grafo.grafo.get(i).listaArcos.get(j).destino).visitado = true;
                            comp++;
                            if(maxBeneficioAux(grafo,grafo.buscarVertice(grafo.grafo.get(i).listaArcos.get(j).destino))){   //entrar
                                asig++;
                                grafo.buscarVertice(grafo.grafo.get(i).listaArcos.get(j).destino).marcar = true;
                                //System.out.println(grafo.buscarVertice(grafo.grafo.get(i).listaArcos.get(j).destino).nombre);
                                asig++;
                                benTotal += grafo.buscarVertice(grafo.grafo.get(i).listaArcos.get(j).destino).beneficio;
                                marcar(grafo,grafo.buscarVertice(grafo.grafo.get(i).listaArcos.get(j).destino));
                            }
                            else{
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

    public void marcar(Grafo grafo, Vertice vertice){
        asig++;
        comp++;
        for(int i=0 ; i<vertice.listaArcos.size() ; i++){
            comp++;
            asig++;
            //System.out.println("Marcado como true "+ grafo.buscarVertice(vertice.listaArcos.get(i).destino).nombre);
            asig++;
            grafo.buscarVertice(vertice.listaArcos.get(i).destino).visitado = true;
        }
    }

    public boolean maxBeneficioAux(Grafo grafo, Vertice vertice){
        asig++;
        int cont = 0;
        asig++;
        comp++;
        for(int i=0 ; i<vertice.listaArcos.size() ; i++){
            comp++;
            asig++;
            comp++;
            if(!grafo.buscarVertice(vertice.listaArcos.get(i).destino).visitado){
                asig++;
                cont += grafo.buscarVertice(vertice.listaArcos.get(i).destino).beneficio;
            }
            comp++;
            if(grafo.buscarVertice(vertice.listaArcos.get(i).destino).marcar)
                return false;           
        }
        comp++;
        return vertice.beneficio >= cont;
    }

    public int sumaArcos(Grafo grafo, Vertice vertice){
        asig++;
        asig++;
        int cont = 0;
        comp++;
        for(int i=0 ; i<vertice.listaArcos.size() ; i++){
            comp++;
            asig++;
            comp++;
            if(!grafo.buscarVertice(vertice.listaArcos.get(i).destino).visitado){
                asig++;
                cont += grafo.buscarVertice(vertice.listaArcos.get(i).destino).beneficio;
                grafo.buscarVertice(vertice.listaArcos.get(i).destino).marcar = true;
                //System.out.println(grafo.buscarVertice(vertice.listaArcos.get(i).destino).nombre);
                grafo.buscarVertice(vertice.listaArcos.get(i).destino).visitado = true;
            }
        }
        return cont;
    }       
}
