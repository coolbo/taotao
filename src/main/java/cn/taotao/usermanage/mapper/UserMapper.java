package cn.taotao.usermanage.mapper;

import cn.taotao.usermanage.pojo.User;

import com.github.abel533.mapper.Mapper;

/**
 * T 指定操作那张表那个实体
 * 
 * 限制 只能一张表crud ，但是两张表不行，需要传统XML形式
 * @author didi
 *
 */
public interface UserMapper extends Mapper<User>{
    
    
}
