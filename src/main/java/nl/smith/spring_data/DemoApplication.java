package nl.smith.spring_data;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import nl.smith.spring_data.domain.Person;
import nl.smith.spring_data.repository.AdressDao;
import nl.smith.spring_data.repository.PersonDao;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Sort;

@SpringBootApplication
@RequiredArgsConstructor
@Getter
public class DemoApplication implements CommandLineRunner {

    private final PersonDao personDao;

    private final AdressDao adressDao;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) {
        personDao.findAllByFirstName("Mark").forEach(System.out::println);

        adressDao.findAllByCity("Geldermalsen").forEach(System.out::println);

        personDao.findAll(Sort.by(Sort.Direction.ASC, "firstName", "surname")).forEach(System.out::println);

        personDao.save(new Person("Frank", "Lamers", "FL1"));
    }
}
