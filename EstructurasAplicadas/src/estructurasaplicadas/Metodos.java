/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurasaplicadas;

/**
 *
 * @author ile1
 */
public class Metodos {
    public NodoABB Buscar(int valor, NodoABB root)
    {
        if(EsVacio(root))
        {
            return null;
        }else
        {
            if(root.getDato()==valor)
            {
                return root;
            }
            else 
            {
                if(valor<root.getDato())
                {
                    return Buscar(valor, root.getHijoIzq());
                }else
                {
                    return Buscar(valor, root.getHijoDer());
                }
            }
        }
        
    }
    public boolean Insertar(int valor, NodoABB root)
    {
        if(EsVacio(root))
        {
            
            root= new NodoABB(valor);
            return true;
        }else
        {
            if(valor==root.getDato())
            {
                return false;
            }else
            {
                if(valor<root.getDato())
                {
                    if(EsVacio(root.getHijoIzq()))
                    {
                        root.setHijoIzq(new NodoABB(valor));
                        return true;
                    }else
                    {
                        return Insertar(valor, root.getHijoIzq());
                    }
                }else
                {
                    if(EsVacio(root.getHijoDer()))
                    {
                        root.setHijoDer(new NodoABB(valor));
                        return true;
                    }else
                    {
                        return Insertar(valor,root.getHijoDer());
                    }
                }
            }
        }
        
    }
    public NodoABB Maximo (NodoABB node) 
    {
        if(node.getHijoDer()==null)
        {
            return node;
        }else
        {
        return Maximo(node.getHijoDer());
        }
    }
    public NodoABB Borrar(int valor, NodoABB root)
    {
        NodoABB aux= root;
        if(valor<root.getDato())
        {
            root.setHijoIzq(Borrar(valor,root.getHijoIzq()));
        }else
        {
            if(valor > root.getDato())
            {
                root.setHijoDer((Borrar(valor,root.getHijoDer())));
            }else
            {
                if(root.getHijoIzq()!=null && root.getHijoDer()!=null)
                {
                    NodoABB temp= root;
                    NodoABB mayorIzq= Maximo(root.getHijoIzq());
                    root.setDato(mayorIzq.getDato());
                    temp.setHijoIzq(Borrar(mayorIzq.getDato(),temp.getHijoIzq()));
                }else
                {
                    if (root.getHijoIzq()!=null)
                    {
                        aux=root.getHijoIzq();
                    }else
                    {
                        if(root.getHijoDer()!=null)
                        {
                            aux=root.getHijoDer();
                        }else
                        {
                            aux=null;
                        }
                    }
                }
            }
        }return aux;  
    }
    
    //////////////////////////////////////RECORRIDO//////////////////////////
    
    public static void preorden(Nodo nodo) {
    if (nodo != null) {
        System.out.print(nodo.valor + " ");
        preorden(nodo.izquierda);
        preorden(nodo.derecha);
    }
}
    public static void inorden(Nodo nodo) {
    if (nodo != null) {
        inorden(nodo.izquierda);
        System.out.print(nodo.valor + " ");
        inorden(nodo.derecha);
    }
}
    public static void postorden(Nodo nodo) {
    if (nodo != null) {
        postorden(nodo.izquierda);
        postorden(nodo.derecha);
        System.out.print(nodo.valor + " ");
    }
}
    public static void amplitud(Nodo raiz) {
    if (raiz == null) {
        return;
    }

    Nodo[] cola = new Nodo[100]; // Tamaño fijo de la cola
    int frente = 0;
    int fin = 0;

    cola[fin++] = raiz;

    while (frente < fin) {
        Nodo nodoActual = cola[frente++];
        System.out.print(nodoActual.valor + " ");

        if (nodoActual.izquierda != null) {
            cola[fin++] = nodoActual.izquierda;
        }

        if (nodoActual.derecha != null) {
            cola[fin++] = nodoActual.derecha;
        }
    }
}
}
