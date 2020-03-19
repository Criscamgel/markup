package co.com.santander.serviciosexternos.configurations;

import org.springframework.context.annotation.Configuration;
import org.springframework.cloud.openfeign.EnableFeignClients;
import lombok.extern.slf4j.XSlf4j;

@XSlf4j
@Configuration
@EnableFeignClients(basePackages = "co.com.santander.serviciosexternos.client")
public class FeignConfiguration {
	public FeignConfiguration() {
		log.entry(FeignConfiguration.class.getName());
	}
}
