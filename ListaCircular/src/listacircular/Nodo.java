/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listacircular;

/**
 *
 * @author SCIS2-19
 */
public class Nodo {
    private int numero;
    private Nodo enlace;

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the enlace
     */
    public Nodo getEnlace() {
        return enlace;
    }

    /**
     * @param enlace the enlace to set
     */
    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }
}
