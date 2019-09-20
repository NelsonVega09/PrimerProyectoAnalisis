package algoritmos;

import grafo.Grafo;
import grafo.Vertice;
import java.util.ArrayList;

public class greedy {

    public static int comp = 0;
    public static int asig = 0;
    public void greedy(Grafo grafoM){
        asig++;
        ArrayList<Vertice> grafo = grafoM.grafo;
        asig++;
        int beneficioTotal = 0;
        asig++;
        comp++;
        for(int i=0 ; i<grafo.size() ; i++){
            asig++;
            comp+=2;
            if(!grafo.get(i).visitado){
                asig+=2;
                grafo.get(i).visitado = true;
                beneficioTotal += grafo.get(i).getBeneficio();
                asig++;
                comp++;
                for(int j=0 ; j<grafo.get(i).listaArcos.size() ; j++){
                    comp++;
                    asig+=2;
                    grafoM.buscarVertice(grafo.get(i).listaArcos.get(j).destino).visitado = true;
                }
                //System.out.println(grafo.get(i).nombre+" = "+grafo.get(i).beneficio);
            }
        }
        System.out.println("El beneficio total seria: "+ beneficioTotal);
        System.out.println("Asignaciones: "+asig);
        System.out.println("Comparaciones: "+comp);        
        comp=0;
        asig=0;
    }      
}