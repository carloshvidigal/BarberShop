/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;
import Model.Service;
import Model.Client;
import Model.User;

/**
 *
 * @author chmov
 */
public class Main {
    
    public static void main(String[] args) {
        
        Service service = new Service(1, "beard", 30);
        
        System.out.println(service.getDescription());
        System.out.println(service.getValue());
        
        Client client = new Client(1, "CH", 'M', "93939393", "Rua Mar de Morros, 94" );
        System.out.println(client);
        
        User user = new User(1, "Barber", "1234");
        System.out.println(user);
        
        
        
                
        
        
        
    }
    
}
