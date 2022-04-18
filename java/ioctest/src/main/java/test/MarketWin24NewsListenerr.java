package test;

public class MarketWin24NewsListenerr implements IFXNewsListener{
    @Override
    public String[] getAvaliableNewsIds() {
        return new String[0];
    }

    @Override
    public FXNewsBean getNewsByPK(String newsId) {
        return null;
    }

    @Override
    public void postProcessIfNecessary(String newsId) {

    }
}
