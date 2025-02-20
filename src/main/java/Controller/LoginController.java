/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.User;
import View.Login;

/**
 *
 * @author chmov
 */
public class LoginController {
    
    private final Login view;

    public LoginController(Login view) {
        this.view = view;
    }
    
    public void executeLogin() {

    }
    
    public void showAlert(){        
        this.view.showAlert("Alert");
    }
}
