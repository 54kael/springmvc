package com.kael.javaconfigssm.mapper;

import com.kael.javaconfigssm.beans.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    User selectUserById(@Param("id") int id);
}
