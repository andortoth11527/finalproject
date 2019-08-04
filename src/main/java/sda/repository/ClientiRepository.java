package sda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sda.entity.Clienti;

import java.util.List;
@Repository
public interface ClientiRepository extends JpaRepository<Clienti,Integer> {

     Clienti save(Clienti client);
     List<Clienti> findByUser(String user);


}
