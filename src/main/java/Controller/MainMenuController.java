/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.MainMenu;
import View.Schedule;

/**
 *
 * @author chmov
 */
public class MainMenuController {
    
     private final MainMenu view;

    public MainMenuController(MainMenu view) {
        this.view = view;
    }
    
    public void openSchedule(){
        Schedule schedule = new Schedule();
        schedule.setVisible(true);
        
        
    }
     
     
     
    
}
