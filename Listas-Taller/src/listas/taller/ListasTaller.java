/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listas.taller;

import javax.swing.JOptionPane;

/**
 *
 * @author SCIS2-19
 */
public class ListasTaller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    Nodo primero;
    ListasTaller(){
        primero = null;
    }

    public void insertar(String nombre, int edad){
       try{
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
       }catch(Exception err){
           System.out.println(err);
       }
        
    }
    public void buscarPosicion(int index){
        try{
            if(primero == null){
                JOptionPane.showMessageDialog(null, "Lista vacía");
            }else{
                Nodo temporal = primero;
                JOptionPane.showMessageDialog(null, "Posición "+index);
                int pos = 1;
                
                while(temporal != null && pos < index - 1){
                    
                    temporal = temporal.getDireccion();
                    pos++;
                }
                if (temporal == null) {
                System.out.println("La posición " + index + " no existe en la lista.");
                return;
                }
                JOptionPane.showMessageDialog(null, "Por detras del usuario está "+temporal.getNombre());
                
                temporal = primero;
                JOptionPane.showMessageDialog(null, "Posición "+index);
                pos = 1;
                while(temporal != null && pos < index + 1){
                    
                    temporal = temporal.getDireccion();
                    pos++;
                }
                
                JOptionPane.showMessageDialog(null, "Por delante del usuario está "+temporal.getNombre());
            }

        }catch(Exception err){
            System.out.println(err);
        }
    }
    public void setters(Nodo nuevo, String nombre, int edad){
        nuevo.setNombre(nombre);
        nuevo.setEdad(edad);
        nuevo.setDireccion(null);
    }
    
}
