/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseanimaleenum;

/**
 *
 * @author BraYan
 */
public class clcanimales {
    
    public enum mamiferos {vaca, perro, gato};
    public enum reptiles {tortuga, iguana};
    
    private String nombre;
    private int edad;
    private mamiferos mamiferos;
    private reptiles reptiles;

    public clcanimales() {
    }

    public clcanimales(String nombre, int edad, mamiferos mamiferos, reptiles reptiles) {
        this.nombre = nombre;
        this.edad = edad;
        this.mamiferos = mamiferos;
        this.reptiles = reptiles;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public mamiferos getMamiferos() {
        return mamiferos;
    }

    public void setMamiferos(mamiferos mamiferos) {
        this.mamiferos = mamiferos;
    }

    public reptiles getReptiles() {
        return reptiles;
    }

    public void setReptiles(reptiles reptiles) {
        this.reptiles = reptiles;
    }
    
    
    
}




