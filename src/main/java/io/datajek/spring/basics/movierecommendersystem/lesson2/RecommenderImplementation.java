package io.datajek.spring.basics.movierecommendersystem.lesson2;

import io.datajek.spring.basics.movierecommendersystem.Filter;

public class RecommenderImplementation {
 private Filter filter;
  public RecommenderImplementation(Filter filter ) {
      this.filter = filter;
  }
    public String[] recommendMovies(String movie) {
       String[] results = filter.getRecommendations(movie);
       return results;
    }
}
