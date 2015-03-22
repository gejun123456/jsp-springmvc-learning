package dao;

import dao.inter.UserMapper;
import entity.User;

/**
 * Created by bruce on 3/21/2015.
 */
public class LoginDao {
    private UserMapper userMapper;

    public UserMapper getUserMapper() {
        return userMapper;
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public Boolean login(String name,String password){
        User bruce = userMapper.getUser(name,password);
        if(bruce!=null) {
            return true;
        } else {
            return false;
        }
    }
}
