package grafo;

import java.util.ArrayList;


public class Grafo {
    
    public ArrayList<Vertice> grafo = new ArrayList<Vertice>();
    
    public Grafo() {
    }
    
    
    public void insercionVertices(int beneficio){
        Vertice nuevoVertice = new Vertice(beneficio);
        grafo.add(nuevoVertice);
    }
   
    
    public void insertarArco(int origen, int destino){
        Arco nuevoArco = new Arco(destino);
        Vertice vOrigen = buscarVertice(origen);
        vOrigen.listaArcos.add(nuevoArco);
    }
    
    
    public Vertice buscarVertice(int beneficio){
        for (int i=0; i<grafo.size() ; i++){
            if(grafo.get(i).beneficio == beneficio)
                return grafo.get(i);
        }
        return null;
    }

    
    public void desmarcar(){
        for (int i=0; i<grafo.size() ; i++){
                grafo.get(i).visitado = false;
                grafo.get(i).marcar = false;
                for(int e=0 ; e < grafo.get(i).listaArcos.size() ; e++){
                        grafo.get(i).listaArcos.get(e).visitado = false;
                }
        }
    }
    
    
}
