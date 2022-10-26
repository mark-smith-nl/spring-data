package nl.smith.spring_data.domain;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.math.BigInteger;

@MappedSuperclass
@Data
public class BaseEntity {

    @Id
    private BigInteger id;
}
