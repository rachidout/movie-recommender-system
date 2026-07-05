package io.datajek.spring.basics.movierecommendersystem.lesson3;

import io.datajek.spring.basics.movierecommendersystem.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class ContentBasedFilter implements Filter {

    public String[] getRecommendations(String movie ) {
        return new String[] {"Happy feet","Ice Age","Shark Tale"};
    }
}
