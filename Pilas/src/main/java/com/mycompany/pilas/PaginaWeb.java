/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pilas;

import java.util.Date;

/**
 *
 * @author Stefanny
 */
public class PaginaWeb {
    
    public String nombre;
    public String ruta;
    public Date horaVisita;
    public byte[] icono;
    public Date fechaCierre;
    public String dispositivos;

    public PaginaWeb(String nombre, String rutta, Date horaVisita, byte[] icono, Date fechaCierre, String dispositivos) {
        this.nombre = nombre;
        this.ruta = ruta;
        this.horaVisita = horaVisita;
        this.icono = icono;
        this.fechaCierre = fechaCierre;
        this.dispositivos = dispositivos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String rutta) {
        this.ruta = ruta;
    }

    public Date getHoraVisita() {
        return horaVisita;
    }

    public void setHoraVisita(Date horaVisita) {
        this.horaVisita = horaVisita;
    }

    public byte[] getIcono() {
        return icono;
    }

    public void setIcono(byte[] icono) {
        this.icono = icono;
    }

    public Date getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(Date fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    public String getDispositivos() {
        return dispositivos;
    }

    public void setDispositivos(String dispositivos) {
        this.dispositivos = dispositivos;
    }

    @Override
    public String toString() {
        return "PaginaWeb{" + "nombre=" + nombre + ", ruta=" + ruta + ", horaVisita=" + horaVisita + ", icono=" + icono + ", fechaCierre=" + fechaCierre + ", dispositivos=" + dispositivos + '}';
    }
      
}
