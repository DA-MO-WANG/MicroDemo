package test;

public interface IFXNewsListener {
    String[] getAvaliableNewsIds();
    FXNewsBean getNewsByPK(String newsId);

    void postProcessIfNecessary(String newsId);
}
