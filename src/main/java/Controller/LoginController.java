/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.LoginHelper;
import Model.DAO.UsuarioDAO;
import Model.User;
import View.Login;

/**
 *
 * @author chmov
 */
public class LoginController {
    
    private final Login view;
    private LoginHelper helper;

    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    public void executeLogin() {
        User user = helper.getModel();
        UsuarioDAO userDAO = new UsuarioDAO();

        

    }
    
    public void showAlert(){        
        this.view.showAlert("Alert");
    }
}
