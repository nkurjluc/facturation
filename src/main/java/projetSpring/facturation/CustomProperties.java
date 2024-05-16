package projetSpring.facturation;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import lombok.Data;

@Data
@Configuration
@ConfigurationProperties(prefix="facturation")
public class CustomProperties {
    private String apiUrl;
}
