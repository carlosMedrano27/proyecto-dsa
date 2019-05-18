/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import modelo.Dal.DaoCategorias;
import modelo.Dal.DaoModel;
import modelo.Entidades.Categories;
import modelo.Entidades.Model;

/**
 * REST Web Service
 *
 * @author carlos
 */
@Path("Models")
public class ModelsResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ModelsResource
     */
    public ModelsResource() {
    }

    /**
     * Retrieves representation of an instance of servicios.ModelsResource
     * @return an instance of modelo.Entidades.Model
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Model> getJson() {
        try {
            List<Model> list = new ArrayList</*Products*/>();          
            DaoModel dp = new DaoModel();
            //list.add(dp.consultar().get(0));
            list.add(dp.consultar().get(1));
//            list.add(dp.consultar().get(2));
            System.out.println(dp.consultar().get(0));
            System.out.println(dp.consultar().get(1));
            System.out.println(dp.consultar().get(2));
            //list.add(dp.consultar().get(0));
            //list.add(dp.consultar().get(4));
            return list;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        } 
    }

    /**
     * PUT method for updating or creating an instance of ModelsResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(Model content) {
    }
}
