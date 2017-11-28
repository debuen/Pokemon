
package Entities;

/**
 *
 * @author DAW
 */
public class Fuego extends Pokemon{
    
    private String tipo = "fuego";
    private String efectivo;
    private String debil;

    public Fuego() {
    }
    
    public Fuego(String tipo, String efectivo, String debil, String nombre, int ataque, int defensa, int salud) {
        super(nombre, ataque, defensa, salud);
        this.tipo = tipo;
        this.efectivo = efectivo;
        this.debil = debil;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(String efectivo) {
        this.efectivo = efectivo;
    }

    public String getDebil() {
        return debil;
    }

    public void setDebil(String debil) {
        this.debil = debil;
    }

    @Override
    public boolean capturado() {
        int random = (int) (Math.random()*(60 - 10) + 1) + 10;
         if ((random + getAtaque()) > (getDefensa()+getAtaque())) {
            return true;
        } else {
            return false;
        } 
    }
    
    
    
}
