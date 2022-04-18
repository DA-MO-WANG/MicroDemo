package test;

public class FXNewsRetrieveFailureException extends Exception{
    @Override
    public String getMessage() {
        return "没有新闻供应，得到失败！";
    }
}
