package primerproyectoanálisis;

import algoritmos.MaximoBeneficio;
import grafo.Grafo;

public class PrimerProyectoAnálisis {

        public static Grafo grafo1 = new Grafo();
        public static Grafo grafo2 = new Grafo();
        public static Grafo grafo3 = new Grafo();
        public static Grafo grafo4 = new Grafo();
        public static Grafo grafo5 = new Grafo();
        
        public static MaximoBeneficio algoritmos = new MaximoBeneficio();
        
        
        public static void main(String[] args) {
                grafo1.insercionVertices(13);
                grafo1.insercionVertices(4);
                grafo1.insercionVertices(9);
                grafo1.insercionVertices(6);
                grafo1.insercionVertices(8);
                grafo1.insercionVertices(7);
                
                grafo1.insertarArco(4, 9);
                grafo1.insertarArco(13, 9);
                grafo1.insertarArco(9, 6);
                grafo1.insertarArco(9, 4);
                grafo1.insertarArco(9, 13);
                grafo1.insertarArco(6, 9);
                grafo1.insertarArco(6, 7);
                grafo1.insertarArco(6, 8);
                grafo1.insertarArco(8, 6);
                grafo1.insertarArco(7, 6);
                
                
                
                grafo2.insercionVertices(9);
                grafo2.insercionVertices(10);
                grafo2.insercionVertices(5);
                grafo2.insercionVertices(20);
                grafo2.insercionVertices(7);
                grafo2.insercionVertices(3);
                grafo2.insercionVertices(12);
                grafo2.insercionVertices(11);
                grafo2.insercionVertices(4);
                grafo2.insercionVertices(8);
                
                grafo2.insertarArco(9, 10);
                grafo2.insertarArco(10, 9);
                grafo2.insertarArco(10, 5);
                grafo2.insertarArco(5, 10);
                grafo2.insertarArco(5, 20);
                grafo2.insertarArco(5, 7);
                grafo2.insertarArco(7, 5);
                grafo2.insertarArco(7, 3);
                grafo2.insertarArco(7, 11);
                grafo2.insertarArco(7, 12);
                grafo2.insertarArco(3, 7);
                grafo2.insertarArco(11, 7);
                grafo2.insertarArco(11, 4);
                grafo2.insertarArco(11, 8);
                grafo2.insertarArco(4, 11);
                grafo2.insertarArco(8, 11);
                grafo2.insertarArco(12, 7);
                grafo2.insertarArco(20, 5);
                
                
                
                grafo3.insercionVertices(12);
                grafo3.insercionVertices(7);
                grafo3.insercionVertices(6);
                grafo3.insercionVertices(10);
                grafo3.insercionVertices(15);
                grafo3.insercionVertices(11);
                grafo3.insercionVertices(5);
                grafo3.insercionVertices(14);
                grafo3.insercionVertices(4);
                grafo3.insercionVertices(2);
                grafo3.insercionVertices(8);
                grafo3.insercionVertices(1);
                grafo3.insercionVertices(13);
                grafo3.insercionVertices(3);
                grafo3.insercionVertices(9);
                
                grafo3.insertarArco(12, 7);
                grafo3.insertarArco(7, 12);
                grafo3.insertarArco(7, 6);
                grafo3.insertarArco(7, 10);
                grafo3.insertarArco(6, 7);
                grafo3.insertarArco(10, 7);
                grafo3.insertarArco(10, 15);
                grafo3.insertarArco(15, 10);
                grafo3.insertarArco(15, 13);
                grafo3.insertarArco(15, 11);
                grafo3.insertarArco(15, 2);
                grafo3.insertarArco(2, 8);
                grafo3.insertarArco(2, 15);
                grafo3.insertarArco(8, 2);
                grafo3.insertarArco(8, 1);
                grafo3.insertarArco(1, 8);
                grafo3.insertarArco(13, 15);
                grafo3.insertarArco(13, 9);
                grafo3.insertarArco(13, 3);
                grafo3.insertarArco(9, 13);
                grafo3.insertarArco(3, 13);
                grafo3.insertarArco(11, 15);
                grafo3.insertarArco(11, 5);
                grafo3.insertarArco(11, 14);
                grafo3.insertarArco(5, 11);
                grafo3.insertarArco(4, 14);
                grafo3.insertarArco(14, 11);
                grafo3.insertarArco(14, 4);

                
                
                
                grafo4.insercionVertices(1);
                grafo4.insercionVertices(2);
                grafo4.insercionVertices(3);
                grafo4.insercionVertices(4);
                grafo4.insercionVertices(5);
                grafo4.insercionVertices(6);
                grafo4.insercionVertices(7);
                grafo4.insercionVertices(8);
                grafo4.insercionVertices(9);
                grafo4.insercionVertices(10);
                grafo4.insercionVertices(11);
                grafo4.insercionVertices(12);
                grafo4.insercionVertices(13);
                grafo4.insercionVertices(14);
                grafo4.insercionVertices(15);
                grafo4.insercionVertices(16);
                grafo4.insercionVertices(17);
                grafo4.insercionVertices(18);
                grafo4.insercionVertices(19);
                grafo4.insercionVertices(20);




                grafo4.insertarArco(1,12);
                grafo4.insertarArco(12,1);
                grafo4.insertarArco(12,19);
                grafo4.insertarArco(19,12);
                grafo4.insertarArco(12,16);
                grafo4.insertarArco(16,12);
                grafo4.insertarArco(16,4);
                grafo4.insertarArco(4,16);
                grafo4.insertarArco(4,17);
                grafo4.insertarArco(17,4);
                grafo4.insertarArco(4,18);
                grafo4.insertarArco(18,4);
                grafo4.insertarArco(18,14);
                grafo4.insertarArco(14,18);
                grafo4.insertarArco(18,2);
                grafo4.insertarArco(2,18);
                grafo4.insertarArco(17,11);
                grafo4.insertarArco(11,17);
                grafo4.insertarArco(11,13);
                grafo4.insertarArco(13,11);
                grafo4.insertarArco(13,3);
                grafo4.insertarArco(3,11);
                grafo4.insertarArco(13,9);
                grafo4.insertarArco(9,13);
                grafo4.insertarArco(9,20);
                grafo4.insertarArco(20,9);
                grafo4.insertarArco(20,15);
                grafo4.insertarArco(15,20);
                grafo4.insertarArco(20,7);
                grafo4.insertarArco(7,20);
                grafo4.insertarArco(7,6);
                grafo4.insertarArco(6,7);
                grafo4.insertarArco(6,5);
                grafo4.insertarArco(5,6);
                
                
                
                
                
                grafo5.insercionVertices(1);
                grafo5.insercionVertices(2);
                grafo5.insercionVertices(3);
                grafo5.insercionVertices(4);
                grafo5.insercionVertices(5);
                grafo5.insercionVertices(6);
                grafo5.insercionVertices(7);
                grafo5.insercionVertices(8);
                grafo5.insercionVertices(9);
                grafo5.insercionVertices(10);
                grafo5.insercionVertices(11);
                grafo5.insercionVertices(12);
                grafo5.insercionVertices(13);
                grafo5.insercionVertices(14);
                grafo5.insercionVertices(15);
                grafo5.insercionVertices(16);
                grafo5.insercionVertices(17);
                grafo5.insercionVertices(18);
                grafo5.insercionVertices(19);
                grafo5.insercionVertices(20);
                grafo5.insercionVertices(21);
                grafo5.insercionVertices(22);
                grafo5.insercionVertices(23);
                grafo5.insercionVertices(24);
                grafo5.insercionVertices(25);

                grafo5.insertarArco(1,20);
                grafo5.insertarArco(20, 1);
                grafo5.insertarArco(20,7);
                grafo5.insertarArco(7, 20);
                grafo5.insertarArco(20,15);
                grafo5.insertarArco(15, 20);
                grafo5.insertarArco(20,14);
                grafo5.insertarArco(14, 20);
                grafo5.insertarArco(14,4);
                grafo5.insertarArco(4, 14);
                grafo5.insertarArco(4,11);
                grafo5.insertarArco(11, 4);
                grafo5.insertarArco(15,22);
                grafo5.insertarArco(22, 15);
                grafo5.insertarArco(22,25);
                grafo5.insertarArco(25, 22);
                grafo5.insertarArco(25,5);
                grafo5.insertarArco(5, 25);
                grafo5.insertarArco(5,24);
                grafo5.insertarArco(24, 5);
                grafo5.insertarArco(24,10);
                grafo5.insertarArco(10, 24);
                grafo5.insertarArco(24,16);
                grafo5.insertarArco(16, 24);
                grafo5.insertarArco(10, 24);
                grafo5.insertarArco(16,8);
                grafo5.insertarArco(8, 16);
                grafo5.insertarArco(8,2);
                grafo5.insertarArco(2, 8);
                grafo5.insertarArco(24,23);
                grafo5.insertarArco(23, 24);
                grafo5.insertarArco(23,12);
                grafo5.insertarArco(12, 23);
                grafo5.insertarArco(23,21);
                grafo5.insertarArco(21, 23);
                grafo5.insertarArco(23,3);
                grafo5.insertarArco(3, 23);
                grafo5.insertarArco(21,13);
                grafo5.insertarArco(13, 21);
                grafo5.insertarArco(3,9);
                grafo5.insertarArco(9, 3);
                grafo5.insertarArco(12,18);
                grafo5.insertarArco(18, 12);
                grafo5.insertarArco(18,6);
                grafo5.insertarArco(6, 18);
                grafo5.insertarArco(6,19);
                grafo5.insertarArco(19, 6);
                grafo5.insertarArco(6,17);
                grafo5.insertarArco(17, 6);


                //primer metodo algoritmo c 
                algoritmos.mayorNumRest(grafo1, grafo1.grafo.get(0));
                System.out.println(algoritmos.cantRest);

                 //segundo metodo algoritmo c 
                //System.out.println(algoritmos.mayorNumRest2(grafo1.grafo));
                
                //mayor beneficio
                //System.out.println("Mayor beneficio= "+algoritmos.mayorBeneficio(grafo1.grafo));
                
                
                //Eliminar basura
                //grafo1.desmarcar();
                //algoritmos.desmarcar();
        }
        
}
