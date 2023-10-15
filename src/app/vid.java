// package app;
// import javafx.application.Platform;
// import javafx.embed.swing.JFXPanel;
// import javafx.scene.Scene;
// import javafx.scene.media.Media;
// import javafx.scene.media.MediaPlayer;
// import javafx.scene.media.MediaView;

// import javax.swing.*;
// import java.awt.*;

// public class vid extends JPanel {

//     private JFXPanel fxPanel;
//     private MediaView mediaView;
//     private MediaPlayer mediaPlayer;

//     public vid(String videoPath) {
//         setLayout(new BorderLayout());

//         // Create a JFXPanel for embedding JavaFX content
//         fxPanel = new JFXPanel();
//         add(fxPanel, BorderLayout.CENTER);

//         // Initialize JavaFX on the Swing thread
//         Platform.runLater(() -> initFX(videoPath));
//     }

//     public void initFX(String videoPath) {
//         Media media = new Media(videoPath);
//         MediaPlayer mediaPlayer = new MediaPlayer(media);
//         mediaView = new MediaView(mediaPlayer);

//         // Create a JavaFX Scene and add the MediaView
//         javafx.scene.layout.StackPane fxPane = new javafx.scene.layout.StackPane();
//         fxPane.getChildren().add(mediaView);
//         Scene scene = new Scene(fxPane);

//         // Set the JavaFX Scene in the JFXPanel
//         fxPanel.setScene(scene);

//         // Play the video
//         mediaPlayer.play();
//     }

//     public void stopVideo() {
//         if (mediaPlayer != null) {
//             mediaPlayer.stop();
//         }
//     }

// }
