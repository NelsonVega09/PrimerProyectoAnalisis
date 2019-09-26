/**
 * Primer proyecto programado de Analisis de algoritmos
 * Yuliana Rojas y Andrey Vega
 */

package primerproyectoanálisis;
import algoritmos.MaxBeneficio;
import algoritmos.maxBeneficioD;
import algoritmos.cantMaxRest;
import algoritmos.greedy;
import grafo.Grafo;
import java.util.Scanner;

public class PrimerProyectoAnálisis {

    // --Creacion de las variables para analisis
    public static int comp = 0;
    public static int asig = 0;
    public static int lin = 0;
    
    // --Creacion de los grafos
    public static Grafo grafo1 = new Grafo();
    public static Grafo grafo2 = new Grafo();
    public static Grafo grafo3 = new Grafo();
    public static Grafo grafo4 = new Grafo();
    public static Grafo grafo5 = new Grafo();
    public static Grafo grafo6 = new Grafo();

    // --Creacion de la instancia de cada algoritmo
    public static greedy greedy = new greedy();
    public static maxBeneficioD ejerC = new maxBeneficioD();
    public static cantMaxRest cantMaxRest = new cantMaxRest();
    public static MaxBeneficio maxBeneficio = new MaxBeneficio();

    /*
    Esta funcion inserta de manera quemada 
    todos los vertices y arcos de cada grafo
    */
    static void crearGrafos(){
        grafo1.insercionVertices(13, "Santa Clara");
        grafo1.insercionVertices(4, "Florencia");
        grafo1.insercionVertices(9, "Muelle");
        grafo1.insercionVertices(6,"Cerro Cortez");
        grafo1.insercionVertices(8, "Arenal");
        grafo1.insercionVertices(7, "Cutris");

        grafo1.insertarArco("Florencia", "Muelle");
        grafo1.insertarArco("Santa Clara", "Muelle");
        grafo1.insertarArco("Muelle", "Cerro Cortez");
        grafo1.insertarArco("Muelle", "Florencia");
        grafo1.insertarArco("Muelle", "Santa Clara");
        grafo1.insertarArco("Cerro Cortez", "Muelle");
        grafo1.insertarArco("Cerro Cortez", "Cutris");
        grafo1.insertarArco("Cerro Cortez", "Arenal");
        grafo1.insertarArco("Arenal", "Cerro Cortez");
        grafo1.insertarArco("Cutris", "Cerro Cortez");

        grafo2.insercionVertices(9,"Aguaz Zarcas");
        grafo2.insercionVertices(10,"Pital");
        grafo2.insercionVertices(5, "Venecia");
        grafo2.insercionVertices(20,"Rio Cuarto");
        grafo2.insercionVertices(7,"La Tabla");
        grafo2.insercionVertices(3, "Santa Rita");
        grafo2.insercionVertices(12, "La Flor");
        grafo2.insercionVertices(11, "La Merced");
        grafo2.insercionVertices(4, "Santa Isabel");
        grafo2.insercionVertices(8, "San Miguel");

        grafo2.insertarArco("Aguaz Zarcas", "Pital");
        grafo2.insertarArco("Pital", "Aguaz Zarcas");
        grafo2.insertarArco("Pital", "Venecia");
        grafo2.insertarArco("Venecia", "Pital");
        grafo2.insertarArco("Venecia", "Rio Cuarto");
        grafo2.insertarArco("Venecia", "La Tabla");
        grafo2.insertarArco("La Tabla", "Venecia");
        grafo2.insertarArco("La Tabla", "Santa Rita");
        grafo2.insertarArco("La Tabla", "La Merced");
        grafo2.insertarArco("La Tabla", "La Flor");
        grafo2.insertarArco("Santa Rita", "La Tabla");
        grafo2.insertarArco("La Merced", "La Tabla");
        grafo2.insertarArco("La Merced", "Santa Isabel");
        grafo2.insertarArco("La Merced", "San Miguel");
        grafo2.insertarArco("Santa Isabel", "La Merced");
        grafo2.insertarArco("San Miguel", "La Merced");
        grafo2.insertarArco("La Flor", "La Tabla");
        grafo2.insertarArco("Rio Cuarto", "Venecia");

        grafo3.insercionVertices(12,"San Ramon");
        grafo3.insercionVertices(7,"Zarcero");
        grafo3.insercionVertices(6,"Naranjo");
        grafo3.insercionVertices(15,"Ciudad Quesada");
        grafo3.insercionVertices(10,"Aguaz Zarcas");
        grafo3.insercionVertices(11,"Muelle");
        grafo3.insercionVertices(5,"Fortuna");
        grafo3.insercionVertices(14,"Santa Clara");
        grafo3.insercionVertices(4,"Florencia");
        grafo3.insercionVertices(2,"Rio Cuarto");
        grafo3.insercionVertices(8,"Santa Rita");
        grafo3.insercionVertices(1,"Santa Isabel");
        grafo3.insercionVertices(13,"Pital");
        grafo3.insercionVertices(3,"Puerto Escondido");
        grafo3.insercionVertices(9,"Veracruz");

        grafo3.insertarArco("San Ramon", "Zarcero");
        grafo3.insertarArco("Zarcero", "San Ramon");
        grafo3.insertarArco("Zarcero", "Naranjo");
        grafo3.insertarArco("Zarcero", "Ciudad Quesada");
        grafo3.insertarArco("Naranjo", "Zarcero");
        grafo3.insertarArco("Ciudad Quesada", "Zarcero");
        grafo3.insertarArco("Ciudad Quesada", "Aguaz Zarcas");
        grafo3.insertarArco("Aguaz Zarcas", "Ciudad Quesada");
        grafo3.insertarArco("Aguaz Zarcas", "Pital");
        grafo3.insertarArco("Aguaz Zarcas", "Muelle");
        grafo3.insertarArco("Aguaz Zarcas", "Rio Cuarto");
        grafo3.insertarArco("Rio Cuarto", "Santa Rita");
        grafo3.insertarArco("Rio Cuarto", "Aguaz Zarcas");
        grafo3.insertarArco("Santa Rita", "Rio Cuarto");
        grafo3.insertarArco("Santa Rita", "Santa Isabel");
        grafo3.insertarArco("Santa Isabel", "Santa Rita");
        grafo3.insertarArco("Pital", "Aguaz Zarcas");
        grafo3.insertarArco("Pital", "Veracruz");
        grafo3.insertarArco("Pital", "Puerto Escondido");
        grafo3.insertarArco("Veracruz", "Pital");
        grafo3.insertarArco("Puerto Escondido", "Pital");
        grafo3.insertarArco("Muelle", "Aguaz Zarcas");
        grafo3.insertarArco("Muelle", "Fortuna");
        grafo3.insertarArco("Muelle", "Santa Clara");
        grafo3.insertarArco("Fortuna", "Muelle");
        grafo3.insertarArco("Florencia", "Santa Clara");
        grafo3.insertarArco("Santa Clara", "Muelle");
        grafo3.insertarArco("Santa Clara", "Florencia");

        grafo4.insercionVertices(1,"Rio Cuarto");
        grafo4.insercionVertices(2,"Santa Rosa");
        grafo4.insercionVertices(3,"Veracruz");
        grafo4.insercionVertices(4,"Cutris");
        grafo4.insercionVertices(5,"San Gerardo");
        grafo4.insercionVertices(6,"Sucre");
        grafo4.insercionVertices(7,"La Virgen");
        grafo4.insercionVertices(8,"Desamparados");
        grafo4.insercionVertices(9,"Barrio Mexico");
        grafo4.insercionVertices(10,"Pocosol");
        grafo4.insercionVertices(11,"La Palmera");
        grafo4.insercionVertices(12,"Pital");
        grafo4.insercionVertices(13,"Golfito");
        grafo4.insercionVertices(14,"Venado");
        grafo4.insercionVertices(15,"Puerto V");
        grafo4.insercionVertices(16,"Venecia");
        grafo4.insercionVertices(17,"Roomoser");
        grafo4.insercionVertices(18,"Alajuela");
        grafo4.insercionVertices(19,"Moravia");
        grafo4.insercionVertices(20,"Perez Z");

        grafo4.insertarArco("Rio Cuarto","Pital");
        grafo4.insertarArco("Pital","Rio Cuarto");
        grafo4.insertarArco("Pital","Moravia");
        grafo4.insertarArco("Moravia","Pital");
        grafo4.insertarArco("Pital","Venecia");
        grafo4.insertarArco("Venecia","Pital");
        grafo4.insertarArco("Venecia","Cutris");
        grafo4.insertarArco("Cutris","Venecia");
        grafo4.insertarArco("Cutris", "Roomoser");
        grafo4.insertarArco("Roomoser" ,"Cutris");
        grafo4.insertarArco("Cutris","Alajuela");
        grafo4.insertarArco("Alajuela","Cutris");
        grafo4.insertarArco("Alajuela","Venado");
        grafo4.insertarArco("Venado","Alajuela");
        grafo4.insertarArco("Alajuela","Santa Rosa");
        grafo4.insertarArco("Santa Rosa","Alajuela");
        grafo4.insertarArco("Pocosol","Alajuela");
        grafo4.insertarArco("Alajuela","Pocosol");
        grafo4.insertarArco("Roomoser","La Palmera");
        grafo4.insertarArco("La Palmera","Roomoser");
        grafo4.insertarArco("La Palmera","Golfito");
        grafo4.insertarArco("Golfito","La Palmera");
        grafo4.insertarArco("Golfito","Veracruz");
        grafo4.insertarArco("Veracruz","Golfito");
        grafo4.insertarArco("Golfito","Barrio Mexico");
        grafo4.insertarArco("Barrio Mexico","Golfito");
        grafo4.insertarArco("Barrio Mexico","Perez Z");
        grafo4.insertarArco("Perez Z","Barrio Mexico");
        grafo4.insertarArco("Perez Z","Puerto V");
        grafo4.insertarArco("Puerto V","Perez Z");
        grafo4.insertarArco("Perez Z","La Virgen");
        grafo4.insertarArco("La Virgen","Perez Z");
        grafo4.insertarArco("La Virgen","Sucre");
        grafo4.insertarArco("Sucre","La Virgen");
        grafo4.insertarArco("Sucre","San Gerardo");
        grafo4.insertarArco("San Gerardo","Sucre");
        grafo4.insertarArco("Desamparados","Puerto V");
        grafo4.insertarArco("Puerto V","Desamparados");

        grafo5.insercionVertices(1,"Estados Unidos");
        grafo5.insercionVertices(2,"Venezuela");
        grafo5.insercionVertices(3,"Nicaragua");
        grafo5.insercionVertices(4,"El Salvador");
        grafo5.insercionVertices(5,"Argentina");
        grafo5.insercionVertices(6,"Paraguay");
        grafo5.insercionVertices(7,"Mexico");
        grafo5.insercionVertices(8,"Colombia");
        grafo5.insercionVertices(9,"Ecuador");
        grafo5.insercionVertices(10,"Chile");
        grafo5.insercionVertices(11,"Guatemala");
        grafo5.insercionVertices(12,"Surinam");
        grafo5.insercionVertices(13,"Haiti");
        grafo5.insercionVertices(14,"Canda");
        grafo5.insercionVertices(15,"Belice");
        grafo5.insercionVertices(16,"Brasil");
        grafo5.insercionVertices(17,"Panama");
        grafo5.insercionVertices(18,"Guyana Francesa");
        grafo5.insercionVertices(19,"Uruguay");
        grafo5.insercionVertices(20,"Costa Rica");
        grafo5.insercionVertices(21,"Rep. Dominicana <3");
        grafo5.insercionVertices(22,"Honduras");
        grafo5.insercionVertices(23,"Cuba");
        grafo5.insercionVertices(24,"Peru");
        grafo5.insercionVertices(25,"Bolivia");

        grafo5.insertarArco("Estados Unidos","Costa Rica");
        grafo5.insertarArco("Costa Rica", "Estados Unidos");
        grafo5.insertarArco("Costa Rica","Mexico");
        grafo5.insertarArco("Mexico", "Costa Rica");
        grafo5.insertarArco("Costa Rica","Belice");
        grafo5.insertarArco("Belice", "Costa Rica");
        grafo5.insertarArco("Mexico","Canda");
        grafo5.insertarArco("Canda", "Mexico");
        grafo5.insertarArco("Canda","El Salvador");
        grafo5.insertarArco("El Salvador", "Canda");
        grafo5.insertarArco("El Salvador","Guatemala");
        grafo5.insertarArco("Guatemala", "El Salvador");
        grafo5.insertarArco("Belice","Honduras");
        grafo5.insertarArco("Honduras", "Belice");
        grafo5.insertarArco("Honduras","Bolivia");
        grafo5.insertarArco("Bolivia", "Honduras");
        grafo5.insertarArco("Bolivia","Argentina");
        grafo5.insertarArco("Argentina", "Bolivia");
        grafo5.insertarArco("Argentina","Peru");
        grafo5.insertarArco("Peru", "Argentina");
        grafo5.insertarArco("Peru","Chile");
        grafo5.insertarArco("Chile", "Peru");
        grafo5.insertarArco("Peru","Brasil");
        grafo5.insertarArco("Brasil", "Peru");
        grafo5.insertarArco("Peru", "Chile");
        grafo5.insertarArco("Brasil","Colombia");
        grafo5.insertarArco("Colombia", "Brasil");
        grafo5.insertarArco("Colombia","Venezuela");
        grafo5.insertarArco("Venezuela", "Colombia");
        grafo5.insertarArco("Peru","Cuba");
        grafo5.insertarArco("Cuba", "Peru");
        grafo5.insertarArco("Cuba","Surinam");
        grafo5.insertarArco("Surinam", "Cuba");
        grafo5.insertarArco("Cuba","Rep. Dominicana <3");
        grafo5.insertarArco("Rep. Dominicana <3", "Cuba");
        grafo5.insertarArco("Cuba","Nicaragua");
        grafo5.insertarArco("Nicaragua", "Cuba");
        grafo5.insertarArco("Rep. Dominicana <3","Haiti");
        grafo5.insertarArco("Haiti", "Rep. Dominicana <3");
        grafo5.insertarArco("Nicaragua","Ecuador");
        grafo5.insertarArco("Ecuador", "Nicaragua");
        grafo5.insertarArco("Surinam","Guyana Francesa");
        grafo5.insertarArco("Guyana Francesa", "Surinam");
        grafo5.insertarArco("Guyana Francesa","Paraguay");
        grafo5.insertarArco("Paraguay", "Guyana Francesa");
        grafo5.insertarArco("Paraguay","Uruguay");
        grafo5.insertarArco("Uruguay", "Paraguay");
        grafo5.insertarArco("Paraguay","Panama");
        grafo5.insertarArco("Panama", "Paraguay");

        grafo6.insercionVertices(1,"Estados Unidos");
        grafo6.insercionVertices(2,"Venezuela");
        grafo6.insercionVertices(3,"Nicaragua");
        grafo6.insercionVertices(4,"El Salvador");
        grafo6.insercionVertices(5,"Argentina");
        grafo6.insercionVertices(6,"Paraguay");
        grafo6.insercionVertices(7,"Mexico");
        grafo6.insercionVertices(8,"Colombia");
        grafo6.insercionVertices(9,"Ecuador");
        grafo6.insercionVertices(10,"Chile");
        grafo6.insercionVertices(11,"Guatemala");
        grafo6.insercionVertices(12,"Surinam");
        grafo6.insercionVertices(13,"Haiti");
        grafo6.insercionVertices(14,"Canda");
        grafo6.insercionVertices(15,"Belice");
        grafo6.insercionVertices(16,"Brasil");
        grafo6.insercionVertices(17,"Panama");
        grafo6.insercionVertices(18,"Guyana Francesa");
        grafo6.insercionVertices(19,"Uruguay");
        grafo6.insercionVertices(20,"Costa Rica");
        grafo6.insercionVertices(21,"Rep. Dominicana <3");
        grafo6.insercionVertices(22,"Honduras");
        grafo6.insercionVertices(23,"Cuba");
        grafo6.insercionVertices(24,"Peru");
        grafo6.insercionVertices(25,"Bolivia");    

        grafo6.insertarArco("Estados Unidos","Costa Rica");
        grafo6.insertarArco("Costa Rica", "Estados Unidos");
        grafo6.insertarArco("Costa Rica","Mexico");
        grafo6.insertarArco("Mexico", "Costa Rica");
        grafo6.insertarArco("Costa Rica","Belice");
        grafo6.insertarArco("Belice", "Costa Rica");
        grafo5.insertarArco("Mexico","Canda");
        grafo5.insertarArco("Canda", "Mexico");
        grafo6.insertarArco("Canda","El Salvador");
        grafo6.insertarArco("El Salvador", "Canda");
        grafo6.insertarArco("El Salvador","Guatemala");
        grafo6.insertarArco("Guatemala", "El Salvador");
        grafo6.insertarArco("Belice","Honduras");
        grafo6.insertarArco("Honduras", "Belice");
        grafo6.insertarArco("Honduras","Bolivia");
        grafo6.insertarArco("Bolivia", "Honduras");
        grafo6.insertarArco("Bolivia","Argentina");
        grafo6.insertarArco("Argentina", "Bolivia");
        grafo6.insertarArco("Argentina","Peru");
        grafo6.insertarArco("Peru", "Argentina");
        grafo6.insertarArco("Peru","Chile");
        grafo6.insertarArco("Chile", "Peru");
        grafo6.insertarArco("Peru","Brasil");
        grafo6.insertarArco("Brasil", "Peru");
        grafo6.insertarArco("Peru", "Chile");
        grafo6.insertarArco("Brasil","Colombia");
        grafo6.insertarArco("Colombia", "Brasil");
        grafo6.insertarArco("Colombia","Venezuela");
        grafo6.insertarArco("Venezuela", "Colombia");
        grafo6.insertarArco("Peru","Cuba");
        grafo6.insertarArco("Cuba", "Peru");
        grafo6.insertarArco("Cuba","Surinam");
        grafo6.insertarArco("Surinam", "Cuba");
        grafo6.insertarArco("Cuba","Rep. Dominicana <3");
        grafo6.insertarArco("Rep. Dominicana <3", "Cuba");
        grafo6.insertarArco("Cuba","Nicaragua");
        grafo6.insertarArco("Nicaragua", "Cuba");
        grafo6.insertarArco("Rep. Dominicana <3","Haiti");
        grafo6.insertarArco("Haiti", "Rep. Dominicana <3");
        grafo6.insertarArco("Nicaragua","Ecuador");
        grafo6.insertarArco("Ecuador", "Nicaragua");
        grafo6.insertarArco("Surinam","Guyana Francesa");
        grafo6.insertarArco("Guyana Francesa", "Surinam");
        grafo6.insertarArco("Guyana Francesa","Paraguay");
        grafo6.insertarArco("Paraguay", "Guyana Francesa");
        grafo6.insertarArco("Paraguay","Uruguay");
        grafo6.insertarArco("Uruguay", "Paraguay");
        grafo6.insertarArco("Paraguay","Panama");
        grafo6.insertarArco("Panama", "Paraguay");
        grafo6.insertarArco("Estados Unidos","Chile");
        grafo6.insertarArco("Chile","Estados Unidos");
        grafo6.insertarArco("Paraguay","Ecuador");
        grafo6.insertarArco("Ecuador","Paraguay");
    }

    /**
     * Esta funcion desmarca todos los grafos
     */
    static void desmarcar(){
        grafo1.desmarcar();
        grafo2.desmarcar();
        grafo3.desmarcar();
        grafo4.desmarcar();
        grafo5.desmarcar();
        grafo6.desmarcar();    
    }

    /**
     * funcion que llama el algoritmo A con cada uno de los grafos
     */
    static void greedy(){
        System.out.println("Algoritmo de Greedy");
        desmarcar();
        System.out.println("GRAFO 1");
        greedy.greedy(grafo1);
        System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
        System.out.println("GRAFO 2");
        greedy.greedy(grafo2);
        System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
        System.out.println("GRAFO 3");
        greedy.greedy(grafo3);
        System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
        System.out.println("GRAFO 4");
        greedy.greedy(grafo4);
        System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
        System.out.println("GRAFO 5");
        greedy.greedy(grafo5);
    } 
    
    /**
     * funcion que llama el algortimo b con cada uno de los grafos
     */
    static void maximoBeneficioB(){
        System.out.println("Algoritmo B (Maximo Beneficio)");
        desmarcar();
        System.out.println("GRAFO 1");
        maxBeneficio.maxBeneficio(grafo1);
        System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
        System.out.println("GRAFO 2");
        maxBeneficio.maxBeneficio(grafo2);
        System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
        System.out.println("GRAFO 3");
        maxBeneficio.maxBeneficio(grafo3);
        System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
        System.out.println("GRAFO 4");
        maxBeneficio.maxBeneficio(grafo4);
        System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
        System.out.println("GRAFO 5");
        maxBeneficio.maxBeneficio(grafo5);
    } 
    
    /**
     * funcion que llama al algoritmo D con cada uno de los grafos
     */
    static void maximoBeneficioD(){
        desmarcar();
        System.out.println("Algoritmo D (Mayor beneficio)");
        System.out.println("GRAFO 1");
        //maxBeneficioD.maxBeneficioD(grafo1);
        System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
        System.out.println("GRAFO 2");
        //maxBeneficioD.maxBeneficioD(grafo2);
        System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
        System.out.println("GRAFO 3");
        //maxBeneficioD.maxBeneficioD(grafo3);
        System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
        System.out.println("GRAFO 4");
        //maxBeneficioD.maxBeneficioD(grafo4);
        System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
        System.out.println("GRAFO 5");
        //maxBeneficioD.maxBeneficioD(grafo5);
    }
    
    /**
     * Funcion que llama al algortimo C con cada uno de los grafos
     */
    static void maxRest(){
        desmarcar();
        System.out.println("Algoritmo C (Maxima cantidad de restaurantes)");
        System.out.println("GRAFO 1");
        cantMaxRest.cantMaxRest(grafo1);
        System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
        System.out.println("GRAFO 2");
        cantMaxRest.cantMaxRest(grafo2);
        System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
        System.out.println("GRAFO 3");
        cantMaxRest.cantMaxRest(grafo3);
        System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
        System.out.println("GRAFO 4");
        cantMaxRest.cantMaxRest(grafo4);
        System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
        System.out.println("GRAFO 5");
        cantMaxRest.cantMaxRest(grafo5);
    }

    public static void main(String[] args) {
        crearGrafos();
        int opcion = 1;
        while (opcion > 0){
            System.out.println("Eliga un algoritmo o digite 0 para salir");
            System.out.println("    1.Algotirmo A (Greedy)");
            System.out.println("    2.Algortimo B (Maximo beneficio)");
            System.out.println("    3.Algortimo C (Maxima cantidad de restaurantes)");
            System.out.println("    4.Algortimo D (Maximo beneficio)");
            Scanner teclado = new Scanner(System.in);
            opcion = Integer.parseInt(teclado.nextLine());
            if (opcion == 1)
                greedy();
            if (opcion == 2)
                maximoBeneficioB();
            if (opcion == 3)
                maxRest();
            if (opcion == 4)
                maximoBeneficioB();
        }
    }
}
