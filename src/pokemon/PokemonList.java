
package pokemon;


import Entities.Pokemon;
import java.util.ArrayList;
import java.util.HashMap;


public class PokemonList {
    
    HashMap<String, Pokemon> pokemons= new HashMap<>();

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
}