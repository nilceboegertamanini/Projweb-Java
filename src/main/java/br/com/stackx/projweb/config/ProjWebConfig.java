package br.com.stackx.projweb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration //informa para Spring que é uma classe de configuração
@EnableWebMvc //habilitar MVC no Spring
@ComponentScan(basePackages = {"br.com.stackx.projweb"}) //pacote base do projeto
public class ProjWebConfig implements WebMvcConfigurer 
{

    @Bean
    public InternalResourceViewResolver resolver() 
    {
    	System.out.println("### INICIALIZANDO ProjWebConfig ###");
    	
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setViewClass(JstlView.class);
        resolver.setPrefix("/WEB-INF/pages/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
}