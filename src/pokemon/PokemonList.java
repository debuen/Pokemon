
package pokemon;


import Entities.Agua;
import Entities.Fuego;
import Entities.Planta;
import Entities.Pokemon;
import java.util.ArrayList;
import java.util.HashMap;


public class PokemonList {
    
    HashMap<String, Pokemon> pokemons= new HashMap<>();
    
    public static ArrayList<Pokemon> pokemonList;
    

    public HashMap<String, Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(HashMap<String, Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public ArrayList<String> nombres() {
        ArrayList<String> nombres = new ArrayList<>();
        for (String p : pokemons.keySet()) {
               nombres.add(p);
        }return nombres;
    }
    
    public Pokemon pokemonNombre(String nombre) {
        for (Pokemon p : pokemons.values()) {
               if (nombre.equalsIgnoreCase(p.getNombre())) {
                return p;
            }
         }return null;
    }
    
    public int pFuego(){
        int numFuego = 0;
        for (Pokemon p : pokemons.values()) {
               if (p.getClass().getSimpleName().equalsIgnoreCase("Fuego")) {
                numFuego++;
            }
         }return numFuego;
    }
    public int pAgua(){
        int numAgua = 0;
        for (Pokemon p : pokemons.values()) {
               if (p.getClass().getSimpleName().equalsIgnoreCase("Agua")) {
                   //aguaList.add(p);
                   numAgua++;
            }
         }return numAgua;
    }
    public int pPlanta(){
        int numPlanta = 0;
        for (Pokemon p : pokemons.values()) {
               if (p.getClass().getSimpleName().equalsIgnoreCase("Planta")) {
                    numPlanta++;
            }
         }return numPlanta;
    }
    
    public ArrayList<Pokemon> tipoPokemon(String tipo) {
        ArrayList<Pokemon> pokemonTipo = new ArrayList();
       
        for (Pokemon p : pokemons.values()) {
            if(tipo.equalsIgnoreCase("agua")){
                if (tipo.equalsIgnoreCase(p.getClass().getSimpleName())) {
                    pokemonTipo.add(p);
                }
            }else if(tipo.equalsIgnoreCase("fuego")){
                if (tipo.equalsIgnoreCase(p.getClass().getSimpleName())) {
                    pokemonTipo.add(p);
                }
            }else if(tipo.equalsIgnoreCase("planta")){
                if (tipo.equalsIgnoreCase(p.getClass().getSimpleName())) {
                    pokemonTipo.add(p);
                }
            }
            else{
                pokemonTipo.add(p);
            }
        }
        return pokemonTipo;
    }
    
//    public String nombre(String tipo){
//        for (Pokemon p : pokemons.values()) {
//            if(tipo.equalsIgnoreCase("agua")){
//                if (p.getClass().getSimpleName().equalsIgnoreCase("agua")) {
//                    return p.getNombre();
//                }
//            }else if(tipo.equalsIgnoreCase("fuego")){
//                if (p.getClass().getSimpleName().equalsIgnoreCase("fuego")) {
//                    return p.getNombre();
//                }
//            }else if(tipo.equalsIgnoreCase("planta")){
//                if (p.getClass().getSimpleName().equalsIgnoreCase("planta")) {
//                    return p.getNombre();
//                }
//            }
//            
//        }
//    }
    
    
}