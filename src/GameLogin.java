import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class GameLogin extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Root layout
        BorderPane root = new BorderPane();
        root.setStyle("-fx-background-color: linear-gradient(to bottom, #1a1a2e, #162447);"); // game-themed background

        // Title
        Label title = new Label("Adventure Quest");
        title.setFont(Font.font("Verdana", 40));
        title.setTextFill(Color.ORANGE);
        BorderPane.setAlignment(title, Pos.CENTER);
        root.setTop(title);

        // Center layout for login form
        VBox loginBox = new VBox(15);
        loginBox.setPadding(new Insets(30));
        loginBox.setAlignment(Pos.CENTER);
        loginBox.setStyle("-fx-background-color: rgba(0,0,0,0.5); -fx-background-radius: 15;");

        // Message IN log in
        Label messageLabel = new Label();
        messageLabel.setTextFill(Color.RED);
        loginBox.getChildren().add(messageLabel);

        // Username
        TextField usernameField = new TextField();
        usernameField.setPromptText("Enter Username");
        usernameField.setMaxWidth(200);

        // Password
        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Enter Password");
        passwordField.setMaxWidth(200);

        // Login Button
        UserDatabase db = new UserDatabase(); // Adding database
        Button loginButton = new Button("Login");
        loginButton.setStyle("-fx-background-color: orange; -fx-text-fill: white;");
        loginButton.setOnAction(e -> {
            String username = usernameField.getText();
            String password = passwordField.getText();

            if(db.validateLogin(username, password)) {
                messageLabel.setTextFill(Color.GREEN);
                messageLabel.setText("Login Successful! Welcome, " + username);
            }else{
                messageLabel.setTextFill(Color.RED);
                messageLabel.setText("Login Failed! Try again.");
            }
        });

        loginBox.getChildren().addAll(usernameField, passwordField, loginButton);

        root.setCenter(loginBox);

        // Scene
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setTitle("Game Login");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

