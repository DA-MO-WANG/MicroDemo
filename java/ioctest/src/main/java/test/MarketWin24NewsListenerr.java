package test;

public class MarketWin24NewsListenerr implements IFXNewsListener{
    @Override
    public String[] getAvaliableNewsIds() {
        throw new FXNewsRetrieveFailureException();
    }

    @Override
    public FXNewsBean getNewsByPK(String newsId) {
        return null;
    }

    @Override
    public void postProcessIfNecessary(String newsId) {

    }
}
