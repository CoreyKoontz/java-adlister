import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLAdsDao implements Ads {

// TODO---------------------------------------------------------- Initializing DB Connection:
    private Connection connection = null;

    public MySQLAdsDao(Config config) {

        try {
            DriverManager.registerDriver(new Driver());//<------------ Instantiating DB Driver
            Connection connection = DriverManager.getConnection(//<--- Must only create connection once
                    Config.getUrl(),//-------------\
                    Config.getUsername(),//----------> Pulling in config values from Config.java
                    Config.getPassword()//---------/
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
