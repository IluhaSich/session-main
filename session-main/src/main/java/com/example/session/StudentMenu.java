package com.example.session;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class StudentMenu {

    @FXML
    private Button btn_back;

    @FXML
    private Button btn_passExam;

    @FXML
    private TableColumn<?, ?> col_Data;

    @FXML
    private TableColumn<?, ?> col_subject;

    @FXML
    private TableColumn<?, ?> col_teacherName;

    @FXML
    private Label lbl_info;

    @FXML
    private TableView<?> table_subjects;

    @FXML
    void go_back(ActionEvent event) throws IOException {
        Stage stage = (Stage) btn_back.getScene().getWindow();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("login.fxml")));
        stage.setTitle("Session");
        stage.setScene(new Scene(root));
        stage.show();
    }

}
