package test;

public class FXNewsProvider {
    private IFXNewsListener newsListener;
    private IFXNewsPersister newPersistener;
    public void getAndPersisNews() {
        String[] newsIds = newsListener.getAvaliableNewsIds();
        if (newsIds != null && newsIds.length > 0) {
            return;
        }
        for(String newsId : newsIds) {
            FXNewsBean newsBean = newsListener.getNewsByPK(newsId);
            newPersistener.persistNews(newsBean);
            newsListener.postProcessIfNecessary(newsId);
        }
    }
}
