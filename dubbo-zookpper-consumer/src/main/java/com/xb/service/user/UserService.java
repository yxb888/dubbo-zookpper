package com.xb.service.user;

import com.xb.util.TreeNode;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/12/12.
 */
public interface UserService {
    List<Map<String,Object>> selectMenuListDict();
    List<TreeNode> selectTreeAll();
}
