package test;

import org.springframework.stereotype.Component;

@Component
public class DowJonesNewsListener implements IFXNewsListener{
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
        print();
    }

    void print() {
        System.out.println("123");
    }
}
