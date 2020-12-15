/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fbe_aula4.dao.daoImpl;

import fbe_aula4.model.Produto;
import fbe_aula4.dao.HibernateUtil;
import fbe_aula4.dao.ProdutoDAO;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author viniciusspatto
 */
public class ProdutoDAOImpl implements ProdutoDAO{
    
    SessionFactory sessionFactory = null;
    
    public ProdutoDAOImpl(){
        sessionFactory = HibernateUtil.getSessionFactory();
    }
    
    /**
     * Metodo chamado para executar a query para recuperar todos os produtos
     * no banco de dados (tabela produtos - bd supermercado)
     * @return List<Produto> produtos
    */
    public List<Produto> getProdutos(){
        List<Produto> produtos = null;
        Session session = null;
        try {            
            session = sessionFactory.openSession();
            session.beginTransaction();
            produtos = session.createQuery("from Produto").list();
            //**** Exemplo de uso de Criteria
//            Criteria criteria = session.createCriteria(Produto.class);
//            criteria.add(Restrictions.like("nome", "%ar%"));
//            produtos = criteria.list();
            //**** Fim do exemplo de Criteria
            session.getTransaction().commit();
        } catch(Exception e){
            if(session != null){
                session.getTransaction().rollback();
            }
        } finally{
            if(session != null){
                session.close();
            }
        }
        return produtos;
    }

    /**
     * Metodo chamado para executar a query para recuperar um produto
     * no banco de dados (tabela produtos - bd supermercado)
     * @Param String codigo
     * @return Produto produto
    */
    public Produto getProduto(String codigo){
        Produto produto = null;
        Session session = null;
        try{
            session = sessionFactory.openSession();
            session.beginTransaction();
            produto = (Produto)session.createQuery("from Produto p where p.codigo = :cod").setString("cod", codigo).uniqueResult();
            session.getTransaction().commit();
        } catch(Exception e){
            if(session != null){
                session.getTransaction().rollback();
            }
        } finally{
            if(session != null){
                session.close();
            }
        }
        return produto;
    }

    /**
     * Metodo chamado para executar a query para inserir um produto
     * no banco de dados (tabela produtos - bd supermercado)
     * @Param Produto produto
     * @return boolean
    */
    //public boolean addProduto(Produto produto){
    // TODO
    //}
    
    /**
     * Metodo chamado para executar a query para atalizar um produto
     * no banco de dados (tabela produtos - bd supermercado)
     * @Param Produto produto
     * @return boolean
    */
    //public boolean setProduto(Produto produto){
    // TODO
    //}

    /**
     * Metodo chamado para executar a query para excluir um produto
     * no banco de dados (tabela produtos - bd supermercado)
     * @Param String codigo
     * @return boolean
    */
    //public boolean delProduto(String codigo){
    // TODO
    //}

    
}
