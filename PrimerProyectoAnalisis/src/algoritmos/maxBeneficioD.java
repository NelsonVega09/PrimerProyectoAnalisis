package algoritmos;
import grafo.Grafo;
import grafo.Vertice;
import static primerproyectoanálisis.PrimerProyectoAnálisis.asig;
import static primerproyectoanálisis.PrimerProyectoAnálisis.comp;
import static primerproyectoanálisis.PrimerProyectoAnálisis.lin;

public class maxBeneficioD {
    
    public static int maxBeneficioTotal = 0;
    public static int maxBeneficioParcial = 0;
    public static boolean permite = true;
    public static String recorrido = "";
    public static String recorridoP = "";
    
    /**
     * 
     * @param grafo 
     */
    public static void maxBeneficioD(Grafo grafo){
        lin = 0;
        comp =0;
        asig = 0;
        lin++;
        comp++;
        asig+=2;
        for(int i=0; i<grafo.grafo.size() ; i++){
            comp++;
            lin+=2;
            asig+=2;
            recorre(grafo, grafo.grafo.get(i));
            comp++;
            if(maxBeneficioTotal < maxBeneficioParcial){
                lin+=2;
                asig+=2;
                maxBeneficioTotal = maxBeneficioParcial;
                //recorrido = recorridoP;
            }
            lin+=3;
            asig+=2;
            maxBeneficioParcial = 0;
            //recorridoP = "";
            grafo.desmarcar();
        }
        System.out.println("El recorrido fue: "+recorrido);
        System.out.println("El maximo beneficio del grafo seria: "+ maxBeneficioTotal);
        System.out.println("Asignaciones:" + asig); 
        System.out.println("Comparaciones:" + comp); 
        System.out.println("Lineas de codigo ejecutadas:" + lin); 
    }         
    
    /**
     * 
     * @param grafo
     * @param vertice 
     */
    public static void recorre(Grafo grafo, Vertice vertice){
        lin++;
        comp++;
        if(vertice.visitado == true){
            lin++;
            return;
        }
        lin++;
        comp++;
        if(verifica(grafo,vertice)){
            lin+=3;
            asig+=3;
            maxBeneficioParcial += vertice.beneficio;
            vertice.marcar = true;
            recorridoP+=(vertice.nombre+" ");
        }
        lin+=2;
        vertice.visitado = true;
        comp++;
        asig++;
        for(int i=0 ; i<vertice.listaArcos.size() ; i++){
            lin++;
            comp++;
            recorre(grafo,grafo.buscarVertice(vertice.listaArcos.get(i).destino));
        }
    }
      
    /**
     * 
     * @param grafo
     * @param vertice
     * @return 
     */
    public static boolean verifica(Grafo grafo, Vertice vertice){
        lin++;
        comp++;
        asig+=2;
        for(int i=0 ; i<vertice.listaArcos.size() ; i++){
            asig++;
            comp+=2;
            lin+=2;
            if(grafo.buscarVertice(vertice.listaArcos.get(i).destino).marcar){
                lin++;
                return false;           
            }
        }
        lin++;
        return true;      
    }
}
