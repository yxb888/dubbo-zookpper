package com.xb.web.user;

import com.xb.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/12/12.
 */
@Controller
@RequestMapping(value = "/user")
public class UserContrller {
@Autowired
private UserService userService;



    //	查看当前用户 所属的权限树
    @RequestMapping("getCurrenUserNodes")
    @ResponseBody
    public List<Map<String, Object>> getCurrenUserNodes(HttpServletRequest request){
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        System.out.println("111");
        list = userService.selectMenuListDict();
        return list;
    }



}
