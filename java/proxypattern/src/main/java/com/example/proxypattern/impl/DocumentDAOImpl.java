package com.example.impl;

import cn.hutool.core.util.StrUtil;
import com.example.DocumentDAO;

/**
 * @Description TO DO
 * @Classname DocumentDAOImpl
 * @Date 2023/1/30 14:39
 * @Created by richheart
 * Copyright (c) All Rights Reserved, 2022.
 */
public class DocumentDAOImpl implements DocumentDAO {
    @Override
    public Boolean deleteDocumentById(String documentId) {
        if(StrUtil.equals("D001", documentId)) {
            System.out.println("ID为" + documentId + ", 删除成功！");
            return true;
        }else {
            System.out.println("ID为" + documentId + ", 删除失败！");
            return false;
        }
    }
}
