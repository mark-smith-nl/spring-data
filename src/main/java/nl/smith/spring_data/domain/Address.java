package nl.smith.spring_data.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(schema = "spring_data_testing", name = "addresses")
@AttributeOverride(name = "id", column = @Column(name = "address_id"))
@NoArgsConstructor
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true, exclude = {"city", "street", "number"})
public class Address extends BaseEntity{

    private String city;

    private String street;

    @Column(name = "housenumber")
    private int number;

}
