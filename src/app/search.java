package app;

import java.awt.*;
import javax.swing.*;
import java.util.List;
import app.GoogleBooksScraper.SearchResult;

public class search {

    public static void back(Container container, Container container2){
        

    }

    public static void redirect (Container container, String text, List<SearchResult> results) {
        if (text == null || text.trim().isEmpty()) {
            return;
        }

        YourApp app = (YourApp) SwingUtilities.getWindowAncestor(container);
        app.showSearch(); // Navigate to the search page
    }
}


// back, search and redirect, redirect to webpage