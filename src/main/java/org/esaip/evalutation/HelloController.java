package org.esaip.evalutation;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        //HelloApplication.onEmploye+=HelloApplication.onEmploye<HelloApplication.masse.size()?1:0;
        if (HelloApplication.getOnEmploye() < HelloApplication.getMasse().size()) {
            HelloApplication.setOnEmploye(HelloApplication.getOnEmploye() + 1);
        }

        affStatut();

    }
    private void affStatut()
    {
        welcomeText.setText("Fiche employé : " +HelloApplication.getOnEmploye() + "/"+HelloApplication.getMasse().size());

    }
    public void ActionMenuClose() {
        System.exit (0);
    }
    @FXML
    public void onPrecedente() {
        // System.out.println("precedente");
        // System.out.println(HelloApplication.getOnEmploye());
        if (HelloApplication.getOnEmploye() > 0) {
            HelloApplication.setOnEmploye(HelloApplication.getOnEmploye() - 1);
        }
        welcomeText.setText("Fiche employé : " +HelloApplication.getOnEmploye() + "/"+HelloApplication.getMasse().size());
    }
}