/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_claudiacortes_11711357;

import java.util.ArrayList;

/**
 *
 * @author Claudia Cortes
 */
public class Equipos {
    protected String Nombre;
    protected double Presupuesto;
    protected int num_copas;
    protected String Estadio;
    protected ArrayList<Jugadores> Jugadores = new ArrayList();

    public Equipos(String Nombre, double Presupuesto, int num_copas, String Estadio) {
        this.Nombre = Nombre;
        this.Presupuesto = Presupuesto;
        this.num_copas = num_copas;
        this.Estadio = Estadio;
    }

    public Equipos() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getPresupuesto() {
        return Presupuesto;
    }

    public void setPresupuesto(double Presupuesto) {
        this.Presupuesto = Presupuesto;
    }

    public int getNum_copas() {
        return num_copas;
    }

    public void setNum_copas(int num_copas) {
        this.num_copas = num_copas;
    }

    public String getEstadio() {
        return Estadio;
    }

    public void setEstadio(String Estadio) {
        this.Estadio = Estadio;
    }

    public ArrayList<Jugadores> getJugadores() {
        return Jugadores;
    }

    public void setJugadores(ArrayList<Jugadores> Jugadores) {
        this.Jugadores = Jugadores;
    }

    @Override
    public String toString() {
        return Nombre +"( " + num_copas +" )";
    }

    
}
