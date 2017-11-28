
package Entities;

/**
 *
 * @author DAW
 */
public abstract class Pokemon implements Capturable{
 
    private String nombre;
    private int ataque;
    private int defensa;
    private int salud;

    public Pokemon() {
    }
 

    public Pokemon(String nombre, int ataque, int defensa, int salud) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.defensa = defensa;
        this.salud = salud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }
    
    
    
}
