/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurasaplicadas;

/**
 *
 * @author francisco
 */
public class NodoHijo <T> {
    T nodo;
    NodoHijo<T> siguiente;

    public NodoHijo(T nodo) {
        this.nodo = nodo;
        this.siguiente = null;
    }
}
