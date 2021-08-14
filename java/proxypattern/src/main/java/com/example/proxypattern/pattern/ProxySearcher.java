package com.example.proxypattern.pattern;

import lombok.extern.java.Log;

/**
 * 代理模式
 * 第三方功能
 * 原有业务层、抽象业务层、代理业务层
 * 代理业务层维护了两个东西：原有业务层、第三方
 * ---》在代理中，包装下原有第三方
 * ---》在业务方法上，书写综合后的逻辑
 */
public class ProxySearcher implements Searcher{
    private RealSearcher searcher = new RealSearcher();
    private AccessValidator validator;
    private Logger logger;

    public String doSearch(String userId, String keyword) {
        if (validate(userId)) {
            String result = searcher.doSearch(userId,keyword);
            log(userId);
            return result;
        }else {
            return null;
        }
    }
    public boolean validate(String userId) {
        validator = new AccessValidator();
        return validator.validate(userId);
    }

    public void log(String userId) {
        logger = new Logger();
        logger.log(userId);
    }
}
