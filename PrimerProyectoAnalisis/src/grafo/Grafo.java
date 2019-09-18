package grafo;

import java.util.ArrayList;


public class Grafo {
    
    public ArrayList<Vertice> grafo = new ArrayList<Vertice>();
    
    public Grafo() {
    }
    
    
    public void insercionVertices(int beneficio, String lugar){
        Vertice nuevoVertice = new Vertice(beneficio, lugar);
        if(grafo.isEmpty()){
                grafo.add(nuevoVertice);
                return;
        }
        for(int i=0 ; i<grafo.size() ; i++){
                if(nuevoVertice.beneficio > grafo.get(i).beneficio){
                        grafo.add(i, nuevoVertice);
                        return;
                }
        }
        grafo.add(nuevoVertice);
    }
   
    
    public void insertarArco(String lugar, String destino){
        Arco nuevoArco = new Arco(destino);
        Vertice vOrigen = buscarVertice(lugar);
        vOrigen.listaArcos.add(nuevoArco);
    }
    
    
    public Vertice buscarVertice(String lugar){
        for (int i=0; i<grafo.size() ; i++){
            if(grafo.get(i).lugar == lugar)
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
    
    public void imprimir(){
            for(int i=0 ; i<grafo.size() ; i++){
                    System.out.println(grafo.get(i).lugar+" = "+grafo.get(i).beneficio+"     ");
            }
    }
    
    
}
