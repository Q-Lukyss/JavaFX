package org.esaip.evalutation;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Label welcomeText;
    @FXML
    private TextField inputPrenom;
    @FXML
    private TextField inputNom;
    @FXML
    private TextField inputDatenaiss;

    @FXML
    protected void onHelloButtonClick() throws ParseException {
        //HelloApplication.onEmploye+=HelloApplication.onEmploye<HelloApplication.masse.size()?1:0;
        if (HelloApplication.getOnEmploye() < HelloApplication.getMasse().size()) {
            HelloApplication.setOnEmploye(HelloApplication.getOnEmploye() + 1);
        }
        System.out.println(inputPrenom.getText());
        System.out.println(inputNom.getText());
        System.out.println(inputDatenaiss.getText());

        //Employe e = new Employe(inputNom.getText(), inputPrenom.getText());
        //SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        //e.setDateNaissance(simpleDateFormat.parse(inputDatenaiss.getText()));

        affStatut();

    }
    private void affStatut()
    {
        welcomeText.setText("Fiche employé : " +HelloApplication.getOnEmploye() + "/"+HelloApplication.getMasse().size());
        afficherEmployeDansTextField();

    }
    public void ActionMenuClose() {
        System.exit (0);
    }
    @FXML
    public void onPrecedente() {
        // System.out.println("precedente");
        // System.out.println(HelloApplication.getOnEmploye());
        if (HelloApplication.getOnEmploye() > 1) {
            HelloApplication.setOnEmploye(HelloApplication.getOnEmploye() - 1);
        }
        welcomeText.setText("Fiche employé : " + HelloApplication.getOnEmploye() + "/"+HelloApplication.getMasse().size());
    }

    private void afficherEmployeDansTextField() {
        if (HelloApplication.getOnEmploye() <= HelloApplication.getMasse().size()) {
            Employe employe = HelloApplication.getMasse().get(HelloApplication.getOnEmploye());
            inputNom.setText(employe.getNom());
            inputPrenom.setText(employe.getPrenom());
            inputDatenaiss.setText(String.valueOf(employe.getDateNaissance()));
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        afficherEmployeDansTextField();
    }
}