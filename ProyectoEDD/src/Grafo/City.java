/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafo;

/**
 *
 * @author luis
 */
public class City {
    private int id;
    private double x;
    private double y;

    public City(int id, double x, double y) {
        this.id = id;
        this.x = x;
        this.y = y;
        
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public double calcularDistancia(City otraCiudad){
        double deltaX =this.x - otraCiudad.x;
        double deltaY =this.y - otraCiudad.y;
        return deltaX * deltaX + deltaY * deltaY;
    }
    
    
}
