package sample.repositories;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.JdbcTest;

import org.springframework.test.context.ContextConfiguration;

@JdbcTest
@ContextConfiguration(classes = JdbcTableRepository.class)
public class JdbcTableRepositoryTest {

    @Autowired
    JdbcTableRepository db;

    @Test
    public void testGetAll() throws SQLException, IOException {
 
        List l = db.getAllFilms();
        System.out.println(l.size());
    }
}
