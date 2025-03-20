/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurasaplicadas;

/**
 *
 * @author francisco
 */
public class NodoBinario<T> {
    T valor;
    NodoBinario<T> izquierda;
    NodoBinario<T> derecha;

    public NodoBinario(T valor) {
        this.valor = valor;
        this.izquierda = null;
        this.derecha = null;
    }
}
