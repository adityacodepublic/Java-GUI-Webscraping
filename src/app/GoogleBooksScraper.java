package app;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GoogleBooksScraper {


   

    public static class SearchResult {
        private final String title;
        private final String linkText;
        private final String Author;
        private final String year;
        private final String imageurl;
        private final String description;

        public SearchResult(String title, String linkText, String Author, String year, String imageurl, String description) {
            this.title = title;
            this.linkText = linkText;
            this.Author = Author;
            this.year = year;
            this.imageurl = imageurl;
            this.description = description;
        }

        public String getTitle() {
            return title;
        }

        public String getLinkText() {
            return linkText;
        }

        public String getAuthor() {
            return Author;
        }

        public String getyear() {
            return year;
        }

        public String getimageurl() {
            return imageurl;
        }

        public String getdescription() {
            return description;
        }


    }

    public static List<SearchResult> scrapeGoogleBooks(String searchQuery, int numberOfResults) {
        List<SearchResult> results = new ArrayList<>();
        String url = "https://www.google.com/search?tbm=bks&q=" + searchQuery;



        try {
            Document doc = Jsoup.connect(url).get();
            Elements resultElements = doc.select(".Yr5TG .bHexk.Tz5Hvf");

            int count = 0;

            for (Element resultElement : resultElements) {
                if (count >= numberOfResults) {
                    break; // Stop after getting the specified number of results.
                }

                // Extract title
                Element titleElement = resultElement.select("span > a > h3").first();
                String title = titleElement.text();

                // Extract link
                Element linkElement = resultElement.select("span > a").first();
                String link = linkElement.attr("href");

                // Extract author name
                Element divN96wpd = resultElement.select(".N96wpd").first();
                Element AuthorElement = divN96wpd.select("a span").first();
                String author = AuthorElement.text();

                // Extract year
                Element additionalSpanElement = divN96wpd.select("span:nth-child(2)").first();
                String year = (additionalSpanElement != null) ? additionalSpanElement.text() : "";

                // Get title image
                ResultData resultData = GoodreadsScraper.scrapeGoodreads(title);
                String imageurl=null;
                String description=null;
                if (resultData != null) {
                    imageurl = resultData.getImageUrl();
                    description = resultData.getFormattedText();
                } else {
                    System.out.println("No search results found.");
                }


                
                results.add(new SearchResult(title, link, author, year, imageurl, description));

                count++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return results;
    }


    public static List<SearchResult> search (String searchQuery) {
        List<SearchResult> results = scrapeGoogleBooks(searchQuery, 6);

        for (int i = 0; i < results.size(); i++) {
            SearchResult result = results.get(i);
            System.out.println("Result #" + (i + 1));
            System.out.println("Title: " + result.getTitle());
            System.out.println("Link Text: " + result.getLinkText());
            System.out.println("Author" + result.getAuthor());
            System.out.println("year: " + result.getyear());
            System.out.println("imageurl: " + result.getimageurl()); 
            System.out.println(result.getdescription() != null && result.getdescription().length() > 300 ? result.getdescription().substring(0, 250) : result.getdescription());
            System.out.println();
        }
        return results; 
    }
}
