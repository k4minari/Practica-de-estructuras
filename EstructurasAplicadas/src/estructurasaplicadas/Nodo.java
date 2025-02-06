/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurasaplicadas;

/**
 *
 * @author ile1
 */

public class Nodo {
    private int value;
    private Nodo next;
    
    public Nodo(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Nodo getNext() {
        return next;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Nodo{" + 
                "value=" + value + 
                ", next=" + (next != null ? next.getValue(): null) + 
                '}';
    }
     
    public static void main(String[] args){
        Nodo p = new Nodo(10);
        Nodo q = new Nodo(20);
        Nodo r = new Nodo(30);
        
        p.setNext(q);
        q.setNext(r);
        r.setNext(new Nodo (40));
        
        
        System.out.println(p);
        System.out.println(q);
        System.out.println(r);
    }
    
    
}
