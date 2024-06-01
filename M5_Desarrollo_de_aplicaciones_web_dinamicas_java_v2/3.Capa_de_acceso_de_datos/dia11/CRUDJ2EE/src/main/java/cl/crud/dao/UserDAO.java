package cl.crud.dao;


import java.util.List;

import cl.crud.model.User;

public interface UserDAO {
	
    void insertUser(User user);
    User selectUser(int id);
    List<User> selectAllUsers();
    boolean deleteUser(int id);
    boolean updateUser(User user);
    
    
}
