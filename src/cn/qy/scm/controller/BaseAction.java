package cn.qy.scm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.ServletContext;

@Controller
@RequestMapping("/base")
public class BaseAction {

    @Resource
    ServletContext servletContext;

    @RequestMapping(value = "/pageTransitionByURL/{folder}/{file}")
    public String pageTransitionByURL(@PathVariable String folder, @PathVariable String file){
        return "forward:/WEB-INF/jsp/"+folder + "/" + file + ".jsp";
    }
}
