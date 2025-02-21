/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.LoginHelper;
import Model.DAO.UsuarioDAO;
import Model.User;
import View.Login;
import View.MainMenu;

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
        
        //get user from view
        User user = helper.getModel();
        
        //Search user in database
        UsuarioDAO userDAO = new UsuarioDAO();
        User authenticatedUser =  userDAO.selectPorNomeESenha(user);
        
        if (authenticatedUser != null ) {
            MainMenu menu = new MainMenu();
            menu.setVisible(true);
            this.view.dispose();
            
        }else {
            view.showAlert("Invalid Username or Password!");
        }
     
        

    }
    

}
