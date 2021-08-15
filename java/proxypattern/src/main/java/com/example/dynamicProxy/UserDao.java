package com.example.dynamicProxy;

/**
 * 但凡是业务类，都向上做了一层抽象（接口形式）
 * 代理类直接操纵的是业务类的抽象形态
 * 抽象形态和具体形态不同的是抽象是只保留结果功能定义，细节留在具体的底层（细节对于代理类怎么代理其实没多大干扰）
 */
public class UserDao implements AbstractUserDao{

    @Override
    public Boolean findUserById(String userId) {
        if (userId.equalsIgnoreCase("张无忌")) {
            System.out.println("查询id为" + userId + "用户信息成功！");
            return true;
        }else {
            System.out.println("查询ID为" + userId + "的用户信息失败");
            return false;
        }
    }
}
