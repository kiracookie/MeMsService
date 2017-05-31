package org.me;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.LinkedHashMap;
import java.util.Map;

@Controller
@RequestMapping("/demo")
public class HelloWorld {

    /**
     * 1. 使用RequestMapping注解来映射请求的URL
     * 2. 返回值会通过视图解析器解析为实际的物理视图, 对于InternalResourceViewResolver视图解析器，会做如下解析
     * 通过prefix+returnVal+suffix 这样的方式得到实际的物理视图，然后会转发操作
     * "/WEB-INF/views/success.jsp"
     *
     * @return
     */
    @RequestMapping("/helloworld")
    @ResponseBody
    public String hello() {
        System.out.println("hello world");
        Map<String, Object> a = new LinkedHashMap<>();
        a.put("cc", 21312);
        return Json;
    }
}