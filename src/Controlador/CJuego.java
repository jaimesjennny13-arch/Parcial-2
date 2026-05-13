/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Jugador;
import Modelo.JugadorDAO;

/**
 *
 * @author UIS
 */
public class CJuego {
    private VRuleta vista;
    private JugadorDAO dao;
    private Jugador jugador;

    public CRuleta(VRuleta vista, RuletaDAO dao, Jugador jugador) {
        this.vista = vista;
        this.dao = dao;
        this.jugador = jugador;

        iniciarJuego();
        actualizarSaldo();
    }

    private void iniciarJuego() {
     this.vista.getBtnGirar().addActionListener(this);
        this.vista.getBtnInyectar().addActionListener(this);
       this.vista.
       
    }

    private void Girar() {
        try {
            int numero = Integer.parseInt(vista.getTxtNumero().getText());
            int apuesta = Integer.parseInt(vista.getTxtApuesta().getText());

            String resultado = dao.jugar(jugador, numero, apuesta);

            vista.mostrarMensaje(resultado);
            actualizarSaldo();

        } catch (NumberFormatException e) {
            vista.mostrarMensaje("error Ingrese un valor válidos");
        }
    }

    private void Inyectar() {
        try {
            int monto = Integer.parseInt(vista.getTxtRecarga().getText());

            dao.Inyectar(jugador, monto);
            actualizarSaldo();

            vista.mostrarMensaje("Saldo recargado");

        } catch (NumberFormatException e) {
            vista.mostrarMensaje("Monto inválido");
        }
    }

    private void actualizarSaldo() {
        vista.getLblSaldo().setText("Saldo: " + jugador.getSaldo());
    }
    
}
