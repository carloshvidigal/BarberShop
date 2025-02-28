/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.ScheduleHelper;
import Model.Booking;
import Model.DAO.AgendamentoDAO;
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
    
    
    
}
