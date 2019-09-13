package algoritmos;

import grafo.Arco;
import grafo.Grafo;
import grafo.Vertice;
import java.util.ArrayList;

public class Algoritmos {

        public int cantRest = 0;
        boolean marcar = true;

        
        
        
    public void desmarcar (){
            cantRest = 0;
            marcar = true;
    }
    
    
    
    public int mayorBeneficio(ArrayList<Vertice> ubicaciones){
        int mayorBeneficio = 0;
        for(int i = 0; i < ubicaciones.size(); i++){
            if (ubicaciones.get(i).beneficio > mayorBeneficio)
                mayorBeneficio = ubicaciones.get(i).beneficio;
        }
        return mayorBeneficio;
    }
 
    
    
    
    
        public void mayorNumRest(Grafo grafo, Vertice tempV){
                if((tempV == null) || (tempV.visitado == true)){
                    return;
                }
                tempV.visitado = true;
                for(int i=0 ; i<tempV.listaArcos.size() ; i++){
                    if(tempV.marcar == false){
                            tempV.marcar = true;
                            if(this.marcar == true){
                                    this.cantRest++;
                            } 
                            if(marcar == true)
                                marcar = false;
                            else
                                marcar = true;
                    }
                    mayorNumRest(grafo, grafo.buscarVertice(tempV.listaArcos.get(i).destino));
                }
        }
        
        
        
        
        public int mayorNumRest2(ArrayList<Vertice> ubicaciones){
                if(ubicaciones.size() == 0)
                        return -1;
                
                int cont = 0;
                boolean marcar = false;
                
                for(int i=0; i<ubicaciones.size() ; i++){
                        if(ubicaciones.get(i).visitado == false){
                                ubicaciones.get(i).visitado = true;
                                if(marcar == false){
                                        cont += ubicaciones.get(i).listaArcos.size();
                                        marcar = true;
                                }else
                                        marcar = false;
                        }
                        
                }
                return cont;    
        }
}