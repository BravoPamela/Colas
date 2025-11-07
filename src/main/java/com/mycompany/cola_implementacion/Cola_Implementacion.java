/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cola_implementacion;
import com.mycompany.cola_implementacion.Cola; 

/**
 *
 * @author User
 */
public class Cola_Implementacion {

    public static void main(String[] args) {
        
        Cola colita = new Cola();
        ///encolar
        colita.encolar(10);
        colita.encolar(30);
        colita.encolar(50);
        System.out.println("Cola actual: ");
        colita.mostrar();
        
        //desencolar
        colita.desencolar();
        System.out.println("actualizado");
        colita.mostrar();
    }
}
