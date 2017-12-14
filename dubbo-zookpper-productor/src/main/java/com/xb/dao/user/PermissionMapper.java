package com.xb.dao.user;

import com.xb.model.Permission;

import java.util.List;
import java.util.Map;

public interface PermissionMapper {
    int deleteByPrimaryKey(String tId);

    int insert(Permission record);

    int insertSelective(Permission record);

    Permission selectByPrimaryKey(String tId);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);

    List<Map<String,Object>> selectMenuListDict();
}