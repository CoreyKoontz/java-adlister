import java.io.Serializable;

public class AlbumBean implements Serializable {

    int id;
    String artist;
    String name;
    int release_date;
    String genre;
    Double sales;

    public AlbumBean() {} // Empty constructor

    public AlbumBean(int id, String artist, String name, int release_date, String genre, Double sales) {
        this.id = id;
        this.artist = artist;
        this.name = name;
        this.release_date = release_date;
        this.genre = genre;
        this.sales = sales;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRelease_date() {
        return release_date;
    }

    public void setRelease_date(int release_date) {
        this.release_date = release_date;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Double getSales() {
        return sales;
    }

    public void setSales(Double sales) {
        this.sales = sales;
    }
}
