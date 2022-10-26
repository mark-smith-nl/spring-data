package nl.smith.spring_data.repository;

import nl.smith.spring_data.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;
import java.util.List;

public interface PersonDao extends JpaRepository<Person, BigInteger> {

    List<Person> findAllBySurnameOrderByFirstName(String surname);

    List<Person> findAllByFirstName(String firstname);

}
