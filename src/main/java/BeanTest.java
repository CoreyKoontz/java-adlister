import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BeanTest {

    public static void main(String[] args) {

        Quotes quote1 = new Quotes(1, "this is the first quote", "Jane Doe");
        Quotes quote2 = new Quotes(2, "this is the second quote", "John Doe");
        Quotes quote3 = new Quotes(3, "this is the third quote", "Jamie Doe");
        Quotes quote4 = new Quotes(4, "this is the forth quote", "Jack Doe");

        Author author1 = new Author(1, "Jane", "Doe");
        Author author2 = new Author(2, "John", "Doe");
        Author author3 = new Author(3, "Jamie", "Doe");
        Author author4 = new Author(4, "Jack", "Doe");

        Album thriller = new Album(1, "Michael Jackson", "Thriller", 1982, "Pop / Rock / R&B", 47.3);
        Album backInBlack = new Album(2, "AC / DC", "Back in Black", 1980, "Hard Rock", 26.1);
        Album dSOTM = new Album(3, "Pink Floyd", "The Dark Side of the Moon", 1973, "Progressive Rock", 24.2);
        Album bOOH = new Album(4, "Meat Loaf", "Bat Out of Hell", 1977, "Hard Rock/Progressive Rock", 21.5);


        List<Quotes> quoteList = new ArrayList<>();
        Collections.addAll(quoteList, quote1, quote2, quote3, quote4);

        for (Quotes quotes : quoteList) {
            System.out.println(quotes.getAuthor() + " -- " + quotes.getContent());
        }

    }

}
