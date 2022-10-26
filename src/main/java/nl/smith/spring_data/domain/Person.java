package nl.smith.spring_data.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;


@Entity
@Table(schema = "spring_data_testing", name = "persons")
@AttributeOverride(name = "id", column = @Column(name = "person_id"))
@SequenceGenerator(name = "table_specific_seq", schema = "spring_data_testing", sequenceName = "person_person_id_seq", allocationSize = 10)
@NoArgsConstructor
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true, exclude = {"firstName", "surname"})

public class Person extends BaseEntity {

    public Person(String firstName, String surname, String bsn) {
        this.firstName = firstName;
        this.surname = surname;
        this.bsn = bsn;
    }

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String surname;

    private String bsn;

    @ManyToOne()
    @JoinColumn(name = "address_id")
    private Address address;
}
