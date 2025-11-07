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
            nuevo = ultimo;
            respuesta = true;
        }
        
    return respuesta;
    }
    public String desencolar(){
        
        if (isEmpty()){
            return "La cola esta vacia";
        }else{
            
        }
        
    return "";
    }
    
    public boolean isEmpty(){
        
        if(frente == null){
            respuesta = true;
        }
    return respuesta;
    }
    
    public int peek(){
        
      return frente.dato;  
    }
    public boolean isfull(){
     return true;
    }
    public void mostrar(){
    
    }
}
