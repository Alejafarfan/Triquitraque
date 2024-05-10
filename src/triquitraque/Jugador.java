/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package triquitraque;

/**
 *
 * @author farfa
 */
public class Jugador {
        private String Nombre;
    private String color;

    public Jugador(String Nombre) {
        this.Nombre = Nombre;
    }

    public Jugador(String Nombre, String color) {
        this.Nombre = Nombre;
        this.color = color;
    }
    

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}

