package nl.smith.spring_data.repository;

import nl.smith.spring_data.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;
import java.util.List;

public interface AdressDao extends JpaRepository<Address, BigInteger> {

    List<Address> findAllByCity(String city);

}
