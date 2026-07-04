package io.datajek.spring.basics.movierecommendersystem.lesson2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieRecommenderSystemApplication.class, args);
        RecommenderImplementation recommended = new RecommenderImplementation();
        String[] results = recommended.recommendMovies("Finding Dorry");
        System.out.println(Arrays.toString(results));
    }

}
