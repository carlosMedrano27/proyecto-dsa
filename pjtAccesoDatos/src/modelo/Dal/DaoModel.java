/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.Dal;

import java.util.List;
import modelo.Dominio.HibernateUtil;
import modelo.Entidades.Model;
import org.hibernate.Session;

/**
 *
 * @author carlos
 */
public class DaoModel {
    public List<Model> consultar() {
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        return sesion.createQuery("from Model").list();
    }
    
    public List<Model> Modelos() {
        List<Model> lst = this.consultar();
        return lst;
    }
}
