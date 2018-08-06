package cn.vic.mapper;

import cn.vic.bean.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    User getUserById(Integer id);
}

