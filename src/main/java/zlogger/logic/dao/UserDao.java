package zlogger.logic.dao;

import zlogger.logic.models.User;
import zlogger.logic.models.UserDetails;
import zlogger.logic.models.Wall;

public interface UserDao extends GenericDao<String, User> {

    public Wall getWall(User owner);

    public UserDetails getUserDetails(User user);

    public User updateUserDetails(UserDetails userDetails);

}
