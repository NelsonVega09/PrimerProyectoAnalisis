package algoritmos;

import grafo.Grafo;
import grafo.Vertice;

public class MaxBeneficioRec {

    public int benTotal = 0;
    public void maximoBeneficio(Grafo grafo, Vertice vertice){    
        if((vertice.visitado)&&(esMarcado(grafo,vertice)==false)){
            if(!vertice.marcar){
                 benTotal += vertice.beneficio;
                 vertice.marcar = true;
                 marcar(grafo, vertice);
                 System.out.println(vertice.nombre+"   "+vertice.beneficio);
            }
        }
        if(vertice.visitado){
            return;
        }    
        vertice.visitado = true;
        if(maxBeneficioAux(grafo,vertice)){                  
            benTotal += vertice.beneficio;
            vertice.marcar = true;
            marcar(grafo, vertice);
            System.out.println(vertice.nombre+"   "+vertice.beneficio);
        }                
        for(int i=0 ; i<vertice.listaArcos.size() ; i++){
            maximoBeneficio(grafo,grafo.buscarVertice(vertice.listaArcos.get(i).destino));
        }
    }

    public boolean maxBeneficioAux(Grafo grafo, Vertice vertice){
        int cont = 0;
        boolean siCon = false;
        for(int i=0 ; i<vertice.listaArcos.size() ; i++){
            if(!grafo.buscarVertice(vertice.listaArcos.get(i).destino).visitado)
                cont += grafo.buscarVertice(vertice.listaArcos.get(i).destino).beneficio;
            if(grafo.buscarVertice(vertice.listaArcos.get(i).destino).marcar)
                return false;
            if(grafo.buscarVertice(vertice.listaArcos.get(i).destino).notM)
                siCon = true;
            }
            if(vertice.beneficio >= cont){
                return true;
            }else{
                if(vertice.listaArcos.size() == 1){
                if(siCon)
                    return true;
            }
            return false;
        }
    }

    public void marcar(Grafo grafo, Vertice vertice){
        for(int i=0 ; i<vertice.listaArcos.size() ; i++){
            grafo.buscarVertice(vertice.listaArcos.get(i).destino).notM = true;
        }
    }

    public boolean esMarcado(Grafo grafo, Vertice vertice){
        for(int i=0 ; i<vertice.listaArcos.size() ; i++){
            if(grafo.buscarVertice(vertice.listaArcos.get(i).destino).marcar)
                return true;
        }
        return false;
    }
}
