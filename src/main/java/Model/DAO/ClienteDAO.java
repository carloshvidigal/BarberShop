/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Client;
import java.util.ArrayList;

/**
 *
 * @author tiago
 */
public class ClienteDAO {
    
    
    /**
     * Insere um cliente dentro do banco de dados
     * @param cliente exige que seja passado um objeto do tipo cliente
     */
    public void insert(Client cliente){
        Banco.cliente.add(cliente);
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param cliente
     * @return 
     */
    public boolean update(Client cliente){
        
        for (int i = 0; i < Banco.cliente.size(); i++) {
            if(idSaoIguais(Banco.cliente.get(i),cliente)){
                Banco.cliente.set(i, cliente);
                return true;
            }
        }
        return false;      

    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do cliente passado
     * @param cliente
     * @return 
     */
    public boolean delete(Client cliente){
        for (Client clienteLista : Banco.cliente) {
            if(idSaoIguais(clienteLista,cliente)){
                Banco.cliente.remove(clienteLista);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os clientes do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<Client> selectAll(){
        return Banco.cliente;
    }
    
    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param cliente
     * @param clienteAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idSaoIguais(Client cliente, Client clienteAComparar) {
        return cliente.getId() ==  clienteAComparar.getId();
    }
    
    
    
}
