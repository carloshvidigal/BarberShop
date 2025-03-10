/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.ScheduleHelper;
import Model.Booking;
import Model.Client;
import Model.DAO.AgendamentoDAO;
import Model.DAO.ClienteDAO;
import Model.DAO.ServicoDAO;
import Model.Service;
import View.Schedule;
import java.util.ArrayList;

/**
 *
 * @author chmov
 */
public class ScheduleController {
    
    private final Schedule view;
    private final ScheduleHelper helper;
    

    public ScheduleController(Schedule view) {
        this.view = view;
        this.helper = new ScheduleHelper(view);
    }
    
    public void updateTable(){
        
        //Search for the booking list in the database
        AgendamentoDAO bookingDAO = new AgendamentoDAO();
        ArrayList<Booking> bookingList = bookingDAO.selectAll();
        
        //Display this list in the view 
        helper.updateTable(bookingList); 
        
    }
    
    public void updateClient() {
        
        //Search for clients in database
        ClienteDAO clientDAO = new ClienteDAO(); 
        ArrayList<Client> clients = clientDAO.selectAll();
        
                
        //Display clients in Combobox Client
        helper.updateClients(clients);
    }
    
        public void updateService() {
        
        //Search for services in database
        ServicoDAO serviceDAO = new ServicoDAO(); 
        ArrayList<Service> services = serviceDAO.selectAll();
        
                
        //Display clients in Combobox Client
        helper.updateServices(services);
        
    }
    
    
    
    
}
