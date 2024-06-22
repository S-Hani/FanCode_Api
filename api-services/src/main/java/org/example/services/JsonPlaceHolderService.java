package org.example.services;

import org.example.pojo.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface JsonPlaceHolderService {
  List<Post> getAllPosts();
  List<Comment> getAllComments();
  List<Album> getAllAlbums();
  List<Photo> getAllPhotos();
  List<ToDo> getAllToDos();
  List<User> getAllUsers();
}
