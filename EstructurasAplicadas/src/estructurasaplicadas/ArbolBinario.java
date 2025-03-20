/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurasaplicadas;

/**
 *
 * @author francisco
 */
public class ArbolBinario<T> {
    NodoBinario<T> raiz;

    public ArbolBinario() {
        this.raiz = null;
    }

    public void insertar(T valor) {
        raiz = insertarRecursivo(raiz, valor);
    }

    private NodoBinario<T> insertarRecursivo(NodoBinario<T> nodo, T valor) {
        if (nodo == null) {
            return new NodoBinario<>(valor);
        }

        // Aquí puedes definir la lógica de inserción (por ejemplo, como un árbol de búsqueda binaria)
        // Por simplicidad, este ejemplo inserta siempre a la izquierda
        if (nodo.izquierda == null) {
            nodo.izquierda = insertarRecursivo(nodo.izquierda, valor);
        } else {
            nodo.derecha = insertarRecursivo(nodo.derecha, valor);
        }
        return nodo;
    }

    public void imprimirInorden() {
        imprimirInordenRecursivo(raiz);
    }

    private void imprimirInordenRecursivo(NodoBinario<T> nodo) {
        if (nodo != null) {
            imprimirInordenRecursivo(nodo.izquierda);
            System.out.print(nodo.valor + " ");
            imprimirInordenRecursivo(nodo.derecha);
        }
    }
}
