package test;


import com.sun.tools.javac.util.ArrayUtils;

public class FXNewsProvider {
    private IFXNewsListener newsListener;
    private IFXNewsPersister newPersistener;
    public void getAndPersisNews() {
        String[] newsIds = newsListener.getAvaliableNewsIds();
        if (ArrayUtils.isEmpty(newsIds)) {
            return;
        }
        for(String newsId : newsIds) {
            FXNewsBean newsBean = newsListener.getNewsByPK(newsId);
            newPersistener.persistNews(newsBean);
            newsListener.postProcessIfNecessary(newsId);
        }
    }
}
