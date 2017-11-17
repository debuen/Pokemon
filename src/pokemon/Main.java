/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

/**
 *
 * @author DAW
 */
public class Main {

    public static PokemonList pokemons;
    public static PokemonList pFuego;
    public static PokemonList pAgua;
    public static PokemonList pPlanta;
    
    public static void main(String[] args) {
        
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
