package com.example.proxypattern.pattern;

import lombok.extern.java.Log;

public class ProxySearcher implements Searcher{
    private RealSearcher searcher = new RealSearcher();
    private AccessValidator validator;
    private Logger logger;

    public String doSearch(String userId, String keyword) {
        if (validate(userId)) {
            String result = searcher.doSearch(userId,keyword);
            logger.log(userId);
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
