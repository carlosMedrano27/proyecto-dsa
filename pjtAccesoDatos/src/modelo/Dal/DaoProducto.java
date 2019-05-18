/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.Dal;

import java.util.List;
import modelo.Dominio.HibernateUtil;
import modelo.Entidades.Products;
import org.hibernate.Session;

/**
 *
 * @author carlos
 */
public class DaoProducto {
    public List<Products> consultar() {
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        return sesion.createQuery("from Products").list();
    }
    
    public List<Products> Productos() {
        List<Products> lst = this.consultar();
        return lst;
    }
    
}
