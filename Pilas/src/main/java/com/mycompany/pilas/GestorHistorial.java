/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pilas;

import java.util.Date;
import java.util.Stack;

/**
 *
 * @author Stefanny
 */
public class GestorHistorial {

    private Stack pila;

    public GestorHistorial() {
        pila = new Stack();
    }

    public void VisitarWeb(PaginaWeb pagina) {
        pila.push(pagina);
        System.out.println("Se agrego la web al historial");
    }

    public void cerrarWeb() {
        PaginaWeb pg = (PaginaWeb) pila.peek();//obtenemos el primer elemento
        pg.setFechaCierre(new Date());//actualizamos la fecha de cierre
        pila.set(0, pg);//actualizamos el objeto 
    }

    public void eliminarWeb() {
        pila.pop();//quitar el ultimo elemento de la pila 
        System.out.println("Se elimino el ultimo sitio web ");

    }

    public PaginaWeb obtenerUltimaWebVisitada() {
        return (PaginaWeb) pila.peek();//obtiene el ultimo        
    }

    public PaginaWeb obtenerVisitaDispositivo(String dispositivo) {
        PaginaWeb ultimoElemento = null;
        for (Object o : pila) {
            PaginaWeb pw = (PaginaWeb) o;
            if (pw.getDispositivos().equals(dispositivo)) {
                ultimoElemento = pw;
            }
        }
        return ultimoElemento;
    }

    public void historial() {
        for (Object object : pila) {
            PaginaWeb p = (PaginaWeb) object;
            System.out.println(p.toString());
        }
    }

    public Stack getPila() {
        return pila;
    }

    public void setPila(Stack pila) {
        this.pila = pila;
    }

}
