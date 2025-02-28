/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import Model.Booking;
import View.Schedule;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chmov
 */
public class ScheduleHelper {
    
    private final Schedule view;

    public ScheduleHelper(Schedule view) {
        this.view = view;
    }

    public void updateTable(ArrayList<Booking> bookingList) {
        
       DefaultTableModel tableModel =  (DefaultTableModel) view.getBookingTable().getModel();
       tableModel.setNumRows(0);
       
       for(Booking booking : bookingList){
           
           tableModel.addRow(new Object[]{
               booking.getId(),
               booking.getClient().getName(),
               booking.getService().getDescription(),
               booking.getValue(),
               booking.getFormattedDate(),
               booking.getFormattedHour(),
               booking.getNote()
               
               
               
               
           });
       }
    }
    
    
    
}
