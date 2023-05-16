package com.csongi.otthoni;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.FlowPane;

public class PrimaryController implements Initializable{
    private ObservableList<Customer> customers;
    
    @FXML
    TableView<Customer> table;
    @FXML
    TableColumn<Customer, Integer> colId;
    @FXML
    TableColumn<Customer, String> firstNameCol;
    @FXML
    TableColumn<Customer, String> lastNameCol;
    @FXML
    TableColumn<Customer, String> addressCol;
    @FXML
    Button button;
    @FXML
    TableColumn<Customer, Integer> ageCol;

    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        initTable();
    }
    @FXML
    FlowPane inputContainer;
    
    @FXML
    TextField inpFistName, inpLastName, inpAddress, inpAge;
    
    @FXML
    public void newOrder() {
        try{
            Customer cust = new Customer(
                    customers.size() + 1,
                    inpFistName.getText(),
                    inpLastName.getText(),
                    inpAddress.getText(),
                    test(Integer.parseInt(inpAge.getText()))
                    
            );
             
                 customers.add(cust);

                 clear();
             
        }catch(Exception e) {
            System.out.println("Hiba: " + e);
        }
    }
    
    private void initTable() {
        this.customers = FXCollections.observableArrayList();
        colId.setCellValueFactory(new PropertyValueFactory<Customer, Integer>("id"));
        firstNameCol.setCellValueFactory(new PropertyValueFactory<Customer, String>("firstName"));
        lastNameCol.setCellValueFactory(new PropertyValueFactory<Customer, String>("lastName"));
        addressCol.setCellValueFactory(new PropertyValueFactory<Customer, String>("address"));
        ageCol.setCellValueFactory(new PropertyValueFactory<Customer, Integer>("age"));
        customers.add(new Customer(1,"Kiss","Csongor","Szeged",19));
        customers.add(new Customer(2,"Hajdú","Elemér","Kecskemét",25));
        table.setItems(customers);
        System.out.println("Ready");
    }

    public void clear() {
                 inpFistName.clear();
                 inpLastName.clear();
                 inpAddress.clear();
                 inpAge.clear();
    }
    public int test(int a) {
        int currentYear = 2023;
        int b = currentYear - a;
        return b;
    }
    public void loader() {
        
        File file = new File("data.txt");
        try {
            file.createNewFile();
            FileWriter writer = new FileWriter(file);
            if(file.exists()) {
                Scanner scanner = new Scanner(file);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
