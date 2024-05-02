import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class RoseDrawing extends Application {

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        // Drawing the heart
        Circle circle = new Circle(150, 150, 100);
        circle.setFill(Color.RED);

        // Drawing the leaves
        double leafWidth = 20;
        double leafHeight = 50;

        Polygon leaf1 = new Polygon(
                150, 150,
                150 - leafWidth / 2, 150 - leafHeight,
                150 + leafWidth / 2, 150 - leafHeight
        );
        leaf1.setFill(Color.GREEN);

        Polygon leaf2 = new Polygon(
                150, 150,
                150 - leafWidth / 2, 150 + leafHeight,
                150 + leafWidth / 2, 150 + leafHeight
        );
        leaf2.setFill(Color.GREEN);

        // Adding shapes to the pane
        pane.getChildren().addAll(circle, leaf1, leaf2);

        Scene scene = new Scene(pane, 300, 300);
        primaryStage.setTitle("Rose Drawing");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
