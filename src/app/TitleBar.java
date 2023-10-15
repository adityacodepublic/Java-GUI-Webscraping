package app;
import javax.swing.*;
import java.awt.*;

public class TitleBar extends JPanel {
    private YourApp yourApp;
    public TitleBar(YourApp yourApp) {
        this.yourApp = yourApp;        
        
        setLayout(new BorderLayout());
        setOpaque(false); // Make the title bar transparent

        // Load your custom logo image (replace "your_logo.png" with your file path)
        ImageIcon customLogo = new ImageIcon("src/Image/star.png");

        // Create a JLabel for the custom logo
        JLabel logoLabel = new JLabel(customLogo);
        add(logoLabel, BorderLayout.WEST);

        // Create a back button
        JButton backButton = new JButton();
        backButton.setFont(new java.awt.Font("Segoe UI Symbol", 0, 20)); // NOI18N
        backButton.setText("←");
        add(backButton, BorderLayout.EAST);
    }
}
