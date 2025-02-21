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
public class Client extends Person{

    private String address;
    private String cep;

    public Client(int id, String name, char gender, String birthDate, String telephone, String email, String rg, String address, String cep) {
        super(id, name, gender, birthDate, telephone, email, rg);
        this.address = address;
        this.cep = cep;
    }

    public Client(int id, String nome, String endereco, String cep) {
        super(id, nome);
        this.address = endereco;
        this.cep = cep;
    }
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String endereco) {
        this.address = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }



    

    


    
}
