package org.example.filters;

import io.restassured.filter.FilterContext;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.FilterableRequestSpecification;
import io.restassured.specification.FilterableResponseSpecification;
import io.restassured.spi.AuthFilter;
import org.springframework.stereotype.Component;

@Component
public class MyFilter implements AuthFilter {

    private static final String BASE_URI = "http://jsonplaceholder.typicode.com";

    @Override
    public Response filter(FilterableRequestSpecification filterableRequestSpecification, FilterableResponseSpecification filterableResponseSpecification, FilterContext filterContext) {
        filterableRequestSpecification.baseUri(BASE_URI).accept(ContentType.JSON);
        filterableRequestSpecification.log().all();
        filterableResponseSpecification.log().all();
        return filterContext.next(filterableRequestSpecification, filterableResponseSpecification);
    }
}
