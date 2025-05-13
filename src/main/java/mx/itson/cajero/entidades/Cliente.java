/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.cajero.entidades;

/**
 *
 * @author darkheaven
 */
public class Cliente {
    //entidades
    private String id;
    private String nombre;
    private String apellido;
    private CuentaBancaria cuenta;

    // Constructor
    public Cliente(String id, String nombre, String apellido, CuentaBancaria cuenta) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuenta = cuenta;
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public CuentaBancaria getCuenta() {
        return cuenta;
    }

    public void setCuenta(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }

    // Método para obtener nombre completo
    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }
}

