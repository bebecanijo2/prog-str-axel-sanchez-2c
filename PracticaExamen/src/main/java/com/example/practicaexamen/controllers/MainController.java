package com.example.practicaexamen.controllers;

import com.example.practicaexamen.services.ContactService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.util.List;

public class MainController {

        @FXML
        private TextField txtNombre;

        @FXML
        private TextField txtTelefono;

        @FXML
        private ComboBox<String> cmbParentesco;

        @FXML
        private ListView<String> listView;

        @FXML
        private Label lblMsg;


        private ObservableList<String> data = FXCollections.observableArrayList();

        ContactService service = new ContactService();

        String[] parentescos = {
                "Padre",
                "Madre",
                "Hermano",
                "Hermana",
                "Abuelo",
                "Abuela",
                "Tío",
                "Tía"
        };


        @FXML
        public void initialize() {

            listView.setItems(data);

            cmbParentesco.getItems().addAll(parentescos);

            reload();

            listView.getSelectionModel().selectedItemProperty().addListener(
                    (obs, o, n) -> {

                        if (n != null) {

                            String[] p = n.split("-");

                            txtNombre.setText(p[0]);
                            txtTelefono.setText(p[1]);
                            cmbParentesco.setValue(p[2]);
                        }
                    }
                    );
        }


        @FXML
        public void onAdd() {

            try {

                service.addContact(txtNombre.getText(), txtTelefono.getText(), cmbParentesco.getValue());
                reload();
                clear();

            } catch (Exception e) {
                lblMsg.setText(e.getMessage());
            }
        }


        @FXML
        public void onDelete() {

            int index = listView.getSelectionModel().getSelectedIndex();

            service.deleteContact(index);

            reload();
            clear();
        }


        @FXML
        public void onUpdate() {

            int index = listView.getSelectionModel().getSelectedIndex();

            service.updateContact(index, txtNombre.getText(), txtTelefono.getText(), cmbParentesco.getValue());

            reload();
        }


        @FXML
        public void onSearch() {

            String nombre = txtNombre.getText();

            var c = service.search(nombre);

            if (c != null) {

                txtTelefono.setText(c.getTelefono());
                cmbParentesco.setValue(c.getParentesco());

            } else {
                lblMsg.setText("No encontrado");
            }
        }


        @FXML
        public void onClear() {

            clear();
        }


        private void reload() {

            List<String> items = service.loadForListView();

            data.setAll(items);
        }


        private void clear() {

            txtNombre.clear();
            txtTelefono.clear();
            cmbParentesco.setValue(null);
        }
    }
