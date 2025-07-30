import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class AffirmationApp extends Application {

    private Label affirmationLabel;
    private final String[] affirmations = {
            "You are enough 💖",
            "Keep growing, little by little 🌱",
            "You bring light to those around you 🌞",
            "Your potential is endless 🚀",
            "It's okay to rest. You're still doing great ☁️",
            "You are brave, kind, and strong 🐾",
            "Believe in yourself a little more today ✨",
            "You’ve survived 100% of your bad days so far 🌈",
            "You radiate good energy 🌼",
            "You are magic, don’t forget that 🦄"
    };

    private String currentAffirmation = "";

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("💌 Daily Affirmation");

        affirmationLabel = new Label();
        affirmationLabel.setWrapText(true);
        affirmationLabel.setStyle("-fx-font-size: 18px; -fx-padding: 20px; -fx-alignment: center;");

        Button newBtn = new Button("🎲 New");
        Button likeBtn = new Button("💖 Like");
        Button viewBtn = new Button("📂 View Favorites");

        newBtn.setOnAction(e -> showNewAffirmation());
        likeBtn.setOnAction(e -> saveCurrentAffirmation());
        viewBtn.setOnAction(e -> showFavoritesWindow());

        HBox buttonBox = new HBox(10, newBtn, likeBtn, viewBtn);
        buttonBox.setStyle("-fx-alignment: center; -fx-padding: 10px;");

        VBox root = new VBox(affirmationLabel, buttonBox);
        root.setStyle("-fx-background-color: #FFF8F0; -fx-padding: 30px;");

        showNewAffirmation();

        Scene scene = new Scene(root, 450, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void showNewAffirmation() {
        Random random = new Random();
        int index = random.nextInt(affirmations.length);
        currentAffirmation = affirmations[index];
        affirmationLabel.setText(currentAffirmation);
    }

    private void saveCurrentAffirmation() {
        try (FileWriter writer = new FileWriter("favorites.txt", true)) {
            writer.write(currentAffirmation + "\n");
            showAlert("Saved! 💾", "Affirmation saved to favorites.");
        } catch (IOException e) {
            showAlert("Error ❌", "Couldn't save your affirmation.");
        }
    }

    private void showFavoritesWindow() {
        Stage favStage = new Stage();
        favStage.setTitle("📂 Your Favorite Affirmations");

        TextArea textArea = new TextArea();
        textArea.setEditable(false);
        textArea.setWrapText(true);

        try {
            String content = Files.readString(Paths.get("favorites.txt"));
            textArea.setText(content);
        } catch (IOException e) {
            textArea.setText("No favorites saved yet!");
        }

        VBox box = new VBox(textArea);
        box.setStyle("-fx-padding: 20px;");
        Scene scene = new Scene(box, 400, 300);
        favStage.setScene(scene);
        favStage.show();
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
