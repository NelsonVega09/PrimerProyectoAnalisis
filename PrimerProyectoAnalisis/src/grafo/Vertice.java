
package grafo;

import java.util.ArrayList;


public class Vertice {
    public int beneficio;
    public boolean visitado;
    public boolean marcar;
    public String nombre;
        
    public ArrayList<Arco> listaArcos = new ArrayList<Arco>();
    
    
    public Vertice(int beneficio, String lugar) {
        this.visitado = false;
        this.beneficio = beneficio;
        this.marcar = false;
        this.nombre = lugar;
    }
    
    
    public int getBeneficio(){
        return this.beneficio;
    }
}

