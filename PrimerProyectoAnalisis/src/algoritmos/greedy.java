package algoritmos;

import grafo.Grafo;
import grafo.Vertice;
import java.util.ArrayList;
import static primerproyectoanálisis.PrimerProyectoAnálisis.asig;
import static primerproyectoanálisis.PrimerProyectoAnálisis.comp;
import static primerproyectoanálisis.PrimerProyectoAnálisis.lin;

public class greedy {
    /**
     * Algoritmo A, de manera voraz indica el mayor beneficio.
     * @param grafoM 
     */
    public void greedy(Grafo grafoM){
        asig+=3;
        lin+=4;
        comp++;
        ArrayList<Vertice> grafo = grafoM.grafo;
        int beneficioTotal = 0; 
        //Recorre el grafo de vertice con mayor beneficio a menor beneficio, 
        //suma el vertice si no tiene vecinos sumados
        for(int i=0 ; i< grafo.size() ; i++){  
            asig++;
            comp+=2;
            lin+=3;
            if(!grafo.get(i).visitado){
                asig+=3;
                lin+=4;
                comp++;
                grafo.get(i).visitado = true;
                beneficioTotal += grafo.get(i).getBeneficio();
                //Recorre todos los vertices vecinos para comprobar
                for(int j=0 ; j<grafo.get(i).listaArcos.size() ; j++){
                    comp++;
                    asig+=2;
                    lin+=3;
                    grafoM.buscarVertice(grafo.get(i).listaArcos.get(j).destino).visitado = true;
                }
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