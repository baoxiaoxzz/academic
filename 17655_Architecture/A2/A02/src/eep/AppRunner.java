/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eep;

import eep.controller.HomeController;
import eep.controller.LoginController;

/**
 *
 * @author walid
 */
public class AppRunner {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LoginController controller = new LoginController();
                controller.renderView();
            }
        });
    }

    

    

    

    
    
}
