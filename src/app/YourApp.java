
package app;
import javax.swing.*;
import java.awt.*;
import java.util.Stack;

import java.util.List;
import app.GoogleBooksScraper.SearchResult;

public class YourApp extends JFrame {
    private CardLayout cardLayout;
    private JPanel cardPanel;
    private Stack<String> pageHistory; // Stack to keep track of visited pages

    public YourApp() {
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);
        pageHistory = new Stack<>();
        pageHistory.push("reviewsearch");

        getRootPane().setOpaque(false);
        getContentPane().setBackground(new java.awt.Color(11,11,11));
        ImageIcon customLogo = new ImageIcon("src/Image/star.png");
        setIconImage(customLogo.getImage());
        

        cardPanel.add(new reviewsearch(this), "reviewsearch");
        

        
        add(cardPanel, BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setSize(734,334);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public void addSearchPage(List<SearchResult> results) {
        searchpage searchPage = new searchpage(this, results);
        cardPanel.add(searchPage, "searchpage");
    }
    public void showSearch() {
        cardLayout.show(cardPanel, "searchpage");
        pageHistory.push("searchpage");
    }

    public void showReview() {
        cardLayout.show(cardPanel, "reviewsearch");
        pageHistory.push("reviewsearch"); // Push the page name onto the stack
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            YourApp app = new YourApp();
            //app.initVideo(); // Initialize and start the video playback
        });
    }


    // private void initVideo() {
    //     Platform.runLater(() -> {
    //         vido.initFX(s); // Initialize the JavaFX video panel
    //     });
    // }





    // private void startVideoPlayback() {
    //     if (pageHistory.peek() == "vid") {
    //         vido.initFX(s); // Initialize the JavaFX video panel and play video
    //     }
    // }

    // private void stopVideoPlayback() {
    //     if (pageHistory.peek() == "vid") {
    //         vido.stopVideo(); // Stop video playback
    //     }
    // }

    public void showHome() {
        cardLayout.show(cardPanel, "home");
        pageHistory.push("home"); // Push the page name onto the stack
    }
    public void goBack() {
        if (!pageHistory.isEmpty()) {
            pageHistory.pop(); // Pop the current page from the stack
            if (!pageHistory.isEmpty()) {
            String previousPage = pageHistory.peek();
            cardLayout.show(cardPanel, previousPage);
            }
            else{ showReview();}
        }  
    }


    
        //vido = new vid(s);
        // Add your different "pages" to the cardPanel
        //cardPanel.add(new home(this), "home");
        //cardPanel.add(vido, "vid");
}
