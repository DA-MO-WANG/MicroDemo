package com.example.impl;

import cn.hutool.core.util.StrUtil;
import com.example.AbstractUserDAO;

/**
 * @Description real subject - 对这个主题业务-是否存在这个用户的具体实现
 * @Classname UserDAOImpl
 * @Date 2023/1/30 14:31
 * @Created by richheart
 * Copyright (c) All Rights Reserved, 2022.
 */
public class UserDAOImpl implements AbstractUserDAO {
    @Override
    public Boolean findUserById(String userId) {
        if(StrUtil.equals("张无忌",userId)) {
            System.out.println("存在 "+ userId +" 这个用户, 查询成功！");
            return true;
        }else {
            System.out.println("不存在 "+ userId +" 这个用户, 查询失败！");
            return false;
        }
    }
}
