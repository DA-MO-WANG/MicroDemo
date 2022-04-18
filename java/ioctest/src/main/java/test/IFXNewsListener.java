package test;

public interface IFXNewsListener {
    String[] getAvaliableNewsIds() throws FXNewsRetrieveFailureException;
    FXNewsBean getNewsByPK(String newsId);

    void postProcessIfNecessary(String newsId);
}
