/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.Dal;

import java.util.List;
import modelo.Dominio.HibernateUtil;
import modelo.Entidades.Categories;
import org.hibernate.Session;

/**
 *
 * @author carlos
 */
public class DaoCategorias {
 public List<Categories> consultar() {
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        return sesion.createQuery("from Categories").list();
    }
    
    public List<Categories> Categorias() {
        List<Categories> lst = this.consultar();
        return lst;
    }   
}
