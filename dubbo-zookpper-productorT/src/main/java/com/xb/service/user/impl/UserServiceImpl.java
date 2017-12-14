package com.xb.service.user.impl;

import com.xb.dao.user.PermissionMapper;
import com.xb.dao.user.UserMapper;
import com.xb.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/12/13.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private PermissionMapper permissionMapper;
    public List<Map<String, Object>> selectMenuListDict() {
        List<Map<String, Object>> menuList = permissionMapper.selectMenuListDict();
        if (null != menuList && 0 < menuList.size()) {
            for (Map<String, Object> map : menuList) {
                if (map.get("pid").toString().equals("0")) {
                    map.put("isParent", true);
                }
            }
        }
        return menuList;
    }
}
