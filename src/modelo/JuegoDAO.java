/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author UIS
 */
public class JuegoDAO {
      private List<Jugador>listaJugadores= new ArrayList<>();
      private  List<Juego>listaJuego=new ArrayList<>();
    public int girarRuleta() {
        return (int) (Math.random() * 37);
    }

    
    public boolean puedeApostar(Jugador jugador, int apuesta) {
        return jugador.getSaldo() >= apuesta;
    }

    
    public String jugar(Jugador jugador, int numeroElegido, int apuesta) {
        if (!puedeApostar(jugador, apuesta)) {
            return "Saldo insuficiente";
        }

        int numeroGanador = girarRuleta();

        if (numeroGanador == numeroElegido) {
            int ganancia = apuesta * 35;
            jugador.setSaldo(jugador.getSaldo() + ganancia);
            return "Ganaste  Número: " + numeroGanador + " Premio: " + ganancia;
        } else {
            jugador.setSaldo(jugador.getSaldo() - apuesta);
            return "Perdiste  Número: " + numeroGanador;
        }
    }

    public void Inyectar(Jugador jugador, int monto) {
        jugador.setSaldo(jugador.getSaldo() + monto);
    }
 
}

