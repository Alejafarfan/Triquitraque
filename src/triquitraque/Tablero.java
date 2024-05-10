/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package triquitraque;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author farfa
 */
public class Tablero {

    private JLabel[] lbs;
    private int[][] matrizTablero;
    private boolean stop;
    private String turno;
    private String nextPartida = "O";
    private JLabel lbTurno;

    private JLabel lbPuntajex;
    private JLabel lbpuntajeo;

    private String jugador1;
    private String jugador2;

    private JButton cmd3x3;
    private JButton cmd4x4;
    private JButton cmd5x5;

    private String modo;

    public Tablero(Juego juego) {
        jugador1 = juego.getJugador1();
        jugador2 = juego.getJugador2();
    }

    public Tablero(JLabel[] lbs, int[][] matrizTablero, boolean stop, String turno, JLabel lbTurno, JLabel lbPuntajex, JLabel lbpuntajeo, JButton cmd3x3, JButton cmd4x4, JButton cmd5x5, String modo) {
        this.lbs = lbs;
        this.matrizTablero = matrizTablero;
        this.stop = stop;
        this.turno = "X";
        this.lbTurno = lbTurno;
        this.lbPuntajex = lbPuntajex;
        this.lbpuntajeo = lbpuntajeo;
        this.cmd3x3 = cmd3x3;
        this.cmd4x4 = cmd4x4;
        this.cmd4x4 = cmd5x5;
        this.modo = modo;

    }

    public void colocarFicha(int casilla) {
        if (lbs[casilla - 1].getText().equals("") && stop) {

            lbs[casilla - 1].setText(turno);
            if (modo == "3x3") {
                verificarGanador3x3();
            }
            if (modo == "4x4") {
                verificarGanador4x4();
            }
            if (modo == "5x5") {
                verificarGanador5x5();
            }
            cambiarturno();

            // verificarGanador5x5();
            verficarEmpate();
        }
    }

    public void cambiarturno() {
        if (turno.equals("X")) {
            turno = "O";
        } else {
            turno = "X";
        }
        lbTurno.setText("Turno de " + turno);
    }

    public boolean cambioStop() {
        return stop = true;
    }

    public void verificarGanador3x3() {
        for (int i = 0; i < matrizTablero.length; i++) {
            if (lbs[matrizTablero[i][0] - 1].getText().equals("X")
                    && lbs[matrizTablero[i][1] - 1].getText().equals("X")
                    && lbs[matrizTablero[i][2] - 1].getText().equals("X")) {

                lbs[matrizTablero[i][0] - 1].setBackground(Color.orange);
                lbs[matrizTablero[i][1] - 1].setBackground(Color.orange);
                lbs[matrizTablero[i][2] - 1].setBackground(Color.orange);
                lbPuntajex.setText(Integer.toString(Integer.parseInt(lbPuntajex.getText()) + 1));
                lbTurno.setText("Ganador X");
                stop = false;

            }
            if (lbs[matrizTablero[i][0] - 1].getText().equals("O")
                    && lbs[matrizTablero[i][1] - 1].getText().equals("O")
                    && lbs[matrizTablero[i][2] - 1].getText().equals("O")) {

                lbpuntajeo.setText(Integer.toString(Integer.parseInt(lbpuntajeo.getText()) + 1));
                lbTurno.setText("Ganador O");
                stop = false;

                lbs[matrizTablero[i][0] - 1].setBackground(Color.orange);
                lbs[matrizTablero[i][1] - 1].setBackground(Color.orange);
                lbs[matrizTablero[i][2] - 1].setBackground(Color.orange);

            }
        }
    }

    public void verificarGanador4x4() {
        for (int i = 0; i < matrizTablero.length; i++) {
            if (lbs[matrizTablero[i][0] - 1].getText().equals("X")
                    && lbs[matrizTablero[i][1] - 1].getText().equals("X")
                    && lbs[matrizTablero[i][2] - 1].getText().equals("X")
                    && lbs[matrizTablero[i][3] - 1].getText().equals("X")) {

                lbs[matrizTablero[i][0] - 1].setBackground(Color.orange);
                lbs[matrizTablero[i][1] - 1].setBackground(Color.orange);
                lbs[matrizTablero[i][2] - 1].setBackground(Color.orange);
                lbs[matrizTablero[i][3] - 1].setBackground(Color.orange);
                lbPuntajex.setText(Integer.toString(Integer.parseInt(lbPuntajex.getText()) + 1));
                lbTurno.setText("Ganador X");
                stop = false;

            }
            if (lbs[matrizTablero[i][0] - 1].getText().equals("O")
                    && lbs[matrizTablero[i][1] - 1].getText().equals("O")
                    && lbs[matrizTablero[i][2] - 1].getText().equals("O")
                    && lbs[matrizTablero[i][3] - 1].getText().equals("O")) {

                lbpuntajeo.setText(Integer.toString(Integer.parseInt(lbpuntajeo.getText()) + 1));
                lbTurno.setText("Ganador O");
                stop = false;

                lbs[matrizTablero[i][0] - 1].setBackground(Color.orange);
                lbs[matrizTablero[i][1] - 1].setBackground(Color.orange);
                lbs[matrizTablero[i][2] - 1].setBackground(Color.orange);
                lbs[matrizTablero[i][3] - 1].setBackground(Color.orange);

            }
        }
    }

    public void verificarGanador5x5() {
        for (int i = 0; i < matrizTablero.length; i++) {
            if (lbs[matrizTablero[i][0] - 1].getText().equals("X")
                    && lbs[matrizTablero[i][1] - 1].getText().equals("X")
                    && lbs[matrizTablero[i][2] - 1].getText().equals("X")
                    && lbs[matrizTablero[i][3] - 1].getText().equals("X")
                    && lbs[matrizTablero[i][4] - 1].getText().equals("X")) {

                lbs[matrizTablero[i][0] - 1].setBackground(Color.orange);
                lbs[matrizTablero[i][1] - 1].setBackground(Color.orange);
                lbs[matrizTablero[i][2] - 1].setBackground(Color.orange);
                lbs[matrizTablero[i][3] - 1].setBackground(Color.orange);
                lbs[matrizTablero[i][4] - 1].setBackground(Color.orange);

                lbPuntajex.setText(Integer.toString(Integer.parseInt(lbPuntajex.getText()) + 1));
                lbTurno.setText("Ganador X");
                stop = false;

            }
            if (lbs[matrizTablero[i][0] - 1].getText().equals("O")
                    && lbs[matrizTablero[i][1] - 1].getText().equals("O")
                    && lbs[matrizTablero[i][2] - 1].getText().equals("O")
                    && lbs[matrizTablero[i][3] - 1].getText().equals("O")
                    && lbs[matrizTablero[i][4] - 1].getText().equals("O")) {

                lbpuntajeo.setText(Integer.toString(Integer.parseInt(lbpuntajeo.getText()) + 1));
                lbTurno.setText("Ganador O");
                stop = false;

                lbs[matrizTablero[i][0] - 1].setBackground(Color.orange);
                lbs[matrizTablero[i][1] - 1].setBackground(Color.orange);
                lbs[matrizTablero[i][2] - 1].setBackground(Color.orange);
                lbs[matrizTablero[i][3] - 1].setBackground(Color.orange);
                lbs[matrizTablero[i][4] - 1].setBackground(Color.orange);

            }
        }
    }

    public void SiguientePartida() {
        turno = nextPartida;
        if (nextPartida.equals("O")) {
            nextPartida = "X";
        } else {
            nextPartida = "O";
        }
        lbTurno.setText("Turno de  " + turno);
    }

    public boolean matrizcompleta(JLabel[] lbs) {
        for (JLabel casilla : lbs) {
            if (casilla.getText().isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public void verficarEmpate() {
        if (matrizcompleta(lbs) == true) {
            for (int i = 0; i < lbs.length; i++) {
                lbs[i].setText("");
                lbs[i].setBackground(Color.white);
                SiguientePartida();
                cambioStop();
            }
        }
    }

}
