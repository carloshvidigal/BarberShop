/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.User;
import java.util.ArrayList;

/**
 *
 * @author tiago
 */
public class UsuarioDAO {
    
    /**
     * Insere um usuario dentro do banco de dados
     * @param usuario exige que seja passado um objeto do tipo usuario
     */
    public void insert(User usuario){
        Banco.usuario.add(usuario);
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param usuario
     * @return 
     */
    public boolean update(User usuario){
        
        for (int i = 0; i < Banco.usuario.size(); i++) {
            if(idSaoIguais(Banco.usuario.get(i),usuario)){
                Banco.usuario.set(i, usuario);
                return true;
            }
        }
        return false;      

    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do usuario passado
     * @param usuario
     * @return 
     */
    public boolean delete(User usuario){
        for (Object usuarioLista : Banco.usuario) {
            if(idSaoIguais((User) usuarioLista,usuario)){
                Banco.usuario.remove(usuarioLista);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os usuarios do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<User> selectAll(){
        return Banco.usuario;
    }
    
    /**
     * Retorna um Objeto do tipo usuario se a funcao encontrar o usuario passado como parâmetro no banco, para considerar sao usado nome e senha
     * @param usuario
     * @return Usuario encontrado no banco de dados
     */
    public User selectPorNomeESenha(User usuario){
        for (User usuarioLista : Banco.usuario) {
            if(nomeESenhaSaoIguais(usuarioLista,usuario)){
                return usuarioLista;
            }
        }
        return null;
    }

    /**
     * Recebe dois objetos e verifica se são iguais verificando o nome e senha
     * @param usuario
     * @param usuarioAPesquisar
     * @return verdadeiro caso sejam iguais e falso caso nao forem iguais
     */
    private boolean nomeESenhaSaoIguais(User usuario, User usuarioAPesquisar) {
        return usuario.getName().equals(usuarioAPesquisar.getName()) && usuario.getPassword().equals(usuarioAPesquisar.getPassword());
    }

    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param usuario
     * @param usuarioAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idSaoIguais(User usuario, User usuarioAComparar) {
        return usuario.getId() ==  usuarioAComparar.getId();
    }
    
    
    
}
