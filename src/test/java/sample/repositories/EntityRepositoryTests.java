package sample.repositories;

import java.util.List;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestMethodOrder(MethodOrderer.MethodName.class)
public class EntityRepositoryTests {

    @Autowired
    EntityRepository db;

    @Test
    void heatup() {
        db.findAll();
    }

    @Test
    void testFindAll() {
        List l = db.findAll();
        System.out.println("loaded " + l.size());
    }
}
