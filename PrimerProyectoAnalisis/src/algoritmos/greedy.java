package algoritmos;

import grafo.Grafo;
import grafo.Vertice;
import java.util.ArrayList;


public class greedy {
        
        
        public void greedy(Grafo grafoM){
                ArrayList<Vertice> grafo = grafoM.grafo;
                int beneficioTotal = 0;
                for(int i=0 ; i<grafo.size() ; i++){
                        if(!grafo.get(i).visitado){
                                grafo.get(i).visitado = true;
                                beneficioTotal += grafo.get(i).getBeneficio();
                                for(int j=0 ; j<grafo.get(i).listaArcos.size() ; j++){
                                        grafoM.buscarVertice(grafo.get(i).listaArcos.get(j).destino).visitado = true;
                                }
                                
                                System.out.println(grafo.get(i).lugar+" = "+grafo.get(i).beneficio);
                        }
                }
                System.out.println("El beneficio total seria = "+ beneficioTotal);
        }
        
}
