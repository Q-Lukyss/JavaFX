module org.esaip.evalutation {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.esaip.evalutation to javafx.fxml;
    exports org.esaip.evalutation;
}