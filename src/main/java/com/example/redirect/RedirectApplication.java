package com.example.redirect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.example.redirect.filters.PostFilter;
import com.example.redirect.filters.PreFilter;
import com.example.redirect.filters.PreGaesFilter;
import com.example.redirect.filters.PreRewriteFilter;
import com.example.redirect.filters.RouteURLFilter;


@SpringBootApplication
@EnableZuulProxy
public class RedirectApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedirectApplication.class, args);
	}
	
	@Bean
    public RouteURLFilter routerFilter() {
        return new RouteURLFilter();
    }
    @Bean
    public PreFilter preFilter() {
        return new PreFilter();
    }
    @Bean
    public PreGaesFilter preGaesFilter() {
        return new PreGaesFilter();
    }
    @Bean
    public PreRewriteFilter preRewriteFilter() {
        return new PreRewriteFilter();
    }

    
    @Bean
    public PostFilter postFilter() {
        return new PostFilter();
    }
    
}
