package grafo;

public class Arco {
    public int destino;
    public boolean visitado;

    
    
    public Arco(int destino) {
        this.destino = destino;
        this.visitado = false;
    }
}
