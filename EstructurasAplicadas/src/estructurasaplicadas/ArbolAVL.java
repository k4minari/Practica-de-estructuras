/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurasaplicadas;

/**
 *
 * @author francisco
 */
public class ArbolAVL<T extends Comparable<T>> {
    NodoAVL<T> raiz;

    public ArbolAVL() {
        this.raiz = null;
    }

    public void insertar(T valor) {
        raiz = insertarRecursivo(raiz, valor);
    }

    private NodoAVL<T> insertarRecursivo(NodoAVL<T> nodo, T valor) {
        if (nodo == null) {
            return new NodoAVL<>(valor);
        }

        int comparacion = valor.compareTo(nodo.valor);

        if (comparacion < 0) {
            nodo.izquierda = insertarRecursivo(nodo.izquierda, valor);
        } else if (comparacion > 0) {
            nodo.derecha = insertarRecursivo(nodo.derecha, valor);
        } else {
            return nodo; // No se permiten valores duplicados
        }

        // Actualizar la altura del nodo actual
        nodo.altura = 1 + Math.max(obtenerAltura(nodo.izquierda), obtenerAltura(nodo.derecha));

        // Obtener el factor de equilibrio
        int factorEquilibrio = obtenerFactorEquilibrio(nodo);

        // Realizar rotaciones si el árbol está desequilibrado
        if (factorEquilibrio > 1 && valor.compareTo(nodo.izquierda.valor) < 0) {
            return rotacionDerecha(nodo);
        }

        if (factorEquilibrio < -1 && valor.compareTo(nodo.derecha.valor) > 0) {
            return rotacionIzquierda(nodo);
        }

        if (factorEquilibrio > 1 && valor.compareTo(nodo.izquierda.valor) > 0) {
            nodo.izquierda = rotacionIzquierda(nodo.izquierda);
            return rotacionDerecha(nodo);
        }

        if (factorEquilibrio < -1 && valor.compareTo(nodo.derecha.valor) < 0) {
            nodo.derecha = rotacionDerecha(nodo.derecha);
            return rotacionIzquierda(nodo);
        }

        return nodo;
    }

    private int obtenerAltura(NodoAVL<T> nodo) {
        if (nodo == null) {
            return 0;
        }
        return nodo.altura;
    }

    private int obtenerFactorEquilibrio(NodoAVL<T> nodo) {
        if (nodo == null) {
            return 0;
        }
        return obtenerAltura(nodo.izquierda) - obtenerAltura(nodo.derecha);
    }

    private NodoAVL<T> rotacionDerecha(NodoAVL<T> y) {
        NodoAVL<T> x = y.izquierda;
        NodoAVL<T> T2 = x.derecha;

        x.derecha = y;
        y.izquierda = T2;

        y.altura = 1 + Math.max(obtenerAltura(y.izquierda), obtenerAltura(y.derecha));
        x.altura = 1 + Math.max(obtenerAltura(x.izquierda), obtenerAltura(x.derecha));

        return x;
    }

    private NodoAVL<T> rotacionIzquierda(NodoAVL<T> x) {
        NodoAVL<T> y = x.derecha;
        NodoAVL<T> T2 = y.izquierda;

        y.izquierda = x;
        x.derecha = T2;

        x.altura = 1 + Math.max(obtenerAltura(x.izquierda), obtenerAltura(x.derecha));
        y.altura = 1 + Math.max(obtenerAltura(y.izquierda), obtenerAltura(y.derecha));

        return y;
    }

    public void imprimirInorden() {
        imprimirInordenRecursivo(raiz);
    }

    private void imprimirInordenRecursivo(NodoAVL<T> nodo) {
        if (nodo != null) {
            imprimirInordenRecursivo(nodo.izquierda);
            System.out.print(nodo.valor + " ");
            imprimirInordenRecursivo(nodo.derecha);
        }
    }
}
