package cn.taotao.usermanage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.abel533.entity.Example;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.taotao.usermanage.bean.EasyUIResult;
import cn.taotao.usermanage.mapper.UserMapper;
import cn.taotao.usermanage.pojo.User;

@Service
public class UserService {

    /**
     * UserMapper 没有实现类 不可能注入
     * 现在可以注入，原因是自动动态代理生成了一个实现类，所以能注入
     */
    @Autowired
    private UserMapper userMapper;
    
    public EasyUIResult queryUserList(Integer page, Integer rows) {
        
        //设置分页参数
        PageHelper.startPage(page,rows);
        
        
        
        Example example =  new Example(User.class);
        example.setOrderByClause("created desc");//设置查询条件
        List<User> users = this.userMapper.selectByExample(example);
        
//      List<User> users = this.userMapper.select(null);//查询 User数据 查询条件为ull 
         
        //获取分页的信息
        PageInfo<User> pageInfo = new PageInfo<User>(users);
        
        return new EasyUIResult(pageInfo.getTotal(), pageInfo.getList());
    }
    

}
