/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurasaplicadas;

/**
 *
 * @author francisco
 */
public class Arbol_general <T> {
    public class ArbolGeneral<T> {
    NodoArbol<T> raiz;

    public ArbolGeneral(T valorRaiz) {
        this.raiz = new NodoArbol<>(valorRaiz);
    }

    public NodoArbol<T> obtenerRaiz() {
        return raiz;
    }

    public void imprimirArbol(NodoArbol<T> nodo, int nivel) {
        if (nodo == null) {
            return;
        }

        for (int i = 0; i < nivel; i++) {
            System.out.print("  ");
        }
        System.out.println(nodo.obtenerValor());

        NodoHijo<NodoArbol<T>> hijoActual = nodo.obtenerPrimerHijo();
        while (hijoActual != null) {
            imprimirArbol(hijoActual.nodo, nivel + 1);
            hijoActual = hijoActual.siguiente;
        }
    }

    public void imprimirArbol() {
        imprimirArbol(raiz, 0);
    }
}
    
}
