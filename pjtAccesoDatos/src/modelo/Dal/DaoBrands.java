/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.Dal;

import java.util.List;
import modelo.Dominio.HibernateUtil;
import modelo.Entidades.Brands;
import org.hibernate.Session;

/**
 *
 * @author carlos
 */
public class DaoBrands {
    public List<Brands> consultar() {
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        return sesion.createQuery("from Brands").list();
    }
    
    public List<Brands> Brands() {
        List<Brands> lst = this.consultar();
        return lst;
    }
}
