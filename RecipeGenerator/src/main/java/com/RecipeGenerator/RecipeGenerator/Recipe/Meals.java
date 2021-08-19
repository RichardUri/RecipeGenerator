package com.RecipeGenerator.RecipeGenerator.Recipe;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Meals {

  private List<Meals> meals;


  //CONSTRUCTORS
  public Meals() {
  }


  //GETTERS
  public List<Meals> getMeals() {
    return meals;
  }

  //SETTERS
  public void setMeals(List<Meals> meals) {
    this.meals = meals;
  }

  @Override
  public String toString() {
    return "Meal{" +
        "meals=" + meals +
        '}';
  }
}
