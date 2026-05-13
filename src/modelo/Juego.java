/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author UIS
 */
public class Juego {
    private  int numeroApostado;
    private double montoApuesta;

    public Juego(int numeroApostado, double montoApuesta) {
        this.numeroApostado = numeroApostado;
        this.montoApuesta = montoApuesta;
    }

    public int getNumeroApostado() {
        return numeroApostado;
    }

    public void setNumeroApostado(int numeroApostado) {
        this.numeroApostado = numeroApostado;
    }

    public double getMontoApuesta() {
        return montoApuesta;
    }

    public void setMontoApuesta(double montoApuesta) {
        this.montoApuesta = montoApuesta;
    }

    @Override
    public String toString() {
        return "Juego{" + "numeroApostado=" + numeroApostado + ", montoApuesta=" + montoApuesta + '}';
    }
   
}
