package org.automation.example.context;


import org.example.common.pojo.*;
import org.springframework.stereotype.Component;

import java.util.List;
import lombok.Data;

@Component
@Data
public class KnowsContext {

  private List<Post> posts;
  private List<Comment> comments;
  private List<Album> albums;
  private List<Photo> photos;
  private List<ToDo> toDos;
  private List<User> users;

}
