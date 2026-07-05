package io.datajek.spring.basics.movierecommendersystem.lesson3;

import io.datajek.spring.basics.movierecommendersystem.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
    @Autowired
 private Filter filter;
  public RecommenderImplementation(Filter filter ) {
      this.filter = filter;
  }
    public String[] recommendMovies(String movie) {
       String[] results = filter.getRecommendations(movie);
       return results;
    }
}
