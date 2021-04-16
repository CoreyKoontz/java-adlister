import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {

// TODO---------------------------------------------------------- Initializing DB Connection:
    private Connection connection = null;

    public MySQLAdsDao(Config config) {

        try {//<------------------------------------------------------ Must be wrapped in a try/catch block ---------
            DriverManager.registerDriver(new Driver());//<------------ Instantiating DB Driver.                      |
            Connection connection = DriverManager.getConnection(//<--- Only create connection once.                  |
                    Config.getUrl(),//------------------------------\                                                |
                    Config.getUsername(),//--------------------------> Pulling in config values from Config.java     |
                    Config.getPassword()//--------------------------/  in order to protect these values.             |                                  |
            );//                                                                                                     |
        } catch (SQLException e) {//<--------------------------------------------------------------------------------
            e.printStackTrace();
        }
    }

    // TODO-------------------------------------------------- Select all ads method:
    @Override
    public List<Ad> all() {
        List<Ad> ads = new ArrayList<>();
        String query = "SELECT * FROM ads";
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()){
                ads.add( new Ad(
                   rs.getLong("id"),
                   rs.getLong("user_id"),
                   rs.getString("title"),
                   rs.getString("description")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ads;
    }

    @Override
    public Long insert(Ad ad) {
        String query = "INSERT INTO ads(user_id, title, description)";
    }
}
