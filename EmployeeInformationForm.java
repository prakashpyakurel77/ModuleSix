package Homework06;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JLabel;

public class EmployeeInformationForm extends Frame implements ActionListener {

    JLabel nameLabel, idLabel, deptLabel;
    TextField nameField, idField, deptField;
    Button submitButton;

    public EmployeeInformationForm () {
        
        setTitle("Employee Information Form");
        setSize(400, 300);
        setLayout(new GridLayout(4, 2, 10, 10));
        setLocationRelativeTo(null); // Center the form

        // Create components
        nameLabel = new Label("Name:");
        nameField = new TextField();

        idLabel = new Label("Employee ID:");
        idField = new TextField();

        deptLabel = new Label("Department:");
        deptField = new TextField();

        submitButton = new Button("Submit");
        submitButton.addActionListener(this);

        add(nameLabel);
        add(nameField);

        add(idLabel);
        add(idField);

        add(deptLabel);
        add(deptField);

        add(new Label()); 
        add(submitButton);

       
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText();
        String id = idField.getText();
        String dept = deptField.getText();

        String message = "Employee Details:\n"
                + "Name: " + name + "\n"
                + "Employee ID: " + id + "\n"
                + "Department: " + dept;

       
       
    }

    public static void main(String[] args) {
        new EmployeeInformationForm();
    }
