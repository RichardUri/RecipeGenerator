/*
package com.RecipeGenerator.RecipeGenerator.Recipe;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/recipe")
public class RecipeController {

  @Autowired
  private RestTemplate restTemplate;

  @RequestMapping("/1")
  public actualRecipe getRecipe(){

    Recipe recipe = restTemplate.getForObject(
        "https://www.themealdb.com/api/json/v1/1/random.php",
        Recipe.class
    );

    return new actualRecipe(recipe.getStrMeal(),recipe.getstrIngredient1());

   */
/* return new Recipe(
        recipe.idMeal,
        recipe.strMeal, recipe.strDrinkAlternate, recipe.strCategory,
        recipe.strArea, recipe.strInstructions, recipe.strMealThumb, recipe.strTags,
        recipe.strYoutube, recipe.strIngredients1, recipe.strIngredients2,
        recipe.strIngredients3, recipe.strIngredients4, recipe.strIngredients5,
        recipe.strIngredients6, recipe.strIngredients7, recipe.strIngredients8,
        recipe.strIngredients9, recipe.strIngredients10, recipe.strIngredients11,
        recipe.strIngredients12, recipe.strIngredients13, recipe.strIngredients14,
        recipe.strIngredients15, recipe.strIngredients16, recipe.strIngredients17,
        recipe.strIngredients18, recipe.strIngredients19, recipe.strIngredients20,
        recipe.strMeasure1, recipe.strMeasure2,
        recipe.strMeasure3, recipe.strMeasure4, recipe.strMeasure5,
        recipe.strMeasure6, recipe.strMeasure7, recipe.strMeasure8,
        recipe.strMeasure9, recipe.strMeasure10, recipe.strMeasure11,
        recipe.strMeasure12, recipe.strMeasure13, recipe.strMeasure14,
        recipe.strMeasure15, recipe.strMeasure16, recipe.strMeasure17,
        recipe.strMeasure18, recipe.strMeasure19, recipe.strMeasure20,
        recipe.strSource, recipe.strImageSource, recipe.strCreativeCommonsConfirmed,
        recipe.dateModified
        );*//*

  }

}
*/
