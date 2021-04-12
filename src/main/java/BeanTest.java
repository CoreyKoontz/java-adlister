import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BeanTest {

    public static void main(String[] args) {

        QuotesBean quote1 = new QuotesBean(1, "this is the first quote", "Jane Doe");
        QuotesBean quote2 = new QuotesBean(2, "this is the second quote", "John Doe");
        QuotesBean quote3 = new QuotesBean(3, "this is the third quote", "Jamie Doe");
        QuotesBean quote4 = new QuotesBean(4, "this is the forth quote", "Jack Doe");

        AuthorsBean author1 = new AuthorsBean(1, "Jane", "Doe");
        AuthorsBean author2 = new AuthorsBean(2, "John", "Doe");
        AuthorsBean author3 = new AuthorsBean(3, "Jamie", "Doe");
        AuthorsBean author4 = new AuthorsBean(4, "Jack", "Doe");

        AlbumBean thriller = new AlbumBean(1, "Michael Jackson", "Thriller", 1982, "Pop / Rock / R&B", 47.3);
        AlbumBean backInBlack = new AlbumBean(2, "AC / DC", "Back in Black", 1980, "Hard Rock", 26.1);
        AlbumBean dSOTM = new AlbumBean(3, "Pink Floyd", "The Dark Side of the Moon", 1973, "Progressive Rock", 24.2);
        AlbumBean bOOH = new AlbumBean(1, "Meat Loaf", "Bat Out of Hell", 1977, "Hard Rock/Progressive Rock", 21.5);


        List<QuotesBean> quoteList = new ArrayList<>();
        Collections.addAll(quoteList, quote1, quote2, quote3, quote4);

        for (QuotesBean quotesBean : quoteList) {
            System.out.println(quotesBean.author + " -- " + quotesBean.content);
        }

    }

}
