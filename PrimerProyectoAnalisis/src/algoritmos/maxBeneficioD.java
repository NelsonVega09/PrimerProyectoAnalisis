package algoritmos;

import grafo.Arco;
import grafo.Grafo;
import grafo.Vertice;
import java.util.ArrayList;


public class maxBeneficioD {
    
        public int maxBeneficioTotal = 0;
        public int maxBeneficioParcial = 0;
        public boolean permite = true;
        
         
         public void maxBeneficioD(Grafo grafo){
                for(int i=0; i<grafo.grafo.size() ; i++){
                        recorre(grafo, grafo.grafo.get(i));
                        if(maxBeneficioTotal < maxBeneficioParcial){
                                maxBeneficioTotal = maxBeneficioParcial;
                        }
                        grafo.desmarcar();
                }
                 System.out.println("El maximo beneficio del grafo seria: "+maxBeneficioTotal);
        }         
         
         
        public void recorre(Grafo grafo, Vertice vertice){
                if((vertice == null) || (vertice.visitado == true)){
                        return;
                }
                if(permite){
                        if(verifica(grafo,vertice)){
                                maxBeneficioParcial += vertice.beneficio;
                                vertice.marcar = true;
                                System.out.println("Sumo la localidad: "+vertice.nombre);
                        }
                        permite = false;
                }
                else{
                        permite = true;
                 }
                
                vertice.visitado = true;
                for(int i=0 ; i<vertice.listaArcos.size() ; i++){
                        recorre(grafo,grafo.buscarVertice(vertice.listaArcos.get(i).destino));
                }
       }
        
        
        public void marcar(Grafo grafo, Vertice vertice){
                for(int i=0 ; i<vertice.listaArcos.size() ; i++){
                        grafo.buscarVertice(vertice.listaArcos.get(i).destino).visitado = true;
                }
        }
        
        
        public boolean verifica(Grafo grafo, Vertice vertice){
                for(int i=0 ; i<vertice.listaArcos.size() ; i++){
                        if(grafo.buscarVertice(vertice.listaArcos.get(i).destino).marcar)
                                return false;           
                        }
               return true;
    }
}
