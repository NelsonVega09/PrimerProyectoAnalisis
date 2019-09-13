
package grafo;

import java.util.ArrayList;


public class Vertice {
    public int beneficio;
    public boolean visitado;
    public boolean marcar;
        
    public ArrayList<Arco> listaArcos = new ArrayList<Arco>();
    
    
    public Vertice(int beneficio) {
        this.visitado = false;
        this.beneficio = beneficio;
        this.marcar = false;
    }
    
    
    public int getBeneficio(){
        return this.beneficio;
    }
}

