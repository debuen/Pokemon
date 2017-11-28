/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

import ocutilidades.Fichero;

/**
 *
 * @author DAW
 */
public class Main {

    public static PokemonList pokemons;
    public static Fichero miFichero;
    
    public static void main(String[] args) {
        
        miFichero = new Fichero("pokemon.xml");
        pokemons = (PokemonList) miFichero.leer();
       
        if (pokemons == null) {
            pokemons = new PokemonList();
        }
        
        Menu principal = new Menu();
        // Centramos la ventana en la pantalla
        principal.setLocationRelativeTo(null);
        // Lo hacemos visible
        principal.setVisible(true);
    }
    
}
