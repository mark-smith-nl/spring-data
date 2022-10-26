package nl.smith.spring_data.domain;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.math.BigInteger;

@MappedSuperclass
@Data
public class BaseEntity {

    @Id
    @GeneratedValue(generator="table_specific_seq")
    private BigInteger id;
}
