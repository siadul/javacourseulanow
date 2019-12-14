package zajecia11.gui.notepad;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;

public class Controller {
    public Button btn1;
    public Label label1;
    public Pane pane1;
    public TextArea textArea1;

    @FXML
    public void initialize() {
        // jeżeli mamy zwykłego Pane, musimy "ręcznie"
        // zapewnić responsywność komponentów w aplikacji
//        textArea1.getPrefWidth(); // getPrefWidth zwraca nam double, możemy pobrać informację o szerokości, ale nie uda nam się powiązać jej
//        textArea1.prefWidthProperty().bind(pane1.widthProperty()); // prefWidthProperty zwraca nam Property, który możemy
        // powiązać z Property należącym do innego komponentu
//        textArea1.prefHeightProperty().bind(pane1.heightProperty().subtract(btn1.getPrefHeight()));

        // w przypadku BorderPane, ta praca wykonywana jest za nas
    }

    public void btn1Action(ActionEvent actionEvent) {
        label1.setText("Hej ludzie!!!");
    }
}
