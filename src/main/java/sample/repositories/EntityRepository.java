package sample.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sample.entities.Film;
 

@Repository
public interface EntityRepository extends JpaRepository<Film, Integer>{
}
