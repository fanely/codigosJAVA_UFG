/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fbe_aula4.resources;

import com.google.gson.Gson;
import fbe_aula4.dao.ProdutoDAO;
import fbe_aula4.dao.daoImpl.ProdutoDAOImpl;
import fbe_aula4.model.Produto;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author viniciusspatto
 */
@Path("produtos")
public class RecursoProdutos {

    private final ProdutoDAO produtoDao = new ProdutoDAOImpl();
    
    /**
     * Creates a new instance of RecursoProdutos
     */
    public RecursoProdutos() {
    }

    /**
     * Retrieves representation of an instance of fbe_aula4.resources.RecursoProdutos
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/json")
    public Response getProdutos() {
        String produtos = null;
        List<Produto> prodLista = produtoDao.getProdutos();
        try{
            Gson gson = new Gson();
            produtos = gson.toJson(prodLista);
        }catch(Exception e){
            e.printStackTrace();
        }
        if(produtos.isEmpty()){
            return Response.status(Response.Status.NO_CONTENT).build();
        } else{
            return Response.ok(produtos).build();
        }
    }

    @Path("{codigo}")
    @GET
    @Produces("application/json")
    public Response getProduto(@PathParam("codigo") String codigo) {
        String prod = null;
        Produto produto = produtoDao.getProduto(codigo);
        try{
            Gson gson = new Gson();
            prod = gson.toJson(produto);
        }catch(Exception e){
            e.printStackTrace();
        }
        if(prod.isEmpty()){
            return Response.status(Response.Status.NO_CONTENT).build();
        } else{
            return Response.ok(produto).build();
        }
    }
    
    /**
     * PUT method for updating or creating an instance of RecursoProdutos
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/json")
    public void putJson(String content) {
    }
}
