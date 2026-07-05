package io.datajek.spring.basics.movierecommendersystem.lesson3;

import io.datajek.spring.basics.movierecommendersystem.Filter;

public class CollaborativeFilter implements Filter {
    public String[] getRecommendations (String movie) {
        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }
}
