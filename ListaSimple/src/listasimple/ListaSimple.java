/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listasimple;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class ListaSimple {

    Nodo primero;
    ListaSimple(){
        primero = null;
    }
    public void inicio(String nombre, int edad){
        Nodo nuevo = new Nodo();
        setters(nuevo, nombre, edad);
        
        if(primero == null){
            primero=nuevo;
        }else{
            nuevo.setDireccion(primero);
            primero=nuevo;
        }
    };
    public void ultimo(String nombre, int edad){
        Nodo nuevo = new Nodo();

        setters(nuevo, nombre, edad);
        
        if(primero == null){
            JOptionPane.showMessageDialog(null, "Lista vacía");
            primero = nuevo;
        }else{
            Nodo temporal = primero;
            while(temporal.getDireccion()!=null){
                temporal = temporal.getDireccion();
            }
                temporal.setDireccion(nuevo);
        }
        
    }
    public void consultar(){
        Nodo temporal = primero;
        if(temporal == null){
            JOptionPane.showMessageDialog(null, "Lista vacía");
        }else{
            while(temporal!=null){
                JOptionPane.showMessageDialog(null, "Nombre: "+temporal.getNombre()+"; Edad: "+temporal.getEdad());
                temporal = temporal.getDireccion();
            }
        }
    }
    public void setters(Nodo nuevo, String nombre, int edad){
        nuevo.setNombre(nombre);
        nuevo.setEdad(edad);
        nuevo.setDireccion(null);
    }
    
}
