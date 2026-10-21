package ancay.ch.associate.config;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "association")
public record AssociationProperties(String name, String description, List<String> values) {
}
