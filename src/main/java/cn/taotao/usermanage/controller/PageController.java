package cn.taotao.usermanage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 通用跳转页面
 * @author didi
 *
 */
@Controller
@RequestMapping("page")
public class PageController {
    
    /**
     * 具体跳转页面逻辑
     * 限制只get访问
     * @param pageName
     * @return
     */
    @RequestMapping(value="{pageName}", method = RequestMethod.GET)
    public String toPage(@PathVariable("pageName") String pageName){
        return pageName;
    }
        
}
