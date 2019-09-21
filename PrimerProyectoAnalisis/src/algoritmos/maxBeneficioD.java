package algoritmos;

import grafo.Arco;
import grafo.Grafo;
import grafo.Vertice;
import java.util.ArrayList;


public class maxBeneficioD {
    
        public int maxBeneficioTotal = 0;
        public int maxBeneficioParcial = 0;
        public boolean permite = true;
        public String recorrido = "";
        public String recorridoP = "";
        
         
         public void maxBeneficioD(Grafo grafo){
                for(int i=0; i<grafo.grafo.size() ; i++){
                        recorre(grafo, grafo.grafo.get(i));
                        if(maxBeneficioTotal < maxBeneficioParcial){
                                maxBeneficioTotal = maxBeneficioParcial;
                                recorrido = recorridoP;
                        }
                        maxBeneficioParcial = 0;
                        recorridoP = "";
                        grafo.desmarcar();
                }
                System.out.println("El recorrido fue: "+recorrido);
                System.out.println("El maximo beneficio del grafo seria: "+maxBeneficioTotal);
        }         
         
         
        public void recorre(Grafo grafo, Vertice vertice){
                if(vertice.visitado == true){
                        return;
                }
                if(verifica(grafo,vertice)){
                        maxBeneficioParcial += vertice.beneficio;
                        vertice.marcar = true;
                        recorridoP+=(vertice.nombre+" ");
                }
                vertice.visitado = true;
                for(int i=0 ; i<vertice.listaArcos.size() ; i++){
                        recorre(grafo,grafo.buscarVertice(vertice.listaArcos.get(i).destino));
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
