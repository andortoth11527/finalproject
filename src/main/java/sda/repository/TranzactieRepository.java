package sda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sda.entity.TipTranzactii;
import sda.entity.Tranzactii;

@Repository
public interface TranzactieRepository extends JpaRepository<Tranzactii, Integer> {
}
