package com.example.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {

    public String firstQuery(){
        return "first query";
    }

    public String secondQuery(){
        return "second query";
    }

    public String fullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }
}
