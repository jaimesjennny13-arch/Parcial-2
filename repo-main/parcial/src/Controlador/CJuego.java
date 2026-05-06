/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.JuegoDAO;
import Modelo.Jugador;
import Vista.VJuego;
import java.awt.event.ActionListener;

/**
 *
 * @author UIS
 */
public class CJuego implements ActionListener{
    
    private VJuego vista;
    private JuegoDAO dao;
    private Jugador jugador;

    public CJuego(VJuego vista, JuegoDAO dao, Jugador jugador) {
        this.vista = vista;
        this.dao = dao;
        this.jugador = jugador;
        
        IniciarJuego();
        actualizarSaldo();
        
    }
    
    
    
    
}
