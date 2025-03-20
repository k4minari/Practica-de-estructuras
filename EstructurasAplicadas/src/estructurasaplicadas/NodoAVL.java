/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurasaplicadas;

/**
 *
 * @author francisco
 */
public class NodoAVL<T extends Comparable<T>> {
    T valor;
    NodoAVL<T> izquierda;
    NodoAVL<T> derecha;
    int altura;

    public NodoAVL(T valor) {
        this.valor = valor;
        this.altura = 1;
    }
}
