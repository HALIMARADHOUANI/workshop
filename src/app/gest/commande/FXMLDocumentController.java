/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.gest.commande;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.lang.Exception;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 *
 * @author asus
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Label tfid;
    @FXML
    private Label tfdésg;
    @FXML
    private Label tfprix;
    @FXML
    private Label tfQté;
    @FXML
    private Label tfcatég;
    @FXML
    private TextField tfdésig;
    @FXML
    private TextField tfprrix;
    @FXML
    private TableView<commande> tvbooks;
    @FXML
    private TableColumn<commande,String> colid;
    @FXML
    private TableColumn<commande, String> coldésig;
    @FXML
    private TableColumn<commande, String> colprix;
    @FXML
    private TableColumn<commande, String> colQté;
    @FXML
    private TableColumn<commande, String> colcatég;
    @FXML
    private Button BTNAjouter;
    @FXML
    private Button BTNEnregistrer;
    @FXML
    private Button BTNSupprimer;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    public Connection getconnection(){
        Connection conn = null;
        try{
            conn=DriverManager.getConnection ("jdbc:mysql://localhost:3306/procommande","root","");
       
            return conn;
        } catch (Exception ex) {
            System.out.println("error:"+ex.getMessage());
        }
        return null;
    }
}
   public observableList<commande> getcommandeList(){
observableList<commande>commandeList=FXCollections.ArrayList();
Connection conn=getconnection;
String query="SELECT*FROM commande";
Statement st;
ResultSet rs;
try~{
st=conn.createStatement();
rs=st.excuteQuery(query);
Books commande;
while(rs.next());

}

}

public void showcommande(){

}

