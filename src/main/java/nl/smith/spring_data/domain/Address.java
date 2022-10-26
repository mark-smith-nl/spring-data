package nl.smith.spring_data.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(schema = "spring_data_testing", name = "addresses")
@AttributeOverride(name = "id", column = @Column(name = "address_id"))
@SequenceGenerator(name = "table_specific_seq", schema = "spring_data_testing", sequenceName = "address_address_id_seq", allocationSize = 10)
@NoArgsConstructor
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true, exclude = {"city", "street", "number"})
public class Address extends BaseEntity {

    private String city;

    private String street;

    @Column(name = "housenumber")
    private int number;

}
