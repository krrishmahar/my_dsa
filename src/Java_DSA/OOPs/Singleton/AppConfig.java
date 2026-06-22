package Java_DSA.OOPs.Singleton;

public enum AppConfig {
    INSTANCE;
    private final String apiKey = System.getenv("API_KEY");

    public String getApiKey()   {   return apiKey;  };
}
