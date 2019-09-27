package algoritmos;

import grafo.Grafo;
import grafo.Vertice;
import java.util.ArrayList;
import static primerproyectoanálisis.PrimerProyectoAnálisis.asig;
import static primerproyectoanálisis.PrimerProyectoAnálisis.comp;
import static primerproyectoanálisis.PrimerProyectoAnálisis.lin;

public class cantMaxRest {
    /**
     * Calcula la cantidad de restaurantes que es posible seleccionar, 
     * sin importar su beneficio
     * @param grafoM 
     */
    public void cantMaxRest(Grafo grafoM) {
        asig=3;
        lin=4;
        comp=1;
        int cant = 0; 
        ArrayList<Vertice> grafo = grafoM.grafo;
        //Recorre los vertices ordenados por quien tiene 
        //la mayor cantidad de arcos, para asi elegir a quien seleccionar
        for(int i=0 ; i<grafo.size() ; i++){
            comp+=2;
            asig++;
            lin+=3;
            if(!grafo.get(i).visitado){
                asig+=3;
                lin+=4;
                comp++;
                grafo.get(i).visitado = true;
                cant++;
                for(int j=0 ; j < grafo.get(i).listaArcos.size() ; j++){
                    comp++;
                    asig+=2;
                    lin+=3;
                    grafoM.buscarVertice(grafo.get(i).listaArcos.get(j).destino).visitado = true;
                }
            }
        }
        System.out.println("La cantidad maxima de restaurantes es de = "+ cant);
        System.out.println("Asignaciones: "+ asig);
        System.out.println("Comparaciones: "+ comp);
        System.out.println("Lineas de codigo: "+ lin);
        lin=0;
        asig=0;
        comp=0;
    }
}