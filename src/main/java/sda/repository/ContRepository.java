package sda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sda.entity.Cont;

import java.util.List;

public interface ContRepository extends JpaRepository<Cont,Integer> {

}
