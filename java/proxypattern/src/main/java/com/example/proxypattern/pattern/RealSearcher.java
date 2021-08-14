package com.example.proxypattern.pattern;

public class RealSearcher implements Searcher{

    public String doSearch(String userId, String keyword) {
        System.out.println("用户'" + userId + "'使用关键词'"+ keyword + "'查询商务信息！");
        return "返回具体内容";
    }
}
