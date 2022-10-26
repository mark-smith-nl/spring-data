package nl.smith.spring_data.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static java.math.BigInteger.*;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @BeforeEach
    public void init () {
        System.out.println("Start");
    }

    @Test
    void testNotEquals() {
        Person person1 = new Person();
        person1.setId(valueOf(0));
        person1.setFirstName("Mark");
        person1.setSurname("Smith");
        Person person2 = new Person();
        person2.setId(person1.getId().add(ONE));
        person2.setFirstName(person1.getFirstName());
        person2.setSurname(person1.getSurname());

        assertNotEquals(person1, person2);
    }

    @Test
    void testEquals() {
        Person person1 = new Person();
        person1.setId(valueOf(0));
        person1.setFirstName("Mark");
        person1.setSurname("Smith");
        Person person2 = new Person();
        person2.setId(person1.getId());
        person2.setFirstName("Tom");
        person2.setSurname("Smith");

        assertEquals(person1, person2, "Persons with identical ids should be equal");
    }
}
