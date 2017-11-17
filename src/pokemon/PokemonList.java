
package pokemon;

import Entities.Agua;
import Entities.Fuego;
import Entities.Planta;
import Entities.Pokemon;
import java.util.HashMap;


public class PokemonList {
    
    HashMap<String, Pokemon> pokemons= new HashMap<>();
    HashMap<String, Agua> pAgua= new HashMap<>();
    HashMap<String, Fuego> pFuego= new HashMap<>();
    HashMap<String, Planta> pPlanta= new HashMap<>();

    public HashMap<String, Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(HashMap<String, Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public HashMap<String, Agua> getpAgua() {
        return pAgua;
    }

    public void setpAgua(HashMap<String, Agua> pAgua) {
        this.pAgua = pAgua;
    }

    public HashMap<String, Fuego> getpFuego() {
        return pFuego;
    }

    public void setpFuego(HashMap<String, Fuego> pFuego) {
        this.pFuego = pFuego;
    }

    public HashMap<String, Planta> getpPlanta() {
        return pPlanta;
    }

    public void setpPlanta(HashMap<String, Planta> pPlanta) {
        this.pPlanta = pPlanta;
    }
    
    
    
}
