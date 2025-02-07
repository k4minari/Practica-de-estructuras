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
    public int sum(){
        int result = 0;
        Nodo nodo = first;
        while(nodo!=null){
            result += nodo.getValue();
            nodo = nodo.getNext(); 
        }
        return result;
    }
    
    /**
     *
     * @param index
     * @return
     */
    
    public Integer get(int index){
        int pos = 0;
        Nodo nodo = first;
        while(nodo != null){
            if(pos == index){
                return nodo.getValue();
            }
            nodo = nodo.getNext();
            pos++;
                    
        }
        return null;
    }
    public Integer getIndex(int value){
        int index = 0;
        Nodo nodo = first;
        while(nodo != null){
            if (nodo.getValue() == value){
                return index;
            }
            index++;
            nodo = nodo.getNext();
                    
        }
        return null;
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
        l.add(50);
        l.add(60);
        l.add(100);
        
        l.print();       // TOCA INVESTIGAR COMO SE UTILIZA EL MODO DEBUG
        System.out.println("Suma = "+l.sum());
        
        System.out.println("get(0): "+l.get(0));
        System.out.println("get(2): "+l.get(2));
        System.out.println("get(4): "+l.get(4));
        System.out.println("get(6): "+l.get(6));
        
        System.out.println("index for value(30): "+l.getIndex(30));
        System.out.println("index for value(10): "+l.getIndex(10));
        System.out.println("index for value(100): "+l.getIndex(100));
        System.out.println("index for value(200): "+l.getIndex(200));
        System.out.println("holip");
    }
    
}

    

