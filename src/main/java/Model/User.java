/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author chmov
 */
public class User extends Person {

    protected String password;
    protected String accessLevel;

    public User(int id, String nome, String senha) {
        super(id, nome);
        this.password = senha;
    }

    public User(String password, String accessLevel, int id, String name, char gender, String birthDate, String telephone, String email, String rg) {
        super(id, name, gender, birthDate, telephone, email, rg);
        this.password = password;
        this.accessLevel = accessLevel;
    }

    public String getSenha() {
        return password;
    }

    public void setSenha(String senha) {
        this.password = senha;
    }

    public String getNivelAcesso() {
        return accessLevel;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.accessLevel = nivelAcesso;
    }
    
    

    


    
    
    
    
    
}
