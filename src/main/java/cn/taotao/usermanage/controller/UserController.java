package cn.taotao.usermanage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.taotao.usermanage.bean.EasyUIResult;
import cn.taotao.usermanage.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {
    
    @Autowired
    private UserService userService;

    /**
     * 返回user
     */
    @RequestMapping(value="list",method = RequestMethod.GET )
    @ResponseBody
    public EasyUIResult queryUserList(@RequestParam("page") Integer page,@RequestParam("rows") Integer rows){
        EasyUIResult easyUIResult = this.userService.queryUserList(page,rows);
        return easyUIResult;
        
    }
}
