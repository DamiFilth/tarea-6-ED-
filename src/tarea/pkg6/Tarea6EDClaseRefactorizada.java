/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.pkg6;

/**
 *
 * @author Deathscythe
 */

    public class Tarea6EDClaseRefactorizada {
    public void aplicarDescuento(double precioProducto, int numProductos){     double Total;
    if(numProductos>3)
        precioProducto-=descuento;
            if (numProductos!=0){
            Total = precioProducto*0.8;
            SalidaConsola(Total);
        }else {
            Total = precioProducto*0.95;
            SalidaConsola(Total);
        }   

    }
    public static final int descuento = 5;

    private void SalidaConsola(double Total) {
        System.out.println("El total a pagar es:"+Total);
        System.out.println("Enviado");
    }
}
    

