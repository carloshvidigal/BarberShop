/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Booking;
import Model.Client;
import Model.Service;
import Model.User;
import java.text.ParseException;
import java.util.ArrayList;

/**
 *
 * @author tiago
 */
public class Banco {
    
    public static ArrayList<User> usuario;
    public static ArrayList<Client> cliente;
    public static ArrayList<Service> servico;
    public static ArrayList<Booking> agendamento;
    
    
    public static void inicia() throws ParseException{
    
        //Instancia os Objetos
        usuario = new ArrayList<>();
        cliente = new ArrayList<>();
        servico = new ArrayList<>();
        agendamento = new ArrayList<>();
        
        //criando elementos
        
        User usuario1 = new User(1, "barbeiro", 'M', "18/07/1990", "30212121", "rafael.novo@fmpsc.edu.br", "521454123", "barbeiro", "administrador");               
        User usuario2 = new User(2, "estagiario", 'M', "09/05/1996", "30212122", "jefferson.silva@aluno.fmpsc.edu.br", "451244123", "estagiario", "funcionario");        
        User usuario3 = new User(3, "jefferson", 'M', "18/07/1990", "4898823721", "barbeiro@barbershop.com", "12345", "12345", "proprietario");      
        User usuario4 = new User(4, "rafaelprofessor", 'M', "18/07/1990", "4898823721", "barbeiro@barbershop.com", "521454123", "12345", "administrador");
                 
        Client cliente1 = new Client(1, "Alan Figueiredo", 'M', "30/01/1995", "30212126", "rafael.novo@fmpsc.edu.br", "5142487", "Rua jaboti 35 Canudos NH",  "93300012");      
        Client cliente2 = new Client(2, "Judite Oliveira", 'F', "30/08/1994", "30212127", "jefferson.silva@aluno.fmpsc.edu.br", "5142487745", "Rua campo bom 78 Centro NH",  "93300045");       
        Client cliente3 = new Client(3, "Paulo Ricado", 'M', "24/04/1997", "30212128", "pauloricardopet@gmail.com", "78451458", "Rua Tres Irmaos 30 Vila Nova - NH",  "933007496");       
        Client cliente4 = new Client(4, "Neymar Santos", 'M', "20/08/1995", "30212130", "neymarsantospet@gmail.com", "2745487", "Rua Lombardi 40 Canudos NH",  "93300748");        
        Client cliente5 = new Client(5, "Debruine Pipoqueiro", 'M', "13/09/1992", "30212131", "debruinepet@gmail.com", "4742487", "Rua pedro quaresma 784 Canudos Belgica",  "933000847");       
        Client cliente6 = new Client(6, "Matuidi Pareira", 'M', "17/08/1994", "302122324", "matuidipet@gmail.com", "78512457", "Rua champions 10 Kephas Franca",  "933000782");       
        Client cliente7 = new Client(7, "Marta de Souza", 'F', "25/03/1993", "302121292", "martasouzapet@gmail.com", "4658237314", "Rua tesla 215 Canudos NH",  "93352012");        
        Client cliente8 = new Client(8, "Aline Ferrari", 'F', "04/03/1990", "302121451", "alineferraripet@gmail.com", "8475123687", "Rua hyrule 32 Canudos NH",  "9334714747");        
        Client cliente9 = new Client(9, "Samuel Coltinho", 'M', "09/02/1998", "302121189", "samuelcoltinhopet@gmail.com", "74595142487", "Rua floresta 12 Canudos NH",  "9330046364");        
        Client cliente10 = new Client(10, "Felipe Luis", 'M', "12/06/1999", "3021212478", "felipeluispet@gmail.com", "845713647", "Rua marechal 1023 Canudos NH",  "933000874");      
        
        Service servico1 = new Service(1, "Corte Simples", 18);
        Service servico2 = new Service(2, "Corte Degrade", 30);
        Service servico3 = new Service(3, "Barba Simples", 15);
        Service servico4 = new Service(4, "Barba Desenhada", 25);
        Service servico5 = new Service(5, "Sombrancelhas", 10);
        Service servico6 = new Service(6, "Penteados", 35);

        Booking agendamento1 = new Booking(0, cliente9, servico6, 0, "28/11/2023 14:00");
        Booking agendamento2 = new Booking(0, cliente3, servico1, 0, "28/11/2023 14:00");
        Booking agendamento3 = new Booking(0, cliente5, servico3, 0, "28/11/2023 14:00");

     
        //Adiciona Elementos na lista
        usuario.add(usuario1);
        usuario.add(usuario2);
        usuario.add(usuario3);
        usuario.add(usuario4);
        
        cliente.add(cliente1);
        cliente.add(cliente2);
        cliente.add(cliente3);
        cliente.add(cliente4);
        cliente.add(cliente5);
        cliente.add(cliente6);
        cliente.add(cliente7);
        cliente.add(cliente8);
        cliente.add(cliente9);
        cliente.add(cliente10);
        
        servico.add(servico1);
        servico.add(servico2);
        servico.add(servico3);
        servico.add(servico4);
        servico.add(servico5);
        servico.add(servico6);
        
        agendamento.add(agendamento1);
        agendamento.add(agendamento2);
        agendamento.add(agendamento3);
        
    }
    
    
}
