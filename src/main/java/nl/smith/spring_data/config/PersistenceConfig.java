package nl.smith.spring_data.config;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

@Component
@EnableJpaRepositories(basePackages = "nl.smith.spring_data.repository")
public class PersistenceConfig {
}
