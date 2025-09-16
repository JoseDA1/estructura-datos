/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listacircular;

import javax.swing.JOptionPane;

/**
 *
 * @author SCIS2-19
 */
public class ListaCircular {
    Nodo primero;
    Nodo ultimo;
    ListaCircular(){
        primero=null;
        ultimo=null;
    }
    public void crearInicio(){
        int numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero"));
        Nodo nuevo = new Nodo();
        nuevo.setNumero(numero);
        nuevo.setEnlace(nuevo);
        if(primero == null){
            primero = nuevo;
            ultimo=nuevo;
        }else{
            nuevo.setEnlace(primero);
            primero = nuevo;
            ultimo.setEnlace(primero);
        }
    }
    public void consultar(){
        Nodo temporal = primero;
        if(temporal==null){
            JOptionPane.showMessageDialog(null, "Lista vacía");
        }else{
            do{
                JOptionPane.showMessageDialog(null, "Numero: "+temporal.getNumero());
                temporal=temporal.getEnlace();
            }while(temporal!=primero);
        }
    }
    //buscar un elemento y remplazarlo
    public void modificar(){
        try{
           int numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero"));
        Nodo temporal = primero;
        if(temporal==null){
            JOptionPane.showMessageDialog(null, "Lista vacía");
        }else{
            do{
                if(numero == temporal.getNumero()){
                    int modify=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero modificado"));

                    temporal.setNumero(modify);
                }else{
                    JOptionPane.showMessageDialog(null, "A: "+temporal.getNumero());
                }
                temporal=temporal.getEnlace();
            }while(temporal!=primero);
        } 
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
