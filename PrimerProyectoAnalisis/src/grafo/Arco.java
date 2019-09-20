package grafo;

public class Arco {
    public String destino;
    public boolean visitado;

    
    
    public Arco(String destino) {
        this.destino = destino;
        this.visitado = false;
    }
}
