package service;

import com.herogi.server.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {


    List<User> allUsers();

    //List<ProjectModel> projectStats();

    //List<ProjectModel> getProjectList();

}
