/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurasaplicadas;

/**
 *
 * @author francisco
 */
public class NodoArbol <T> {
    T valor;
    NodoHijo<NodoArbol<T>> primerHijo;

    public NodoArbol(T valor) {
        this.valor = valor;
        this.primerHijo = null;
    }

    public void agregarHijo(NodoArbol<T> hijo) {
        NodoHijo<NodoArbol<T>> nuevoHijo = new NodoHijo<>(hijo);
        if (primerHijo == null) {
            primerHijo = nuevoHijo;
        } else {
            NodoHijo<NodoArbol<T>> actual = primerHijo;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoHijo;
        }
    }

    public T obtenerValor() {
        return valor;
    }

    public NodoHijo<NodoArbol<T>> obtenerPrimerHijo() {
        return primerHijo;
    }
}
