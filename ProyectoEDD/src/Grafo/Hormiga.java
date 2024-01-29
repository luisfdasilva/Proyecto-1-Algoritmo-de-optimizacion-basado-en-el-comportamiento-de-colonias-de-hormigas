/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafo;

/**
 *
 * @author luis
 */
public class Hormiga {
    private City posicionActual;
    private int[] CiudadesVisitadas;
    private double distanciaRecorrida;
    private int numCiudades;

    public Hormiga(City posicionInicial, int numCiudades) {
        this.posicionActual = posicionInicial;
        this.CiudadesVisitadas = new int[numCiudades];
        this.distanciaRecorrida = 0.0;
        this.numCiudades = numCiudades;
        //inicializar la posicion actual en el array de ciudades visitadas
        this.CiudadesVisitadas[posicionInicial.getId()]=1;
        
    }

    public City getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(City posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int[] getCiudadesVisitadas() {
        return CiudadesVisitadas;
    }

    public void setCiudadesVisitadas(int[] CiudadesVisitadas) {
        this.CiudadesVisitadas = CiudadesVisitadas;
    }

    public double getDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    public void setDistanciaRecorrida(double distanciaRecorrida) {
        this.distanciaRecorrida = distanciaRecorrida;
    }

    public int getNumCiudades() {
        return numCiudades;
    }

    public void setNumCiudades(int numCiudades) {
        this.numCiudades = numCiudades;
    }
    
    
    
}
