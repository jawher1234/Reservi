/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Admin;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author ahmed
 */
public class ReservationNavBarController implements Initializable {

    @FXML
    private BorderPane bp;
    @FXML
    private Button btnNosReservations;
    @FXML
    private Button btnNouveau;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        loadPage("/gui/Admin/ReservationsList");
    }    

    @FXML
    private void nosReservations(ActionEvent event) {
        loadPage("/gui/Admin/ReservationsList");
    }
    
    private void loadPage(String page){
        Parent root=null;
        try{
            root = FXMLLoader.load(getClass().getResource(page+".fxml"));
            
        } catch (IOException ex) {
            Logger.getLogger(TerrainNavBarController.class.getName()).log(Level.SEVERE, null, ex);
        }
        bp.setCenter(root);
        
    }
    
}
