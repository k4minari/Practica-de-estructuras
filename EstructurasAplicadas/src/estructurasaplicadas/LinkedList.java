/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurasaplicadas;

/**
 *
 * @author ile1
 */
public class LinkedList {
    
    private Nodo first;

    public int getSize() {
        return size;
    }
    
    private int size;
    
    public LinkedList(){
        first = null; 
        size = 0;
                
    }
    public void add(int value){
        Nodo nodo = new Nodo(value);
        
        if(size == 0){ //Lista vacia
            first = nodo;
            size = 1;
        }else{ //lista no vacia
            Nodo aux = first;
            while (aux.getNext() != null){
                aux = aux.getNext();
            }
            
            aux.setNext(nodo);
            size++;
           
        }
    }
    /**
     * Imprime los elementos de la lista
     */
    public void print(){
        Nodo aux = first;
        while(aux != null){
            System.out.println("nodo: "+ aux.getValue());
            aux = aux.getNext();
        }
        
    }
    /**
     *
     * @param args
     */
    public static void main(String[] args){
        LinkedList l = new LinkedList();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        
        l.print();       // TOCA INVESTIGAR COMO SE UTILIZA EL MODO DEBUG
    }
}

    

