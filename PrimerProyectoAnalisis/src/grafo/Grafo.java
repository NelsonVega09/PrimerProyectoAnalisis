package grafo;

import java.util.ArrayList;


public class Grafo {
    
    public ArrayList<Vertice> grafo = new ArrayList<>();
    
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
            if(grafo.get(i).nombre == lugar)
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
                    System.out.println(grafo.get(i).nombre+" = "+grafo.get(i).beneficio+"     ");
            }
    }
    
    public void ordenarGrafo(){
        ArrayList<Vertice> grafoOrdenado = new ArrayList<>();
        for(int j = 0; j<grafo.size();j++){
            if(grafoOrdenado.isEmpty())
                grafoOrdenado.add(grafo.get(j));
            else{
                for(int i = 0; i<grafoOrdenado.size(); i++){
                    if(grafo.get(j).listaArcos.size() <= grafoOrdenado.get(i).listaArcos.size())
                        grafoOrdenado.add(i, grafo.get(j));
                    else
                        grafoOrdenado.add(grafo.get(j));
                    break;
                }         
            }        
        }
        this.grafo = grafoOrdenado;
    }
    
     
    
    
}
