package app;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import java.io.IOException;

public class GoodreadsScraper {

    public static ResultData scrapeGoodreads(String searchQuery) {
        ResultData resultData = new ResultData();

        // Construct the URL based on the search query
        String baseUrl = "https://www.goodreads.com/search?q=" + searchQuery;

        try {
            // Connect to the Goodreads search results page
            Document searchResults = Jsoup.connect(baseUrl).get();

            // Find the link to the first search result
            Element firstResultLink = searchResults.selectFirst(".bookTitle");

            if (firstResultLink != null) {
                // Get the URL of the first search result
                String firstResultUrl = firstResultLink.absUrl("href");

                // Connect to the first result page
                Document firstResultPage = Jsoup.connect(firstResultUrl).get();

                // Find the div with class BookCover__image
                Element bookCoverImageDiv = firstResultPage.selectFirst(".BookCover__image");

                if (bookCoverImageDiv != null) {
                    // Find the img tag within the BookCover__image div
                    Element imageTag = bookCoverImageDiv.selectFirst("img");

                    if (imageTag != null) {
                        // Extract the URL of the image
                        String imageUrl = imageTag.absUrl("src");
                        resultData.setImageUrl(imageUrl);
                    }

                    // Find the div with class DetailsLayoutRightParagraph__widthConstrained
                    Element detailsDiv = firstResultPage.selectFirst(".DetailsLayoutRightParagraph__widthConstrained");

                    if (detailsDiv != null) {
                        // Find the span with class Formatted within the detailsDiv
                        Element formattedSpan = detailsDiv.selectFirst("span.Formatted");

                        if (formattedSpan != null) {
                            // Extract and set the text within the span
                            String formattedText = formattedSpan.text();
                            resultData.setFormattedText(formattedText);
                        }                        
                    }
                    else{
                        String formattedText = "no description available";
                        resultData.setFormattedText(formattedText);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return resultData;
    }
}

// Custom class to store the scraped data
class ResultData {
    private String imageUrl;
    private String formattedText;
    private String contributorText;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getFormattedText() {
        return formattedText;
    }

    public void setFormattedText(String formattedText) {
        this.formattedText = formattedText;
    }

    
}




    // public static void main(String[] args) {
    //     // Example usage from another Java file:
    //     String searchQuery = "doglapan";
    //     ResultData resultData = scrapeGoodreads(searchQuery);

    //     if (resultData != null) {
    //         System.out.println("Image URL: " + resultData.getImageUrl());
    //         System.out.println("Text within span.Formatted: " + resultData.getFormattedText());
    //     } else {
    //         System.out.println("No search results found.");
    //     }
    // }
