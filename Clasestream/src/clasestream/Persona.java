

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Edisson Leon
 */
public class Persona {

    private String nombre;
    private String priape;
    private String seguape;

    public Persona() {
        
    }

    public Persona(String nombre, String priape, String seguape) {
        this.nombre = nombre;
        this.priape = priape;
        this.seguape = seguape;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPriape() {
        return priape;
    }

    public void setPriape(String priape) {
        this.priape = priape;
    }

    public String getSeguape() {
        return seguape;
    }

    public void setSeguape(String seguape) {
        this.seguape = seguape;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", priape=" + priape + ", seguape=" + seguape + '}';
    }

}
