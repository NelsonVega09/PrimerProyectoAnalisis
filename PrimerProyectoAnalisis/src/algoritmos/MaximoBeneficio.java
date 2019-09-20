package algoritmos;

import grafo.Grafo;
import grafo.Vertice;
import java.util.ArrayList;

public class MaximoBeneficio {

    public void PmaximoBeneficio(Grafo grafoM){        
        ArrayList<Vertice> grafo = grafoM.grafo;
        int beneficioTotal = 0;
        for(int i=0 ; i< grafo.size() ; i++){            
            if(!grafo.get(i).visitado){
                int sumaArcos = 0;
                for(int j=0 ; j< grafo.get(i).listaArcos.size() ; j++){
                    if(grafoM.buscarVertice(grafo.get(i).listaArcos.get(j).destino).visitado = false)
                        sumaArcos += grafoM.buscarVertice(grafo.get(i).listaArcos.get(j).destino).beneficio;
                }
                if(sumaArcos<grafo.get(i).beneficio){
                   grafo.get(i).visitado = true;
                   beneficioTotal += grafo.get(i).beneficio;
                    for(int j=0 ; j< grafo.get(i).listaArcos.size() ; j++){
                        grafoM.buscarVertice(grafo.get(i).listaArcos.get(j).destino).visitado = true;
                    }
                }
                else{

                    grafo.get(i).visitado = true;
                    
//BIEN
                    for(int j=0 ; j< grafo.get(i).listaArcos.size() ; j++){
                        Vertice tempV = grafoM.buscarVertice(grafo.get(i).listaArcos.get(j).destino);
                        
                        int sumaArcos2 = 0;
                                    
                        for(int f = 0 ; f < tempV.listaArcos.size() ; f++){                            
                            if(!tempV.listaArcos.get(f).visitado){
                            sumaArcos2 += grafoM.buscarVertice(tempV.listaArcos.get(f).destino).beneficio;
                        }
                        if(sumaArcos2 < tempV.beneficio){
                            beneficioTotal += tempV.beneficio;
                            grafoM.buscarVertice(grafo.get(i).listaArcos.get(j).destino).visitado = true;
                            //for(int final = 0 ; final < tempV.listaArcos.size() ; final++){                           
                               // tempV.listaArcos.get(f).visitado = true;
                        //}
                        }
                        
                }
                }
                
                
                
                
                
                
                
                grafo.get(i).visitado = true;
                beneficioTotal += grafo.get(i).getBeneficio();
                for(int j=0 ; j<grafo.get(i).listaArcos.size() ; j++){
                        grafoM.buscarVertice(grafo.get(i).listaArcos.get(j).destino).visitado = true;
                }
                System.out.println(grafo.get(i).nombre+" = "+grafo.get(i).beneficio);
            }
        }
        System.out.println("El beneficio total seria = "+ beneficioTotal);
    } 
        
    }    
    
    public void maximoBeneficio(Grafo grafoU){        
        ArrayList<Vertice> grafo = grafoU.grafo;
        int beneficioTotal = 0;
        for(int i=0 ; i< grafo.size() ; i++){            
            if(!grafo.get(i).visitado){
                grafoU.grafo.get(i).visitado = true;
                if(vecinos(grafoU,grafo.get(i))){
                    if(maximoBeneficioAux(grafoU,grafo.get(i))>grafo.get(i).beneficio){
                        for(int j=0 ; j< grafo.get(i).listaArcos.size() ; j++){                           
                            int suma = maximoBeneficioAux(grafoU,grafoU.buscarVertice(grafo.get(i).listaArcos.get(j).destino));
                            if(suma < grafo.get(i).beneficio){ 
                                beneficioTotal += grafo.get(i).beneficio;
                                System.out.println(grafo.get(i).nombre);
                            }
                            else{
                                beneficioTotal+=suma;
                            }
                        }
                    }
                    else{
                        System.out.println(grafo.get(i).nombre + " = " + grafo.get(i).beneficio);
                        beneficioTotal+= grafo.get(i).beneficio;  
                    }
                }
            }
        }
        System.out.println("El beneficio total seria = " + beneficioTotal);
    }

    public static int maximoBeneficioAux(Grafo grafo, Vertice vertice){
        int sumaArcos = 0;
        for(int i = 0 ; i < vertice.listaArcos.size() ; i++){
            if(!grafo.buscarVertice(vertice.listaArcos.get(i).destino).visitado){
                sumaArcos += grafo.buscarVertice(vertice.listaArcos.get(i).destino).beneficio;
                grafo.buscarVertice(vertice.listaArcos.get(i).destino).visitado = true;
            }
        }
        return sumaArcos; //los arcos son mayores que el vertice               
    }
    
    public static boolean vecinos(Grafo grafo, Vertice vertice){
        for(int i = 0 ; i < vertice.listaArcos.size() ; i++){
            if(grafo.buscarVertice(vertice.listaArcos.get(i).destino).visitado)
               return false;
        }
        return true; //no tiene vecinos ocupados               
    }
}
    


