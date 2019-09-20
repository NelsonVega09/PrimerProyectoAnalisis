package algoritmos;

import grafo.Grafo;
import grafo.Vertice;

public class MaxBeneficio {
        
        ;

        public MaxBeneficio() {
        }
       
        
        
        public void maxBeneficio(Grafo grafo){
                int benTotal = 0;
                for(int i=0 ; i<grafo.grafo.size() ; i++){
                        if(!grafo.grafo.get(i).visitado){
                                grafo.grafo.get(i).visitado = true;
                                if(maxBeneficioAux(grafo,grafo.grafo.get(i))){                  //Entrar
                                        benTotal += grafo.grafo.get(i).beneficio;
                                        marcar(grafo,grafo.grafo.get(i));
                                        grafo.grafo.get(i).marcar = true;
                                        System.out.println(grafo.grafo.get(i).nombre);
                                }
                                else{
                                        for(int j=0 ; j<grafo.grafo.get(i).listaArcos.size() ; j++){
                                                if(!grafo.buscarVertice(grafo.grafo.get(i).listaArcos.get(j).destino).visitado){
                                                        grafo.buscarVertice(grafo.grafo.get(i).listaArcos.get(j).destino).visitado = true;
                                                        if(maxBeneficioAux(grafo,grafo.buscarVertice(grafo.grafo.get(i).listaArcos.get(j).destino))){   //entrar
                                                                grafo.buscarVertice(grafo.grafo.get(i).listaArcos.get(j).destino).marcar = true;
                                                                System.out.println(grafo.buscarVertice(grafo.grafo.get(i).listaArcos.get(j).destino).nombre);
                                                                benTotal += grafo.buscarVertice(grafo.grafo.get(i).listaArcos.get(j).destino).beneficio;
                                                                marcar(grafo,grafo.buscarVertice(grafo.grafo.get(i).listaArcos.get(j).destino));
                                                        }
                                                        else{
                                                                benTotal += sumaArcos(grafo,grafo.buscarVertice(grafo.grafo.get(i).listaArcos.get(j).destino));
                                                        }                                                }
                                        }
                                }
                        }
                }
                
                System.out.println("El beneficio total es: "+benTotal);
        }
        
        public void marcar(Grafo grafo, Vertice vertice){
                for(int i=0 ; i<vertice.listaArcos.size() ; i++){
                        System.out.println("Marcado como true "+ grafo.buscarVertice(vertice.listaArcos.get(i).destino).nombre);
                        grafo.buscarVertice(vertice.listaArcos.get(i).destino).visitado = true;
                }
        }
        
        public boolean maxBeneficioAux(Grafo grafo, Vertice vertice){
                int cont = 0;
                for(int i=0 ; i<vertice.listaArcos.size() ; i++){
                        if(!grafo.buscarVertice(vertice.listaArcos.get(i).destino).visitado){
                                cont += grafo.buscarVertice(vertice.listaArcos.get(i).destino).beneficio;
                        }
                        if(grafo.buscarVertice(vertice.listaArcos.get(i).destino).marcar){
                                return false;
                        }
                }
                if(vertice.beneficio >= cont){
                        return true;
                }
                else 
                        return false;
        }
        
        public int sumaArcos(Grafo grafo, Vertice vertice){
                int cont = 0;
                for(int i=0 ; i<vertice.listaArcos.size() ; i++){
                        if(!grafo.buscarVertice(vertice.listaArcos.get(i).destino).visitado){
                                cont += grafo.buscarVertice(vertice.listaArcos.get(i).destino).beneficio;
                                grafo.buscarVertice(vertice.listaArcos.get(i).destino).marcar = true;
                                System.out.println(grafo.buscarVertice(vertice.listaArcos.get(i).destino).nombre);
                                 grafo.buscarVertice(vertice.listaArcos.get(i).destino).visitado = true;
                        }
                }
                return cont;
        }
        
}
