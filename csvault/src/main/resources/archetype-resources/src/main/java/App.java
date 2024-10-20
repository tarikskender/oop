import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        DbConnect dbConnect = new DbConnect();
        try {
            dbConnect.getAllFilms();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

class DbConnect {
    private static final String CONNECTION_STRING = "jdbc:mysql://db1.ibu.edu.ba:3306/sepfin_db";
    private static final String USERNAME = "sepfin_usr";
    private static final String PASSWORD = "fin42sepUSR";

    private Connection connection;

    public DbConnect() {
        try {
            connection = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException("Failed to connect to the database", e);
        }
    }

    public void getAllFilms() throws SQLException {
        PreparedStatement statement = this.connection.prepareStatement(
                "SELECT * FROM film LIMIT 5"
        );
        ResultSet rs = statement.executeQuery();

        while (rs.next()) {
            System.out.println("Title: " + rs.getString("title"));
            System.out.println("Description: " + rs.getString("description"));
        }
    }
}
