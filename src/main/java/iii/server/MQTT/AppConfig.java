package iii.server.MQTT;

import org.springframework.amqp.core.Queue;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
public class AppConfig {
	
	@Bean
	public Queue neoQueue() {
		return new Queue("neoQueue");
	}
	
}
