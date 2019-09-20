package algoritmos;

import grafo.Grafo;
import grafo.Vertice;
import java.util.ArrayList;

public class cantMaxRest {
    
    public static int comp = 0;
    public static int asig = 0;
    
    public void cantMaxRest(Grafo grafoM) {
        asig+=3;
        int cant = 0; 
        ArrayList<Vertice> grafo = grafoM.grafo;
        comp++;
        for(int i=0 ; i<grafo.size() ; i++){
            comp+=2;
            asig++;
            if(!grafo.get(i).visitado){
                asig+=3;
                grafo.get(i).visitado = true;
                cant++;
                comp++;
                for(int j=0 ; j<grafo.get(i).listaArcos.size() ; j++){
                    comp++;
                    asig+=2;
                    grafoM.buscarVertice(grafo.get(i).listaArcos.get(j).destino).visitado = true;
                }
                //System.out.println(grafo.get(i).nombre);
            }
        }
        System.out.println("La cantidad maxima de restaurantes es de = "+ cant);
        System.out.println("Asignaciones: "+asig);
        System.out.println("Comparaciones: "+comp);
    }

}