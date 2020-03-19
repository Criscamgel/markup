package com.example.calculadora;

import com.example.calculadora.config.ObjCacheManager;

import co.com.santander.serviciosexternos.client.AccesoDatosCalculadoraClient;
import co.com.santander.serviciosexternos.objetoscomunes.dto.calculadora.AliadoDTO;
import co.com.santander.serviciosexternos.objetoscomunes.dto.calculadora.ParametroDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@ComponentScan(basePackages = { 
		"co.com.santander.serviciosexternos.configurations", 
		"co.com.santander.serviciosexternos.client",
		"com.example.calculadora" 
	})
public class CalculadoraApplication {
	
	@Autowired
    AccesoDatosCalculadoraClient accesoDatosCalculadoraClient;

	public static void main(String[] args) {
		SpringApplication.run(CalculadoraApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("*").allowedMethods("GET", "POST","PUT", "DELETE");
			}
		};
	}

	@PostConstruct
	public void crearCacheParametros(){
		List<AliadoDTO> aliadoList = accesoDatosCalculadoraClient.getAliados();
		if (aliadoList != null && aliadoList.size() > 0) {
			ObjCacheManager manager = new ObjCacheManager();
			aliadoList.forEach(aliado -> {
				if (aliado.getParametros() != null && aliado.getParametros().size() > 0) {
					List<ParametroDTO> parametrosAliados = new ArrayList<>();
					aliado.getParametros().forEach(param -> {
						parametrosAliados.add(new ParametroDTO(param.getNombre(), param.getTipo(),param.getValorNumerico(), param.getValorTexto()));
					});
					manager.putInCache(aliado.getId(), parametrosAliados);
				}
			});
		}
	}

}
