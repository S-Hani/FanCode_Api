package org.example.common.services.impls;

import org.example.common.constants.ApiEndpoints;
import org.example.common.pojo.*;
import org.example.common.services.JsonPlaceHolderService;
import io.restassured.RestAssured;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class JsonPlaceHolderServiceApiImpl implements JsonPlaceHolderService {
    
    @Override
    public List<Post> getAllPosts() {
        return Arrays.asList(RestAssured.given().when().log().all().get(ApiEndpoints.GET_POSTS).then().log().all().extract().body().as(Post[].class));
    }

    @Override
    public List<Comment> getAllComments() {
        return Arrays.asList(RestAssured.given().when().log().all().get(ApiEndpoints.GET_COMMENTS).then().log().all().extract().body().as(Comment[].class));
    }

    @Override
    public List<Album> getAllAlbums() {
        return Arrays.asList(RestAssured.given().when().log().all().get(ApiEndpoints.GET_ALBUMS).then().log().all().extract().body().as(Album[].class));
    }

    @Override
    public List<Photo> getAllPhotos() {
        return Arrays.asList(RestAssured.given().when().log().all().get(ApiEndpoints.GET_PHOTOS).then().log().all().extract().body().as(Photo[].class));
    }

    @Override
    public List<ToDo> getAllToDos() {
        return Arrays.asList(RestAssured.given().when().log().all().get(ApiEndpoints.GET_TODOS).then().log().all().extract().body().as(ToDo[].class));
    }

    @Override
    public List<User> getAllUsers() {
        return Arrays.asList(RestAssured.given().when().log().all().get(ApiEndpoints.GET_USERS).then().log().all().extract().body().as(User[].class));
    }
}
