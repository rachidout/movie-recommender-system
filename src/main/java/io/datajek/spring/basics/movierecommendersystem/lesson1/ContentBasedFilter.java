package io.datajek.spring.basics.movierecommendersystem.lesson1;

import io.datajek.spring.basics.movierecommendersystem.Filter;

public class ContentBasedFilter implements Filter {
    public String[] getRecommendations(String movie ) {
        return new String[] {"Happy feet","Ice Age","Shark Tale"};
    }
}
