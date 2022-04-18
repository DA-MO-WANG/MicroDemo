package test;

public class FXNewsProviderTest extends TestCase{
    private FXNewsProvider newsProvider;
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        newsProvider = new FXNewsProvider(new MockNewsListener(),new MockNewsPersister());
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
        newsProvider = null;
    }

    protected void testGetAndPersistNewsWithoutResourceAvailable() {
        try {
            newsProvider.getAndPersisNews();
        }catch (FXNewsRetrieveFailureException e) {
            e.getMessage().toString();
            System.out.println(e.getMessage());
        }
    }
}
