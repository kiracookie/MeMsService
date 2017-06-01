package org.me.controller;

import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedHashMap;
import java.util.Map;

@Controller
@RequestMapping("/activity")
public class ApplyForActivity {
    private static Gson gson = new Gson();

    /**
     * 1. 使用RequestMapping注解来映射请求的URL
     * 2. 返回值会通过视图解析器解析为实际的物理视图, 对于InternalResourceViewResolver视图解析器，会做如下解析
     * 通过prefix+returnVal+suffix 这样的方式得到实际的物理视图，然后会转发操作
     * "/WEB-INF/views/success.jsp"
     *
     * @return
     */
    //获取参加人员列表
    @ResponseBody
    @RequestMapping(value = "/getApplyList/{date}", method = RequestMethod.POST)
    public String getApplyList(@PathVariable String date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Map<String, Object> a = new LinkedHashMap<>();
        a.put("cc", sdf.parse(date));
        return gson.toJson(a);
    }

    //提交参加
    @ResponseBody
    @RequestMapping(value = "/joinActivity/{user},{num}", method = RequestMethod.POST)
    public String joinActivity(@PathVariable String user, @PathVariable int num) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Map<String, Object> a = new LinkedHashMap<>();
        a.put("cc", user + "===" + num);
        return gson.toJson(a);
    }
}