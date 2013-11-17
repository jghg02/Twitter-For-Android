package configure;

import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;
import twitter4j.conf.Configuration;
import twitter4j.conf.ConfigurationBuilder;

/**
 * Created by jghg on 2013-11-17.
 */
public class TwitterConfig {


    private ConfigurationBuilder configurationBuilder;
    private Twitter twitter;
    private TwitterFactory twitterFactory;


    private final static String CONSUMER_KEY = "uj3Xt9grf4C0IUOFufyvBg";
    private final static String CONSUMER_SECRET_KEY = "uGfKahMf30nl1Wm1NpEyYhK0srCBgRs8vPO7vt3hto";
    private final static String ACCESS_TOKEN = "38358670-fCPNbgK2qXcaHW5gldBaZM2qvXgwtyfxKXVUg3wqw";
    private final static String ACCES_TOKEN_SECRET = "CpOXgYVqTOpTKxSXFpniA2dtqNgFYhFRDLA7v2MsdbfUY";
    private final static String TWITTER_USERNAME = "";


    /**
     * Metodo que nos permite configurar todas las credenciales necesarias para poder
     * hacer uso del API v1.1 de Twitter desde nuestra Aplicacion.
     */
    public void configTwitter() {
        configurationBuilder = new ConfigurationBuilder();
        configurationBuilder.setUseSSL(true);
        configurationBuilder.setApplicationOnlyAuthEnabled(true);
        configurationBuilder.setOAuthConsumerKey(CONSUMER_KEY);
        configurationBuilder.setOAuthConsumerSecret(CONSUMER_SECRET_KEY);
        configurationBuilder.setOAuthAccessToken(ACCESS_TOKEN);
        configurationBuilder.setOAuthAccessTokenSecret(ACCES_TOKEN_SECRET);
        configurationBuilder.setJSONStoreEnabled(true);
        configurationBuilder.setIncludeEntitiesEnabled(true);
        configurationBuilder.setIncludeMyRetweetEnabled(true);
        configurationBuilder.setIncludeRTsEnabled(true);
        Configuration configuration = configurationBuilder.build();
        twitterFactory = new TwitterFactory(configuration);

        AccessToken accessToken = new AccessToken(ACCESS_TOKEN, ACCES_TOKEN_SECRET);

        twitter = twitterFactory.getInstance(accessToken);
    }
}
