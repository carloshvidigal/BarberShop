/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import Model.Booking;
import Model.Client;
import Model.Service;
import View.Schedule;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chmov
 */
public class ScheduleHelper implements IHelper {
    
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

    public void updateClients(ArrayList<Client> clients) {

       DefaultComboBoxModel comboBoxClientModel =  (DefaultComboBoxModel) view.getClientCombo().getModel();
       

       for(Client client : clients) {
           
           comboBoxClientModel.addElement(client);
       }
    }

    public void updateServices(ArrayList<Service> services) {
   
       DefaultComboBoxModel comboBoxServiceModel =  (DefaultComboBoxModel) view.getServiceCombo().getModel();
        
       for(Service service : services) {
           
           comboBoxServiceModel.addElement(service);
       }
        
    }
     
    public Client getClient() {
        return (Client) view.getClientCombo().getSelectedItem();
    }

    public Service getService() {
        return (Service) view.getServiceCombo().getSelectedItem();
    }

    public void setValue(float value) {       
        view.getValueField().setText(value + "");
    }

    @Override
    public Object getModel() {
        String idString = view.getIdField().getText();
        int id = Integer.parseInt(idString);
        Client client = getClient();
        Service service = getService();
        String valueString = view.getValueField().getText();
        float value = Float.parseFloat(valueString);
        String data = view.getDateField().getText();
        String hora = view.getHourField().getText();
        String dateHour = data + " " + hora;
        String note = view.getOtherInfoTextArea().getText();
        
        Booking booking = new Booking(id, client, service, value, dateHour, note);
        return booking;        
    }

    @Override
    public void clearScreen() {
        view.getIdField().setText("");
        view.getDateField().setText("");
        view.getHourField().setText("");
        view.getOtherInfoTextArea().setText("");                   
    }
}
