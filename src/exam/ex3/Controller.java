package exam.ex3;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.layout.Pane;

public class Controller {
    public Button btn1;
    public Pane pane1;
    public Slider sliderV;
    public Slider sliderH;

    @FXML
    public void initialize() {
//        btn1.layoutXProperty().bind(sliderH.valueProperty().multiply(
//                pane1.getPrefWidth()/(sliderH.getMax() - sliderH.getMin())
//        ));
        // bind trochę nas ogranicza, lepiej skorzystać z Listenerów
        // Listener - to obiekt, który nasłuchuje na zdarzenia np. zmiany wartości slidera
        // Jeżeli zajdzie takie zdarzenie, wówczas wykonywany jest kod z metody
        // changed (którą musimy zaimplementować)

        sliderH.valueProperty().addListener(
                new ChangeListener<Number>() {
                    @Override
                    public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                        double positionX = sliderH.getValue() * pane1.getPrefWidth() /
                                (sliderH.getMax() - sliderH.getMin());
                        btn1.setLayoutX(Math.min(pane1.getPrefWidth() - btn1.getWidth(), positionX));
                        btn1.setText(String.format("%.2f,%.2f", btn1.getLayoutX(), btn1.getLayoutY()));
                    }
                }
        );
        sliderV.valueProperty().addListener(
                (observableValue, oldValue, newValue) -> {
                    double positionY = Math.min(-newValue.doubleValue() + pane1.getHeight(),
                            pane1.getHeight() - btn1.getHeight());
                    btn1.setLayoutY(positionY);
                    btn1.setText(String.format("%.2f,%.2f", btn1.getLayoutX(), btn1.getLayoutY()));
                    // identycznie działa System.out.printf("%.2f,%.2f"... z tym, że wypisuje
                    // od razu na konsole zamiast zwracać stringa
                }
        );
    }
}
