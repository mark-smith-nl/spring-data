package nl.smith.spring_data.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;


@Entity
@Table(schema = "spring_data_testing", name = "persons")
@AttributeOverride(name = "id", column = @Column(name = "person_id"))
@NoArgsConstructor
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true, exclude = {"firstName", "surname"})

public class Person extends BaseEntity{

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String surname;

    @ManyToOne()
    @JoinColumn(name="address_id")
    private Address address;
}
