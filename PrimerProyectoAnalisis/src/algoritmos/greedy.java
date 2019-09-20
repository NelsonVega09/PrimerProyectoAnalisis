package algoritmos;

import grafo.Grafo;
import grafo.Vertice;
import java.util.ArrayList;

public class greedy {

    public static int comp = 0;
    public static int asig = 0;
    public static int lin = 0;
    
    public void greedy(Grafo grafoM){
        asig++;
        lin++;
        ArrayList<Vertice> grafo = grafoM.grafo;
        asig++;
        lin++;
        int beneficioTotal = 0;
        asig++;
        comp++;
        lin++;
        for(int i=0 ; i<grafo.size() ; i++){
            asig++;
            comp+=2;
            lin++;
            if(!grafo.get(i).visitado){
                asig+=2;
                lin++;
                grafo.get(i).visitado = true;
                lin++;
                beneficioTotal += grafo.get(i).getBeneficio();
                asig++;
                comp++;
                lin++;
                for(int j=0 ; j<grafo.get(i).listaArcos.size() ; j++){
                    comp++;
                    asig+=2;
                    lin++;
                    grafoM.buscarVertice(grafo.get(i).listaArcos.get(j).destino).visitado = true;
                }
                //System.out.println(grafo.get(i).nombre+" = "+grafo.get(i).beneficio);
            }
        }
        System.out.println("El beneficio total seria: "+ beneficioTotal);
        System.out.println("Asignaciones: " + asig);
        System.out.println("Comparaciones: " + comp); 
        System.out.println("Linead de codigo: " + lin); 
        comp=0;
        asig=0;
        lin=0;
    }      
}