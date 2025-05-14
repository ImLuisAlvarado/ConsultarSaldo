/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.cajero.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CuentaBancaria {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String numeroCuenta;
    private String titular;
    private double saldo;
    private String nip;

    public CuentaBancaria(String numeroCuenta, String titular, double saldoInicial, String nip) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldoInicial;
        this.nip = nip;
    }
    
    public CuentaBancaria() {
    
    }


    // Getters y Setters
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNip() {
        return nip;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Método para consultar saldo
    public String consultarSaldo() {
        return "Su saldo actual es: $" + saldo;
    }

    // Método para validar NIP
    public boolean validarNip(String nipIngresado) {
        return this.nip.equals(nipIngresado);
    }
}

