package dao.inter;

import entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by bruce on 3/21/2015.
 */
public interface UserMapper {
    @Select("SELECT * FROM user WHERE USER_ID = #{userId}")
    User getUser(@Param("userId") String name);
}
