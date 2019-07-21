package ArbolesRecursion;

import javax.lang.model.element.Element;

public class Practica {

    public static void main(String[] args) {
        BinarySearchTree<Integer> arbolDeBusqueda = new BinarySearchTree<Integer>();
        
        arbolDeBusqueda.insert(11);
        arbolDeBusqueda.insert(13);
        arbolDeBusqueda.insert(66);
        arbolDeBusqueda.insert(7);
        arbolDeBusqueda.insert(9);
        arbolDeBusqueda.insert(23);
        arbolDeBusqueda.insert(3);
        arbolDeBusqueda.insert(1);
        arbolDeBusqueda.insert(8);
        arbolDeBusqueda.insert(2);
        arbolDeBusqueda.insert(38);

//        System.out.println("Contar nodos: " + contarNodos(arbolDeBusqueda.root));
//        System.out.println("Sumar nodos: " + sumarNodos(arbolDeBusqueda.root));
//        System.out.println("Sumar nodos mayores a 10: " + sumarNodosMayoresA10(arbolDeBusqueda.root));
//        System.out.println("Sumar hojas: " + sumarHojas(arbolDeBusqueda.root));
//        System.out.println("Nodo mas chico: " + buscarNodoMasChico(arbolDeBusqueda.root));
//        System.out.println("Nodo mas grande: " + buscarNodoMasGrande(arbolDeBusqueda.root));
//        System.out.println("Nodo mas chico y mas grande juntos: " + buscarMasChicoYMasGrande(arbolDeBusqueda.root)[0] + "," + buscarMasChicoYMasGrande(arbolDeBusqueda.root)[1]);
//        System.out.println("Suma de nodos pares: " + sumarNodosPares(arbolDeBusqueda.root));
//        System.out.println("Contar nodos mayores/iguales a 10: " + cantidadDeNodosMayoresA10(arbolDeBusqueda.root));
//        System.out.println("Suma de hojas pares: " + sumarHojasPares(arbolDeBusqueda.root));
          System.out.println("El mayor de los nodos es: " + calcularMayorNodo(arbolDeBusqueda.root));
    }

//    public static int contarNodos(BinaryNode nodo) {
//        int contador = 1;
//
//        if (nodo.left != null) {
//            contador += contarNodos(nodo.left);
//        }
//        if (nodo.right != null) {
//            contador += contarNodos(nodo.right);
//        }
//        return contador;
//    }
//
//    public static int sumarNodos(BinaryNode nodo) {
//
//        int contador = (int) nodo.element;
//
//        if (nodo.left != null) {
//            contador += sumarNodos(nodo.left);
//        }
//        if (nodo.right != null) {
//            contador += sumarNodos(nodo.right);
//        }
//
//        return contador;
//    }
//
//    public static int sumarNodosMayoresA10(BinaryNode nodo) {
//        int contador = 0;
//        if ((int) nodo.element > 10) {
//            contador = (int) nodo.element;
//        }
//        if (nodo.left != null) {
//            contador += sumarNodosMayoresA10(nodo.left);
//        }
//        if (nodo.right != null) {
//            contador += sumarNodosMayoresA10(nodo.right);
//        }
//
//        return contador;
//    }
//
//    public static int sumarHojas(BinaryNode nodo) {
//        int contador = 0;
//        if (nodo.left == null && nodo.right == null) {
//            contador = (int) nodo.element;
//        }
//        if (nodo.left != null) {
//            contador += sumarHojas(nodo.left);
//        }
//        if (nodo.right != null) {
//            contador += sumarHojas(nodo.right);
//        }
//        return contador;
//    }
//
//    public static int buscarNodoMasChico(BinaryNode nodo) {
//
//        if (nodo.left == null) {
//            return (int) nodo.element;
//        }
//        return buscarNodoMasChico(nodo.left);
//
//    }
//
//    public static int buscarNodoMasGrande(BinaryNode nodo) {
//        if (nodo.right == null) {
//            return (int) nodo.element;
//        }
//        return buscarNodoMasGrande(nodo.right);
//    }
//
//    public static int[] buscarMasChicoYMasGrande(BinaryNode nodo) {
////		int contador = 0;
////		int masChico = 0;
////		int masGrande = 0;
////		
////		if(nodo.left == null && nodo.right==null) {
////			contador += (int)nodo.element;
////		}
////		if(nodo.left!=null) {
////			masChico+=buscarMasChicoYMasGrande(nodo.left);
////		}
////		if(nodo.right!=null) {
////			masGrande+=buscarMasChicoYMasGrande(nodo.right);
////		}
////		
////		return contador;
//        int[] array = new int[2];
//        array[0] = buscarNodoMasChico(nodo);
//        array[1] = buscarNodoMasGrande(nodo);
//        return array;
//    }
//
//    public static int sumarNodosPares(BinaryNode nodo) {
//        int contador = 0;
//        if ((int) nodo.element % 2 == 0) {
//            return (int) nodo.element;
//        }
//        if (nodo.left != null) {
//            contador += sumarNodosPares(nodo.left);
//        }
//        if (nodo.right != null) {
//            contador += sumarNodosPares(nodo.right);
//        }
//
//        return contador;
//    }
//
//    public static int cantidadDeNodosMayoresA10(BinaryNode nodo) {
//        int contador = 0;
//        if ((int) nodo.element >= 10) {
//            contador += 1;
//        }
//        if (nodo.left != null) {
//            contador += cantidadDeNodosMayoresA10(nodo.left);
//        }
//        if (nodo.right != null) {
//            contador += cantidadDeNodosMayoresA10(nodo.right);
//        }
//        return contador;
//    }
//
//    public static int sumarHojasPares(BinaryNode nodo) {
//        int contador = 0;
//        if (nodo.left == null && nodo.right == null) {
//            if ((int) nodo.element % 2 == 0) {
//                contador += (int) nodo.element;
//            }
//        }
//        if (nodo.left != null) {
//            contador += (sumarHojasPares(nodo.left));
//        }
//        if (nodo.right != null) {
//            contador += (sumarHojasPares(nodo.right));
//        }
//        return contador;
//    }

    public static int calcularMayorNodo(BinaryNode nodo){
        int mayorNodo = (int)nodo.element;
        if(nodo.left == null && nodo.right == null){
            System.out.println("Llegue hasta" + nodo.element);
            if((int)nodo.element>mayorNodo){
                mayorNodo=(int)nodo.element;
            }
        }
        if (nodo.left != null) {
              mayorNodo = Math.max(mayorNodo,(calcularMayorNodo(nodo.left)));  
        }
        if (nodo.right != null) {
            mayorNodo = Math.max(mayorNodo,(calcularMayorNodo(nodo.right)));
        }
        return mayorNodo;
    }
    
}
