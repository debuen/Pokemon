
package Entities;

/**
 *
 * @author DAW
 */
public class Agua extends Pokemon implements Capturable{
    
    private String tipo = "agua";
    private String efectivo = "fuego";
    private String debil = "planta";

    public Agua(String tipo, String efectivo, String debil, String nombre, int ataque, int defensa, int salud) {
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
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}