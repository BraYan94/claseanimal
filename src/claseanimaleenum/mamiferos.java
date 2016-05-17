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
public class mamiferos extends clcanimales {
    
    private double peso;
    private String color;

    public mamiferos() {
    }

    public mamiferos(double peso, String color) {
        this.peso = peso;
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
    
    
}

