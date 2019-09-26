package algoritmos;

import grafo.Grafo;
import grafo.Vertice;
import static primerproyectoanálisis.PrimerProyectoAnálisis.asig;
import static primerproyectoanálisis.PrimerProyectoAnálisis.comp;
import static primerproyectoanálisis.PrimerProyectoAnálisis.lin;

public class MaxBeneficioRec {

    public int benTotal = 0;
    
    /**
     * 
     * @param grafo 
     */
    public void maxBeneficioRec(Grafo grafo){
        lin = 0;
        comp =0;
        asig = 0;
        maximoBeneficio(grafo,grafo.grafo.get(0));
        //System.out.println("Maximo beneficio:" + benTotal); 
        System.out.println("Asignaciones:" + asig); 
        System.out.println("Comparaciones:" + comp); 
        System.out.println("Lineas de codigo ejecutadas:" + lin); 
        benTotal = 0;
        lin = 0;
        comp = 0;
        asig = 0;
    }
    /**
     * 
     * @param grafo
     * @param vertice 
     */
    public void maximoBeneficio(Grafo grafo, Vertice vertice){    
        lin++;
        comp+=2;
        if((vertice.visitado)&&(esMarcado(grafo,vertice)==false)){
            lin++;
            comp++;
            if(!vertice.marcar){
                lin+=3;
                asig=+2;
                benTotal += vertice.beneficio;
                 vertice.marcar = true;
                 marcar(grafo, vertice);
                //System.out.print(", " + vertice.nombre);
            }
        }
        lin++;
        comp++;
        if(vertice.visitado){
            lin++;
            return;
        }    
        lin++;
        asig++;
        vertice.visitado = true;
        lin++;
        comp++;
        if(maxBeneficioAux(grafo,vertice)){                  
            lin+=3;
            asig+=2;
            benTotal += vertice.beneficio;
            vertice.marcar = true;
            marcar(grafo, vertice);
            //System.out.println(vertice.nombre+"   "+vertice.beneficio);
        } 
        lin++;
        comp++;
        asig+=2;
        for(int i=0 ; i<vertice.listaArcos.size() ; i++){
            asig++;
            comp++;
            lin++;
            maximoBeneficio(grafo,grafo.buscarVertice(vertice.listaArcos.get(i).destino));
        }
    }
    /**
     * 
     * @param grafo
     * @param vertice
     * @return 
     */
    public boolean maxBeneficioAux(Grafo grafo, Vertice vertice){
        lin+=3;
        asig+=4;
        int cont = 0;
        boolean siCon = false;
        comp++;
        for(int i=0 ; i<vertice.listaArcos.size() ; i++){
            comp+=2;
            lin++;
            if(!grafo.buscarVertice(vertice.listaArcos.get(i).destino).visitado){
                asig++;
                cont += grafo.buscarVertice(vertice.listaArcos.get(i).destino).beneficio;
                lin++;
            }
            lin++;
            comp++;
            if(grafo.buscarVertice(vertice.listaArcos.get(i).destino).marcar){
                lin++;
                return false;
            }
            lin++;
            comp++;
            if(grafo.buscarVertice(vertice.listaArcos.get(i).destino).notM){
                lin++;
                asig++;
                siCon = true;
            }
        }
        lin++;
        comp++;
        if(vertice.beneficio >= cont){
            lin++;
            return true; 
        }else{
            lin++;
            comp++;
            if(vertice.listaArcos.size() == 1){
                lin++;
                comp++;
                if(siCon)
                    lin++;
                    return true;
            }
            lin++;
            return false;
        }
    }
    /**
     * 
     * @param grafo
     * @param vertice 
     */
    public void marcar(Grafo grafo, Vertice vertice){
        lin++;
        comp++;
        for(int i=0 ; i<vertice.listaArcos.size() ; i++){
            comp++;
            lin++;
            asig++;
            grafo.buscarVertice(vertice.listaArcos.get(i).destino).notM = true;
        }
    }
    /**
     * 
     * @param grafo
     * @param vertice
     * @return 
     */
    public boolean esMarcado(Grafo grafo, Vertice vertice){
        lin++;
        comp++;
        asig+=2;
        for(int i=0 ; i<vertice.listaArcos.size() ; i++){
            asig++;
            comp+=2;
            lin++;
            if(grafo.buscarVertice(vertice.listaArcos.get(i).destino).marcar){
                lin++;
                return true;
            }
        }
        lin++;
        return false;
    }
}
