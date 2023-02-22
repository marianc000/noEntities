package sample.repositories;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import sample.entities.Film2;

@Repository
public class JdbcRepository {

    @Autowired
    DataSource ds;
 
    public List<Film2> getAllFilms() throws SQLException {
        try ( Connection con = ds.getConnection();  Statement st = con.createStatement();  ResultSet rs = st.executeQuery("SELECT * from film")) {

            List<Film2> l = new LinkedList<>();

            while (rs.next()) {
                l.add(new Film2(
                        rs.getObject("FILM_ID"),
                        rs.getObject("TITLE"),
                        rs.getObject("DESCRIPTION"),
                        rs.getObject("RELEASE_YEAR"),
                        rs.getObject("LANGUAGE_ID"),
                        rs.getObject("ORIGINAL_LANGUAGE_ID"),
                        rs.getObject("RENTAL_DURATION"),
                        rs.getObject("RENTAL_RATE"),
                        rs.getObject("LENGTH"),
                        rs.getObject("REPLACEMENT_COST"),
                        rs.getObject("RATING"),
                        rs.getObject("SPECIAL_FEATURES"),
                        rs.getObject("LAST_UPDATE"),
                        rs.getObject("AVAILABLE")
                ));
            }

            return l;
        }
    }
}
