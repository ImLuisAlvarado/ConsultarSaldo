/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.cajero.persistencia;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.criteria.CriteriaQuery;
import mx.itson.cajero.entidades.CuentaBancaria;
import mx.itson.cajero.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;
//import mx.itson.cajero.utils.HibernateUtil;

/**
 *
 * @author ramon
 */
public class CuentaBancariaDAO {    
    public CuentaBancaria obtenerCuentaPorNumero(String numeroCuenta) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            Query<CuentaBancaria> query = session.createQuery(
                "FROM CuentaBancaria WHERE numeroCuenta = :numero", CuentaBancaria.class);
            query.setParameter("numero", numeroCuenta);
            return query.uniqueResult();
        } finally {
            session.close();
        }
    }
}

