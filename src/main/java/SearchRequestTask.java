import io.zensoft.testing.configuration.SearchConfiguration;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

import java.util.Scanner;

public class SearchRequestTask {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        while(Boolean.TRUE) {
            System.out.print("Enter your search request: ");
            String searchRequest = scanner.nextLine();
            System.out.println("Your search request is \"" + searchRequest + "\"");
            if (searchRequest.isEmpty())
                break;

            String searchRequestURL = SearchConfiguration.SEARCH_REQUEST_GOOGLE + searchRequest;
            Document doc = Jsoup.connect(searchRequestURL)
                                .userAgent(SearchConfiguration.USER_AGENT)
                                .get();

            Elements results = doc.select("h3.r > a"); // parse html data that doc.html() method represents

            String firstLinkTitle = results.get(0).text();
            String firstLinkURL = results.get(0).attr("href");
            System.out.println("Title of the first link is \"" + firstLinkTitle + "\" and it's URL" + firstLinkURL.substring(6, firstLinkURL.indexOf("&")));
        }
        scanner.close();
    }
}
