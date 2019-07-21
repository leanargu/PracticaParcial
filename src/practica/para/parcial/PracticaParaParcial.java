/*
Se recibe una lista de programas de TV con indicación de canal y nombre de programa. Como
resultado se debe imprimir una lista ordenada de canales y para cada canal un listado de
programas. Por ejemplo: Si la lista que se recibe es [(“Sony”, “Grey’s Anatomy”), (“Sony”,
“Scandal), (“ Fox”, “24), (“Fox”,”Los Simpson” ), (“Universal”, “Dr. House”)] el resultado debe ser:
[(‘Fox”, [“24”, “Los Simpson”]), (“Sony”, [“Grey’s Anatomy”, “Scandal”]), (“Universal”, [“Dr.
House”]) ].
 */
package practica.para.parcial;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.TreeMap;

public class PracticaParaParcial {

    private static HashMap<String,LinkedList<String>> mapDeProgramas = new HashMap();
    private static TreeMap<String,LinkedList<String>> mapSalida = new TreeMap();
    
    public static void agregarPrograma(String canal,String programa){
        if(!mapDeProgramas.containsKey(canal)){
            mapDeProgramas.put(canal,new LinkedList());
        }
            mapDeProgramas.get(canal).add(programa);
    }
    
    public static void ordenar(){
        for(String canal : mapDeProgramas.keySet()){
            for(String programa : mapDeProgramas.get(canal)){
                if(!mapSalida.containsKey(canal)){
                mapSalida.put(canal,new LinkedList());
            }
            mapSalida.get(canal).add(programa);
            }
            
        }
    }
    
    public static void main(String[] args) {
        agregarPrograma("Sony", "Grey's Anatomy");
        agregarPrograma("Sony", "Scandal");
        agregarPrograma("Fox", "24");
        agregarPrograma("Fox", "Los Simpsons");
        agregarPrograma("Universal", "Dr. House");
        ordenar();
        System.out.println(mapDeProgramas);
        System.out.println(mapSalida);
    }
    
}
