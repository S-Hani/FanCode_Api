package org.example.services.impls;

import org.example.constants.ApiEndpoints;
import org.example.filters.MyFilter;
import io.restassured.RestAssured;
import org.example.pojo.*;
import org.example.services.JsonPlaceHolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class JsonPlaceHolderServiceApiImpl implements JsonPlaceHolderService {

    @Autowired
    private MyFilter myFilter;

    @Override
    public List<Post> getAllPosts() {
        return Arrays.asList(RestAssured.given().filter(myFilter).get(ApiEndpoints.GET_POSTS).as(Post[].class));
    }

    @Override
    public List<Comment> getAllComments() {
        return Arrays.asList(RestAssured.given().filter(myFilter).get(ApiEndpoints.GET_COMMENTS).as(Comment[].class));
    }

    @Override
    public List<Album> getAllAlbums() {
        return Arrays.asList(RestAssured.given().filter(myFilter).get(ApiEndpoints.GET_ALBUMS).as(Album[].class));
    }

    @Override
    public List<Photo> getAllPhotos() {
        return Arrays.asList(RestAssured.given().filter(myFilter).get(ApiEndpoints.GET_PHOTOS).as(Photo[].class));
    }

    @Override
    public List<ToDo> getAllToDos() {
        return Arrays.asList(RestAssured.given().filter(myFilter).get(ApiEndpoints.GET_TODOS).as(ToDo[].class));
    }

    @Override
    public List<User> getAllUsers() {
        return Arrays.asList(RestAssured.given().filter(myFilter).get(ApiEndpoints.GET_USERS).as(User[].class));
    }
}
