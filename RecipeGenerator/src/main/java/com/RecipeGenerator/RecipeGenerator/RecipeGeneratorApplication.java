package com.RecipeGenerator.RecipeGenerator;

import com.RecipeGenerator.RecipeGenerator.Recipe.Recipe;
import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RecipeGeneratorApplication {

  //Logger. WIll send output to the log( the console, in this example)
  private static final Logger log = LoggerFactory.getLogger(RecipeGeneratorApplication.class);

  @Bean
  public RestTemplate buildRestTemplate(RestTemplateBuilder builder) {
    return builder.build();
  }


  @Bean
  public CommandLineRunner run(RestTemplate restTemplate) throws Exception {

    return args -> {
      Recipe recipe = restTemplate.getForObject
          (
              "https://www.themealdb.com/api/json/v1/1/random.php",
              Recipe.class
          );
      log.info(recipe.toString());
    };

  }

  public static void main(String[] args) throws IOException {
    SpringApplication.run(RecipeGeneratorApplication.class, args);

  }

}
