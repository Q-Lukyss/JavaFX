package org.esaip.evalutation;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.*;
import java.util.LinkedList;

public class HelloApplication extends Application {
     private static LinkedList<Employe> masse = new LinkedList<>();
     private static int onEmploye=0;
     private static final String VERSIONAPP = "0.1";

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 360);
        stage.setTitle("ESAIP-2023-Evaluation Java V"+ VERSIONAPP +" " + System.getProperty("os.name").toLowerCase() + " system");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {

        File fichier = new File("/home/lukyss/Documents/datas.wap");
        if (!fichier.isFile()) {
            System.out.println("sauvegarde ...");
            try {
                ObjectOutputStream oos;
                oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("/home/lukyss/Documents/datas.wap")));
                for (int a = 0; a < 10; a++) {
                    Employe e=new Employe("Doe", "John");
                    masse.add(e);
                    //masse.get(a).afficher();
                    oos.writeObject(e);
                }
                oos.writeObject(masse);
                oos.close();
            } catch (java.io.IOException e1) {
                e1.printStackTrace();
            }
        } else {
            System.out.println("Chargement ...");
            try {
                ObjectInputStream fich = new ObjectInputStream(new FileInputStream("/home/lukyss/Documents/datas.wap"));
                for (int a = 0; a < 10; a++) {
                    Employe e = (Employe) fich.readObject();
                    masse.add(e);
                  //  masse.get(a).afficher();
                }
                fich.close();
            } catch (IOException | ClassNotFoundException e1) {
                e1.printStackTrace();

            }

        }
        launch();
    }

    public static int getOnEmploye() {
        return onEmploye;
    }

    public static void setOnEmploye(int onEmploye) {
        HelloApplication.onEmploye = onEmploye;
    }

    public static LinkedList<Employe> getMasse() {
        return masse;
    }

    public static void setMasse(LinkedList<Employe> masse) {
        HelloApplication.masse = masse;
    }
}
