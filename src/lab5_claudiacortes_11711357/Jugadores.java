/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_claudiacortes_11711357;

/**
 *
 * @author Claudia Cortes
 */
public class Jugadores {

    protected String Nombre;
    protected Double Precio;
    protected String Posicion;
    //protected String Disponibilidad;
    protected boolean Disponibilidad;
    protected double Habilidad;
    protected double Tecnica;
    protected double Resistencia_F;

    public String getNombre() {
        return Nombre;
    }

    public Double getPrecio() {
        return Precio;
    }

    public String getPosicion() {
        return Posicion;
    }

    public boolean getDisponibilidad() {
        return Disponibilidad;
    }

    public double getHabilidad() {
        return Habilidad;
    }

    public double getTecnica() {
        return Tecnica;
    }

    public double getResistencia_F() {
        return Resistencia_F;
    }

    public Jugadores(String Nombre, Double Precio, String Posicion, boolean Disponibilidad, double Habilidad, double Tecnica, double Resistencia_F) {
        this.Nombre = Nombre;
        this.Precio = Precio;
        this.Posicion = Posicion;
        this.Disponibilidad = Disponibilidad;
        this.Habilidad = Habilidad;
        this.Tecnica = Tecnica;
        this.Resistencia_F = Resistencia_F;
    }

    public Jugadores() {
    }

    @Override
    public String toString() {
        return  Nombre + "Precio:" + Precio + " Posicion: " + Posicion + " Disponibilidad=" + Disponibilidad + ", Habilidad=" + Habilidad + ", Tecnica=" + Tecnica + ", Resistencia_F=" + Resistencia_F + '}';
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setPrecio(Double Precio) {
        this.Precio = Precio;
    }

    public void setPosicion(String Posicion) {
        this.Posicion = Posicion;
    }

    public void setDisponibilidad(boolean Disponibilidad) {
        this.Disponibilidad = Disponibilidad;
    }

    public void setHabilidad(double Habilidad) {
        this.Habilidad = Habilidad;
    }

    public void setTecnica(double Tecnica) {
        this.Tecnica = Tecnica;
    }

    public void setResistencia_F(double Resistencia_F) {
        this.Resistencia_F = Resistencia_F;
    }

   
   

}
