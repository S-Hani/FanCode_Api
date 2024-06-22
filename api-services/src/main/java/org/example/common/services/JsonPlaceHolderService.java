package org.example.common.services;

import org.example.common.pojo.*;
import org.springframework.stereotype.Component;

import java.util.List;

public interface JsonPlaceHolderService {
  List<Post> getAllPosts();
  List<Comment> getAllComments();
  List<Album> getAllAlbums();
  List<Photo> getAllPhotos();
  List<ToDo> getAllToDos();
  List<User> getAllUsers();
}
