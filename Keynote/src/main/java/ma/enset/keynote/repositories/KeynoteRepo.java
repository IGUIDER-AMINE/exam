package ma.enset.keynote.repositories;



import ma.enset.keynote.entities.Keynote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KeynoteRepo extends JpaRepository<Keynote,Long> {
}
