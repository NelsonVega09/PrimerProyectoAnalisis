package algoritmos;

import grafo.Grafo;
import grafo.Vertice;
import java.util.ArrayList;


public class cantMaxRest {
    
    public void cantMaxRest(Grafo grafoM) {
        int cant = 0; 
        ArrayList<Vertice> grafo = grafoM.grafo;
        for(int i=0 ; i<grafo.size() ; i++){
            if(!grafo.get(i).visitado){
                grafo.get(i).visitado = true;
                cant++;
                for(int j=0 ; j<grafo.get(i).listaArcos.size() ; j++){
                        grafoM.buscarVertice(grafo.get(i).listaArcos.get(j).destino).visitado = true;
                }
                System.out.println(grafo.get(i).nombre);
            }
        }
        System.out.println("La cantidad maxima de restaurantes es de = "+ cant);
    }

}
