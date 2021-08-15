package com.example.dynamicProxy;

public class UserDao implements AbstractUserDao{
    @Override
    public Boolean findUserBy(String userId) {
        if (userId.equalsIgnoreCase("张无忌")) {
            System.out.println("查询id为" + userId + "用户信息成功！");
            return true;
        }else {
            System.out.println("查询ID为" + userId + "的用户信息失败");
            return false;
        }
    }
}
