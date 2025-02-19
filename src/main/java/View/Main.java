/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;
import Model.Service;
/**
 *
 * @author chmov
 */
public class Main {
    
    public static void main(String[] args) {
        
        Service service = new Service(1, "beard", 30);
        
        System.out.println(service.getDescription());
        System.out.println(service.getValue());
        
        
        
        
    }
    
}
