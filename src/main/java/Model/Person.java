/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chmov
 */
abstract public class Person {
    protected int id;
    protected String name;
    protected char gender;
    protected Date birthDate;
    protected String telephone;
    protected String email;
    protected String rg;

    public Person(int id, String nome) {
        this.id = id;
        this.name = nome;
    }

    public Person(int id, String name, char gender, String birthDate, String telephone, String email, String rg) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        try {
            this.birthDate = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(birthDate);
        } catch (ParseException ex) {
            Logger.getLogger(Person.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.telephone = telephone;
        this.email = email;
        this.rg = rg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return name;
    }

    public void setNome(String nome) {
        this.name = nome;
    }

    public char getSexo() {
        return gender;
    }

    public void setSexo(char sexo) {
        this.gender = sexo;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date dataNascimento) {
        this.birthDate = dataNascimento;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telefone) {
        this.telephone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
    

    
    
}
