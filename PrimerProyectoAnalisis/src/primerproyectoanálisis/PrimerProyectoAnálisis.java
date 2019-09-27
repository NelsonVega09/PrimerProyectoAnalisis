/**
 * Primer proyecto programado de Analisis de algoritmos
 * Yuliana Rojas y Andrey Vega
 */

package primerproyectoanálisis;
import algoritmos.MaxBeneficioRec;
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
    public static Grafo grafo1 = new Grafo(); //6 nodos
    public static Grafo grafo2 = new Grafo(); //10 nodos
    public static Grafo grafo3 = new Grafo(); //15 nodos
    public static Grafo grafo4 = new Grafo(); //20 nodos
    public static Grafo grafo5 = new Grafo(); //25 nodos
    public static Grafo grafo6 = new Grafo(); //25 nodos    ciclico
    public static Grafo grafo7 = new Grafo(); //10 nodos    ciclico
    public static Grafo grafo8 = new Grafo(); //6 nodos     ciclico
    public static Grafo grafo9 = new Grafo(); //15 nodos    ciclicos
    public static Grafo grafo10 = new Grafo(); //20 nodos   ciclicos
    public static Grafo grafo11 = new Grafo(); //50 nodos
    public static Grafo grafo12 = new Grafo(); //40 nodos
    public static Grafo grafo13 = new Grafo(); //100 nodos
    
    // --Creacion de la instancia de cada algoritmo
    public static greedy greedy = new greedy();
    public static maxBeneficioD ejerC = new maxBeneficioD();
    public static cantMaxRest cantMaxRest = new cantMaxRest();
    public static MaxBeneficioRec maxBeneficioRec = new MaxBeneficioRec();

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

        grafo1.insertarArco("Florencia",    "Muelle");
        grafo1.insertarArco("Santa Clara",  "Muelle");
        grafo1.insertarArco("Muelle",       "Cerro Cortez");
        grafo1.insertarArco("Muelle",       "Florencia");
        grafo1.insertarArco("Muelle",       "Santa Clara");
        grafo1.insertarArco("Cerro Cortez", "Muelle");
        grafo1.insertarArco("Cerro Cortez", "Cutris");
        grafo1.insertarArco("Cerro Cortez", "Arenal");
        grafo1.insertarArco("Arenal",       "Cerro Cortez");
        grafo1.insertarArco("Cutris",       "Cerro Cortez");

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
        grafo6.insertarArco("Mexico","Canda");
        grafo6.insertarArco("Canda", "Mexico");
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
        
        grafo7.insercionVertices(9,"Aguaz Zarcas");
        grafo7.insercionVertices(10,"Pital");
        grafo7.insercionVertices(5, "Venecia");
        grafo7.insercionVertices(20,"Rio Cuarto");
        grafo7.insercionVertices(7,"La Tabla");
        grafo7.insercionVertices(3, "Santa Rita");
        grafo7.insercionVertices(12, "La Flor");
        grafo7.insercionVertices(11, "La Merced");
        grafo7.insercionVertices(4, "Santa Isabel");
        grafo7.insercionVertices(8, "San Miguel");

        grafo7.insertarArco("Aguaz Zarcas", "Pital");
        grafo7.insertarArco("Pital", "Aguaz Zarcas");
        grafo7.insertarArco("Aguaz Zarcas", "Santa Rita");
        grafo7.insertarArco("Santa Rita", "Aguaz Zarcas");
        grafo7.insertarArco("Pital", "Venecia");
        grafo7.insertarArco("Venecia", "Pital");
        grafo7.insertarArco("Venecia", "Rio Cuarto");
        grafo7.insertarArco("Venecia", "La Tabla");
        grafo7.insertarArco("La Tabla", "Venecia");
        grafo7.insertarArco("La Tabla", "Santa Rita");
        grafo7.insertarArco("La Tabla", "La Merced");
        grafo7.insertarArco("La Tabla", "La Flor");
        grafo7.insertarArco("Santa Rita", "La Tabla");
        grafo7.insertarArco("La Merced", "La Tabla");
        grafo7.insertarArco("La Merced", "Santa Isabel");
        grafo7.insertarArco("La Merced", "San Miguel");
        grafo7.insertarArco("Santa Isabel", "La Merced");
        grafo7.insertarArco("San Miguel", "La Merced");
        grafo7.insertarArco("Santa Isabel", "San Miguel");
        grafo7.insertarArco("San Miguel", "Santa Isabel");
        grafo7.insertarArco("La Flor", "La Tabla");
        grafo7.insertarArco("Rio Cuarto", "Venecia");
        
        grafo8.insercionVertices(13, "Santa Clara");
        grafo8.insercionVertices(4, "Florencia");
        grafo8.insercionVertices(9, "Muelle");
        grafo8.insercionVertices(6,"Cerro Cortez");
        grafo8.insercionVertices(8, "Arenal");
        grafo8.insercionVertices(7, "Cutris");

        grafo8.insertarArco("Florencia", "Muelle");
        grafo8.insertarArco("Santa Clara", "Muelle");
        grafo8.insertarArco("Muelle", "Cerro Cortez");
        grafo8.insertarArco("Muelle", "Florencia");
        grafo8.insertarArco("Muelle", "Santa Clara");
        grafo8.insertarArco("Cerro Cortez", "Muelle");
        grafo8.insertarArco("Cerro Cortez", "Cutris");
        grafo8.insertarArco("Cerro Cortez", "Arenal");
        grafo8.insertarArco("Arenal", "Cerro Cortez");
        grafo8.insertarArco("Cutris", "Cerro Cortez");
        grafo8.insertarArco("Cutris", "Arenal");
        grafo8.insertarArco("Arenal", "Cutris");
        grafo8.insertarArco("Santa Clara", "Cutris");
        grafo8.insertarArco("Cutris", "Santa Clara");

        grafo9.insercionVertices(12,"San Ramon");
        grafo9.insercionVertices(7,"Zarcero");
        grafo9.insercionVertices(6,"Naranjo");
        grafo9.insercionVertices(10,"Ciudad Quesada");
        grafo9.insercionVertices(15,"Aguaz Zarcas");
        grafo9.insercionVertices(11,"Muelle");
        grafo9.insercionVertices(5,"Fortuna");
        grafo9.insercionVertices(14,"Santa Clara");
        grafo9.insercionVertices(4,"Florencia");
        grafo9.insercionVertices(2,"Rio Cuarto");
        grafo9.insercionVertices(8,"Santa Rita");
        grafo9.insercionVertices(1,"Santa Isabel");
        grafo9.insercionVertices(13,"Pital");
        grafo9.insercionVertices(3,"Puerto Escondido");
        grafo9.insercionVertices(9,"Veracruz");

        grafo9.insertarArco("San Ramon", "Zarcero");
        grafo9.insertarArco("Zarcero", "San Ramon");
        grafo9.insertarArco("Zarcero", "Naranjo");
        grafo9.insertarArco("Zarcero", "Ciudad Quesada");
        grafo9.insertarArco("Naranjo", "Zarcero");
        grafo9.insertarArco("Ciudad Quesada", "Zarcero");
        grafo9.insertarArco("Ciudad Quesada", "Aguaz Zarcas");
        grafo9.insertarArco("Aguaz Zarcas", "Ciudad Quesada");
        grafo9.insertarArco("Aguaz Zarcas", "Pital");
        grafo9.insertarArco("Aguaz Zarcas", "Muelle");
        grafo9.insertarArco("Aguaz Zarcas", "Rio Cuarto");
        grafo9.insertarArco("Rio Cuarto", "Santa Rita");
        grafo9.insertarArco("Rio Cuarto", "Aguaz Zarcas");
        grafo9.insertarArco("Santa Rita", "Rio Cuarto");
        grafo9.insertarArco("Santa Rita", "Santa Isabel");
        grafo9.insertarArco("Santa Isabel", "Santa Rita");
        grafo9.insertarArco("Pital", "Aguaz Zarcas");
        grafo9.insertarArco("Pital", "Veracruz");
        grafo9.insertarArco("Pital", "Puerto Escondido");
        grafo9.insertarArco("Veracruz", "Pital");
        grafo9.insertarArco("Puerto Escondido", "Pital");
        grafo9.insertarArco("Muelle", "Aguaz Zarcas");
        grafo9.insertarArco("Muelle", "Fortuna");
        grafo9.insertarArco("Muelle", "Santa Clara");
        grafo9.insertarArco("Fortuna", "Muelle");
        grafo9.insertarArco("Florencia", "Santa Clara");
        grafo9.insertarArco("Santa Clara", "Muelle");
        grafo9.insertarArco("Santa Clara", "Florencia");
        grafo9.insertarArco("San Ramon", "Fortuna");
        grafo9.insertarArco("Fortuna", "San Ramon");
        grafo9.insertarArco("Ciudad Quesada", "Veracruz");
        grafo9.insertarArco("Veracruz", "Ciudad Quesada");
        grafo9.insertarArco("Pital", "Santa Isabel");
        grafo9.insertarArco("Santa Isabel", "Pital");

        grafo10.insercionVertices(1,"Rio Cuarto");
        grafo10.insercionVertices(2,"Santa Rosa");
        grafo10.insercionVertices(3,"Veracruz");
        grafo10.insercionVertices(4,"Cutris");
        grafo10.insercionVertices(5,"San Gerardo");
        grafo10.insercionVertices(6,"Sucre");
        grafo10.insercionVertices(7,"La Virgen");
        grafo10.insercionVertices(8,"Desamparados");
        grafo10.insercionVertices(9,"Barrio Mexico");
        grafo10.insercionVertices(10,"Pocosol");
        grafo10.insercionVertices(11,"La Palmera");
        grafo10.insercionVertices(12,"Pital");
        grafo10.insercionVertices(13,"Golfito");
        grafo10.insercionVertices(14,"Venado");
        grafo10.insercionVertices(15,"Puerto V");
        grafo10.insercionVertices(16,"Venecia");
        grafo10.insercionVertices(17,"Roomoser");
        grafo10.insercionVertices(18,"Alajuela");
        grafo10.insercionVertices(19,"Moravia");
        grafo10.insercionVertices(20,"Perez Z");

        grafo10.insertarArco("Rio Cuarto","Pital");
        grafo10.insertarArco("Pital","Rio Cuarto");
        grafo10.insertarArco("Pital","Moravia");
        grafo10.insertarArco("Moravia","Pital");
        grafo10.insertarArco("Pital","Venecia");
        grafo10.insertarArco("Venecia","Pital");
        grafo10.insertarArco("Venecia","Cutris");
        grafo10.insertarArco("Cutris","Venecia");
        grafo10.insertarArco("Cutris", "Roomoser");
        grafo10.insertarArco("Roomoser" ,"Cutris");
        grafo10.insertarArco("Cutris","Alajuela");
        grafo10.insertarArco("Alajuela","Cutris");
        grafo10.insertarArco("Alajuela","Venado");
        grafo10.insertarArco("Venado","Alajuela");
        grafo10.insertarArco("Alajuela","Santa Rosa");
        grafo10.insertarArco("Santa Rosa","Alajuela");
        grafo10.insertarArco("Roomoser","La Palmera");
        grafo10.insertarArco("La Palmera","Roomoser");
        grafo10.insertarArco("La Palmera","Golfito");
        grafo10.insertarArco("Golfito","La Palmera");
        grafo10.insertarArco("Golfito","Veracruz");
        grafo10.insertarArco("Veracruz","Golfito");
        grafo10.insertarArco("Golfito","Barrio Mexico");
        grafo10.insertarArco("Barrio Mexico","Golfito");
        grafo10.insertarArco("Barrio Mexico","Perez Z");
        grafo10.insertarArco("Perez Z","Barrio Mexico");
        grafo10.insertarArco("Perez Z","Puerto V");
        grafo10.insertarArco("Puerto V","Perez Z");
        grafo10.insertarArco("Perez Z","La Virgen");
        grafo10.insertarArco("La Virgen","Perez Z");
        grafo10.insertarArco("La Virgen","Sucre");
        grafo10.insertarArco("Sucre","La Virgen");
        grafo10.insertarArco("Sucre","San Gerardo");
        grafo10.insertarArco("San Gerardo","Sucre");
        grafo10.insertarArco("Desamparados","Puerto V");
        grafo10.insertarArco("Puerto V","Desamparados");
        grafo10.insertarArco("Desamparados","San Gerardo");
        grafo10.insertarArco("San Gerardo","Desamparados");
        grafo10.insertarArco("Puerto V","Pocosol");
        grafo10.insertarArco("Pocosol","Puerto V");
        grafo10.insertarArco("Moravia","Venado");
        grafo10.insertarArco("Venado","Moravia");

        grafo11.insercionVertices(1,"Estados Unidos");
        grafo11.insercionVertices(2,"Venezuela");
        grafo11.insercionVertices(3,"Nicaragua");
        grafo11.insercionVertices(4,"El Salvador");
        grafo11.insercionVertices(5,"Argentina");
        grafo11.insercionVertices(6,"Paraguay");
        grafo11.insercionVertices(7,"Mexico");
        grafo11.insercionVertices(8,"Colombia");
        grafo11.insercionVertices(9,"Ecuador");
        grafo11.insercionVertices(10,"Chile");
        grafo11.insercionVertices(11,"Guatemala");
        grafo11.insercionVertices(12,"Surinam");
        grafo11.insercionVertices(13,"Haiti");
        grafo11.insercionVertices(14,"Canda");
        grafo11.insercionVertices(15,"Belice");
        grafo11.insercionVertices(16,"Brasil");
        grafo11.insercionVertices(17,"Panama");
        grafo11.insercionVertices(18,"Guyana Francesa");
        grafo11.insercionVertices(19,"Uruguay");
        grafo11.insercionVertices(20,"Costa Rica");
        grafo11.insercionVertices(21,"Rep. Dominicana <3");
        grafo11.insercionVertices(22,"Honduras");
        grafo11.insercionVertices(23,"Cuba");
        grafo11.insercionVertices(24,"Peru");
        grafo11.insercionVertices(25,"Bolivia");
        grafo11.insercionVertices(12,"Estados Unidos2");
        grafo11.insercionVertices(22,"Venezuela2");
        grafo11.insercionVertices(32,"Nicaragua2");
        grafo11.insercionVertices(42,"El Salvador2");
        grafo11.insercionVertices(52,"Argentina2");
        grafo11.insercionVertices(62,"Paraguay2");
        grafo11.insercionVertices(72,"Mexico2");
        grafo11.insercionVertices(82,"Colombia2");
        grafo11.insercionVertices(92,"Ecuador2");
        grafo11.insercionVertices(102,"Chile2");
        grafo11.insercionVertices(112,"Guatemala2");
        grafo11.insercionVertices(122,"Surinam2");
        grafo11.insercionVertices(132,"Haiti2");
        grafo11.insercionVertices(142,"Canda2");
        grafo11.insercionVertices(152,"Belice2");
        grafo11.insercionVertices(162,"Brasil2");
        grafo11.insercionVertices(172,"Panama2");
        grafo11.insercionVertices(182,"Guyana Francesa2");
        grafo11.insercionVertices(192,"Uruguay2");
        grafo11.insercionVertices(202,"Costa Rica2");
        grafo11.insercionVertices(212,"Rep. Dominicana <32");
        grafo11.insercionVertices(222,"Honduras2");
        grafo11.insercionVertices(232,"Cuba2");
        grafo11.insercionVertices(242,"Peru2");
        grafo11.insercionVertices(252,"Bolivia2");
        
        grafo11.insertarArco("Estados Unidos","Costa Rica");
        grafo11.insertarArco("Costa Rica", "Estados Unidos");
        grafo11.insertarArco("Costa Rica","Mexico");
        grafo11.insertarArco("Mexico", "Costa Rica");
        grafo11.insertarArco("Costa Rica","Belice");
        grafo11.insertarArco("Belice", "Costa Rica");
        grafo11.insertarArco("Mexico","Canda");
        grafo11.insertarArco("Canda", "Mexico");
        grafo11.insertarArco("Canda","El Salvador");
        grafo11.insertarArco("El Salvador", "Canda");
        grafo11.insertarArco("El Salvador","Guatemala");
        grafo11.insertarArco("Guatemala", "El Salvador");
        grafo11.insertarArco("Belice","Honduras");
        grafo11.insertarArco("Honduras", "Belice");
        grafo11.insertarArco("Honduras","Bolivia");
        grafo11.insertarArco("Bolivia", "Honduras");
        grafo11.insertarArco("Bolivia","Argentina");
        grafo11.insertarArco("Argentina", "Bolivia");
        grafo11.insertarArco("Argentina","Peru");
        grafo11.insertarArco("Peru", "Argentina");
        grafo11.insertarArco("Peru","Chile");
        grafo11.insertarArco("Chile", "Peru");
        grafo11.insertarArco("Peru","Brasil");
        grafo11.insertarArco("Brasil", "Peru");
        grafo11.insertarArco("Peru", "Chile");
        grafo11.insertarArco("Brasil","Colombia");
        grafo11.insertarArco("Colombia", "Brasil");
        grafo11.insertarArco("Colombia","Venezuela");
        grafo11.insertarArco("Venezuela", "Colombia");
        grafo11.insertarArco("Peru","Cuba");
        grafo11.insertarArco("Cuba", "Peru");
        grafo11.insertarArco("Cuba","Surinam");
        grafo11.insertarArco("Surinam", "Cuba");
        grafo11.insertarArco("Cuba","Rep. Dominicana <3");
        grafo11.insertarArco("Rep. Dominicana <3", "Cuba");
        grafo11.insertarArco("Cuba","Nicaragua");
        grafo11.insertarArco("Nicaragua", "Cuba");
        grafo11.insertarArco("Rep. Dominicana <3","Haiti");
        grafo11.insertarArco("Haiti", "Rep. Dominicana <3");
        grafo11.insertarArco("Nicaragua","Ecuador");
        grafo11.insertarArco("Ecuador", "Nicaragua");
        grafo11.insertarArco("Surinam","Guyana Francesa");
        grafo11.insertarArco("Guyana Francesa", "Surinam");
        grafo11.insertarArco("Guyana Francesa","Paraguay");
        grafo11.insertarArco("Paraguay", "Guyana Francesa");
        grafo11.insertarArco("Paraguay","Uruguay");
        grafo11.insertarArco("Uruguay", "Paraguay");
        grafo11.insertarArco("Paraguay","Panama");
        grafo11.insertarArco("Panama", "Paraguay");
        grafo11.insertarArco("Estados Unidos2", "Venezuela");
        grafo11.insertarArco("Venezuela","Estados Unidos2");
        grafo11.insertarArco("Estados Unidos2","Costa Rica2");
        grafo11.insertarArco("Costa Rica2", "Estados Unidos2");
        grafo11.insertarArco("Costa Rica2","Mexico2");
        grafo11.insertarArco("Mexico2", "Costa Rica2");
        grafo11.insertarArco("Costa Rica2","Belice2");
        grafo11.insertarArco("Belice2", "Costa Rica2");
        grafo11.insertarArco("Mexico2","Canda2");
        grafo11.insertarArco("Canda2", "Mexico2");
        grafo11.insertarArco("Canda2","El Salvador2");
        grafo11.insertarArco("El Salvador2", "Canda2");
        grafo11.insertarArco("El Salvador2","Guatemala2");
        grafo11.insertarArco("Guatemala2", "El Salvador2");
        grafo11.insertarArco("Belice2","Honduras2");
        grafo11.insertarArco("Honduras2", "Belice2");
        grafo11.insertarArco("Honduras2","Bolivia2");
        grafo11.insertarArco("Bolivia2", "Honduras2");
        grafo11.insertarArco("Bolivia2","Argentina2");
        grafo11.insertarArco("Argentina2", "Bolivia2");
        grafo11.insertarArco("Argentina2","Peru");
        grafo11.insertarArco("Peru2", "Argentina2");
        grafo11.insertarArco("Peru2","Chile2");
        grafo11.insertarArco("Chile2", "Peru2");
        grafo11.insertarArco("Peru2","Brasil2");
        grafo11.insertarArco("Brasil2", "Peru2");
        grafo11.insertarArco("Peru2", "Chile2");
        grafo11.insertarArco("Brasil2","Colombia2");
        grafo11.insertarArco("Colombia2", "Brasil2");
        grafo11.insertarArco("Colombia2","Venezuela2");
        grafo11.insertarArco("Venezuela2", "Colombia2");
        grafo11.insertarArco("Peru2","Cuba2");
        grafo11.insertarArco("Cuba2", "Peru2");
        grafo11.insertarArco("Cuba2","Surinam2");
        grafo11.insertarArco("Surinam2", "Cuba2");
        grafo11.insertarArco("Cuba2","Rep. Dominicana <32");
        grafo11.insertarArco("Rep. Dominicana <32", "Cuba2");
        grafo11.insertarArco("Cuba2","Nicaragua2");
        grafo11.insertarArco("Nicaragua2", "Cuba2");
        grafo11.insertarArco("Rep. Dominicana <32","Haiti2");
        grafo11.insertarArco("Haiti2", "Rep. Dominicana <32");
        grafo11.insertarArco("Nicaragua2","Ecuador2");
        grafo11.insertarArco("Ecuador2", "Nicaragua2");
        grafo11.insertarArco("Surinam2","Guyana Francesa2");
        grafo11.insertarArco("Guyana Francesa2", "Surinam2");
        grafo11.insertarArco("Guyana Francesa2","Paraguay2");
        grafo11.insertarArco("Paraguay2", "Guyana Francesa2");
        grafo11.insertarArco("Paraguay2","Uruguay2");
        grafo11.insertarArco("Uruguay2", "Paraguay2");
        grafo11.insertarArco("Paraguay2","Panama2");
        grafo11.insertarArco("Panama2", "Paraguay2");
        
        grafo12.insercionVertices(1,"Rio Cuarto");
        grafo12.insercionVertices(2,"Santa Rosa");
        grafo12.insercionVertices(3,"Veracruz");
        grafo12.insercionVertices(4,"Cutris");
        grafo12.insercionVertices(5,"San Gerardo");
        grafo12.insercionVertices(6,"Sucre");
        grafo12.insercionVertices(7,"La Virgen");
        grafo12.insercionVertices(8,"Desamparados");
        grafo12.insercionVertices(9,"Barrio Mexico");
        grafo12.insercionVertices(10,"Pocosol");
        grafo12.insercionVertices(11,"La Palmera");
        grafo12.insercionVertices(12,"Pital");
        grafo12.insercionVertices(13,"Golfito");
        grafo12.insercionVertices(14,"Venado");
        grafo12.insercionVertices(15,"Puerto V");
        grafo12.insercionVertices(16,"Venecia");
        grafo12.insercionVertices(17,"Roomoser");
        grafo12.insercionVertices(18,"Alajuela");
        grafo12.insercionVertices(19,"Moravia");
        grafo12.insercionVertices(20,"Perez Z");
        grafo12.insercionVertices(144,"Rio Cuarto2");
        grafo12.insercionVertices(244,"Santa Rosa2");
        grafo12.insercionVertices(34,"Veracruz2");
        grafo12.insercionVertices(44,"Cutris2");
        grafo12.insercionVertices(54,"San Gerardo2");
        grafo12.insercionVertices(64,"Sucre2");
        grafo12.insercionVertices(74,"La Virgen2");
        grafo12.insercionVertices(84,"Desamparados2");
        grafo12.insercionVertices(93,"Barrio Mexico2");
        grafo12.insercionVertices(104,"Pocosol2");
        grafo12.insercionVertices(114,"La Palmera2");
        grafo12.insercionVertices(124,"Pital2");
        grafo12.insercionVertices(134,"Golfito2");
        grafo12.insercionVertices(144,"Venado2");
        grafo12.insercionVertices(154,"Puerto V2");
        grafo12.insercionVertices(164,"Venecia2");
        grafo12.insercionVertices(174,"Roomoser2");
        grafo12.insercionVertices(184,"Alajuela2");
        grafo12.insercionVertices(194,"Moravia2");
        grafo12.insercionVertices(204,"Perez Z2");

        grafo12.insertarArco("Rio Cuarto","Pital");
        grafo12.insertarArco("Pital","Rio Cuarto");
        grafo12.insertarArco("Pital","Moravia");
        grafo12.insertarArco("Moravia","Pital");
        grafo12.insertarArco("Pital","Venecia");
        grafo12.insertarArco("Venecia","Pital");
        grafo12.insertarArco("Venecia","Cutris");
        grafo12.insertarArco("Cutris","Venecia");
        grafo12.insertarArco("Cutris", "Roomoser");
        grafo12.insertarArco("Roomoser" ,"Cutris");
        grafo12.insertarArco("Cutris","Alajuela");
        grafo12.insertarArco("Alajuela","Cutris");
        grafo12.insertarArco("Alajuela","Venado");
        grafo12.insertarArco("Venado","Alajuela");
        grafo12.insertarArco("Alajuela","Santa Rosa");
        grafo12.insertarArco("Santa Rosa","Alajuela");
        grafo12.insertarArco("Pocosol","Alajuela");
        grafo12.insertarArco("Alajuela","Pocosol");
        grafo12.insertarArco("Roomoser","La Palmera");
        grafo12.insertarArco("La Palmera","Roomoser");
        grafo12.insertarArco("La Palmera","Golfito");
        grafo12.insertarArco("Golfito","La Palmera");
        grafo12.insertarArco("Golfito","Veracruz");
        grafo12.insertarArco("Veracruz","Golfito");
        grafo12.insertarArco("Golfito","Barrio Mexico");
        grafo12.insertarArco("Barrio Mexico","Golfito");
        grafo12.insertarArco("Barrio Mexico","Perez Z");
        grafo12.insertarArco("Perez Z","Barrio Mexico");
        grafo12.insertarArco("Perez Z","Puerto V");
        grafo12.insertarArco("Puerto V","Perez Z");
        grafo12.insertarArco("Perez Z","La Virgen");
        grafo12.insertarArco("La Virgen","Perez Z");
        grafo12.insertarArco("La Virgen","Sucre");
        grafo12.insertarArco("Sucre","La Virgen");
        grafo12.insertarArco("Sucre","San Gerardo");
        grafo12.insertarArco("San Gerardo","Sucre");
        grafo12.insertarArco("Desamparados","Puerto V");
        grafo12.insertarArco("Puerto V","Desamparados");
        grafo12.insertarArco("Rio Cuarto2","Pocosol");
        grafo12.insertarArco("Pocosol","Rio Cuarto2");
        grafo12.insertarArco("Rio Cuarto2","Pital2");
        grafo12.insertarArco("Pital2","Rio Cuarto2");
        grafo12.insertarArco("Pital2","Moravia2");
        grafo12.insertarArco("Moravia2","Pital2");
        grafo12.insertarArco("Pital2","Venecia2");
        grafo12.insertarArco("Venecia2","Pital2");
        grafo12.insertarArco("Venecia2","Cutris2");
        grafo12.insertarArco("Cutris2","Venecia2");
        grafo12.insertarArco("Cutris2", "Roomoser2");
        grafo12.insertarArco("Roomoser2" ,"Cutris2");
        grafo12.insertarArco("Cutris2","Alajuela2");
        grafo12.insertarArco("Alajuela2","Cutris2");
        grafo12.insertarArco("Alajuela2","Venado2");
        grafo12.insertarArco("Venado2","Alajuela2");
        grafo12.insertarArco("Alajuela2","Santa Rosa2");
        grafo12.insertarArco("Santa Rosa2","Alajuela2");
        grafo12.insertarArco("Pocosol2","Alajuela2");
        grafo12.insertarArco("Alajuela2","Pocosol2");
        grafo12.insertarArco("Roomoser2","La Palmera2");
        grafo12.insertarArco("La Palmera2","Roomoser2");
        grafo12.insertarArco("La Palmera2","Golfito2");
        grafo12.insertarArco("Golfito2","La Palmera2");
        grafo12.insertarArco("Golfito2","Veracruz2");
        grafo12.insertarArco("Veracruz2","Golfito2");
        grafo12.insertarArco("Golfito2","Barrio Mexico2");
        grafo12.insertarArco("Barrio Mexico2","Golfito2");
        grafo12.insertarArco("Barrio Mexico2","Perez Z2");
        grafo12.insertarArco("Perez Z2","Barrio Mexico2");
        grafo12.insertarArco("Perez Z2","Puerto V2");
        grafo12.insertarArco("Puerto V2","Perez Z2");
        grafo12.insertarArco("Perez Z2","La Virgen2");
        grafo12.insertarArco("La Virgen2","Perez Z2");
        grafo12.insertarArco("La Virgen2","Sucre2");
        grafo12.insertarArco("Sucre2","La Virgen2");
        grafo12.insertarArco("Sucre2","San Gerardo2");
        grafo12.insertarArco("San Gerardo2","Sucre2");
        grafo12.insertarArco("Desamparados2","Puerto V2");
        grafo12.insertarArco("Puerto V2","Desamparados2");
        
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
        grafo7.desmarcar();
        grafo8.desmarcar();
        grafo9.desmarcar();
        grafo10.desmarcar();
        grafo12.desmarcar();
        grafo11.desmarcar();
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
        System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
        System.out.println("GRAFO 11");
        greedy.greedy(grafo11);
        System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
        System.out.println("GRAFO 12");
        greedy.greedy(grafo12);
    } 
    
    /**
     * funcion que llama el algortimo b con cada uno de los grafos
     */
    static void maximoBeneficioB(){
        System.out.println("Algoritmo B (Maximo Beneficio)");
        desmarcar();
        System.out.println("GRAFO 1");
        maxBeneficioRec.maxBeneficioRec(grafo1);
        System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
        System.out.println("GRAFO 2");
        maxBeneficioRec.maxBeneficioRec(grafo2);
        System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
        System.out.println("GRAFO 3");
        maxBeneficioRec.maxBeneficioRec(grafo3);
        System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
        System.out.println("GRAFO 4");
        maxBeneficioRec.maxBeneficioRec(grafo12);
        System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
        System.out.println("GRAFO 5");
        maxBeneficioRec.maxBeneficioRec(grafo5);
        System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
        System.out.println("GRAFO 11");
        maxBeneficioRec.maxBeneficioRec(grafo11);
        System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
        System.out.println("GRAFO 12");
        maxBeneficioRec.maxBeneficioRec(grafo12);
    } 
    
    /**
     * funcion que llama al algoritmo D con cada uno de los grafos
     */
    static void maximoBeneficioD(){
        desmarcar();
        System.out.println("Algoritmo B ciclico (Mayor beneficio)");
        System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
        System.out.println("GRAFO 6 (Ciclico)");
        maxBeneficioRec.maxBeneficioRec(grafo6);
        System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
        System.out.println("GRAFO 7 (Ciclico)");
        maxBeneficioRec.maxBeneficioRec(grafo7);
        System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
        System.out.println("GRAFO 8");
        maxBeneficioRec.maxBeneficioRec(grafo8);
        System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
        System.out.println("GRAFO 9");
        maxBeneficioRec.maxBeneficioRec(grafo9);
        System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
        System.out.println("GRAFO 10");
        maxBeneficioRec.maxBeneficioRec(grafo10);        
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
        cantMaxRest.cantMaxRest(grafo12);
        System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
        System.out.println("GRAFO 5");
        cantMaxRest.cantMaxRest(grafo5);
        System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
        System.out.println("GRAFO 11");
        cantMaxRest.cantMaxRest(grafo11);
        System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
        System.out.println("GRAFO 12");
        cantMaxRest.cantMaxRest(grafo12);
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
                maximoBeneficioD();
        }
    }
}
