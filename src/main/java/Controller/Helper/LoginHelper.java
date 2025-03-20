/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import Model.User;
import View.Login;

/**
 *
 * @author chmov
 */
public class LoginHelper implements IHelper {
    
    private final Login view; 

    public LoginHelper(Login view) {
        this.view = view;
    }
    
    public User getModel(){
        String name = view.getUserField().getText();
        String password = view.getPasswordField().getText();
        User userModel = new User(0, name, password);
        return userModel;
    }
    
    public void setModel(User user){
        String name = user.getName();
        String password = user.getPassword();
        
        view.getUserField().setText(name);
        view.getPasswordField().setText(password);
        
        
    }

    @Override
    public void clearScreen() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
