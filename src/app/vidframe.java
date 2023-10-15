

// import javafx.embed.swing.JFXPanel;
// import javafx.scene.Scene;
// import javafx.scene.media.Media;
// import javafx.scene.media.MediaPlayer;
// import javafx.scene.media.MediaView;
// import javax.swing.*;
// import java.awt.*;

// public class vidframe extends JFrame {

//     private JFXPanel fxPanel;

//     public vidframe() {
//         // Initialize the Swing frame
//         setTitle("Video Player");
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setSize(800, 600);

//         // Create a JFXPanel for embedding JavaFX content
//         fxPanel = new JFXPanel();
//         add(fxPanel, BorderLayout.CENTER);

//         // Initialize JavaFX on the Swing thread
//         SwingUtilities.invokeLater(this::initFX);
//     }

//     private void initFX() {
//         // Create a JavaFX Scene and MediaPlayer
//         Media media = new Media("https://imdb-video.media-imdb.com/vi4235180569/1434659607842-pgv4ql-1550682793575.mp4?Expires=1696597674&Signature=L5Mc-6P~gASfrohhh4jeE~ATptNQisiASYqGLCipD5xTIdeFTOrRijx7igC6VPyxUdMeZPm3JPbi4rKgV3V~zoJ5~4niOz2eMJ5VvE-esjhP28ulFXyMpRCOh2tdVg9ACe32CiIrdGoDuLdVxS0AVx6rpxeW5UMbPYAkPW8HGYBV7F1oZCepn5gnhcRqKKfGPq0PtPb9dxAlU8luKYjGgfsp2zTifFqn7nrVWmNix03oAdIlFle7RcAxj5j54PVYNAuN3~wNrJd8RZepBmrrlCECdmTUb~uN0kPpKaxemnXvYozE~ZcUTqnXgVl1FszXCl2g72NZZYqXm-B29pW57A__&Key-Pair-Id=APKAIFLZBVQZ24NQH3KA"); // Update with your video file path
//         MediaPlayer mediaPlayer = new MediaPlayer(media);
//         MediaView mediaView = new MediaView(mediaPlayer);

//         // Create a JavaFX Pane to host the MediaView
//         javafx.scene.layout.StackPane fxPane = new javafx.scene.layout.StackPane();
//         fxPane.getChildren().add(mediaView);

//         // Create a JavaFX Scene and set it in the JFXPanel
//         Scene scene = new Scene(fxPane);
//         fxPanel.setScene(scene);

//         // Play the video
//         mediaPlayer.play();
//     }

//     public static void main(String[] args) {
//         SwingUtilities.invokeLater(() -> {
//             new vidframe().setVisible(true);
//         });
//     }
// }
