/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cola_implementacion;
import com.mycompany.cola_implementacion.Nodo;

/**
 *
 * @author User
 */
public class Cola {
    
    private Nodo frente;
    private int tamaño;
    private Nodo ultimo;
    
    boolean respuesta = false;
    public boolean encolar(int dato){
        //crear nodo
        Nodo nuevo = new Nodo (dato);
        //preguntar si la cola esta vacia
        if (isEmpty()){
            
            frente = nuevo;
            ultimo = nuevo;
            respuesta = true;
        }else{
             
            ultimo.siguiente = nuevo;
            ultimo = nuevo;
            respuesta = true;
        }
        
    return respuesta;
    }
    public boolean desencolar(){
       
        if (isEmpty()){
            System.out.println("La cola esta vacia");
            return false;
        }
            System.out.println("El nodo fue eliminado"+frente.dato);
            frente = frente.siguiente;
            
            if (frente == null){
                
                ultimo=null;
            }
            return true;
    }
    
    public boolean isEmpty(){
        
        /*if(frente == null){
            respuesta = true;
        }
    return respuesta;*/
        //directo
        return frente == null;
    }
    
    public int peek(){
        
      return frente.dato;  
    }
    
    public boolean isfull(){
     return true;
    }
    
    public void mostrar(){
    
        Nodo actual = frente;
        while (actual != null){
            System.out.println(actual.dato + "");
            actual = actual.siguiente;
        }
    
        System.out.println("");
    }
    
    
}
