
package grafo;

import java.util.ArrayList;


public class Vertice {
    public int beneficio;
    public boolean visitado;
    public boolean marcar;
    public String lugar;
        
    public ArrayList<Arco> listaArcos = new ArrayList<Arco>();
    
    
    public Vertice(int beneficio, String lugar) {
        this.visitado = false;
        this.beneficio = beneficio;
        this.marcar = false;
        this.lugar = lugar;
    }
    
    
    public int getBeneficio(){
        return this.beneficio;
    }
}

