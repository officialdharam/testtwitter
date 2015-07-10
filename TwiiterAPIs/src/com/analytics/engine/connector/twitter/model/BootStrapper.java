package com.analytics.engine.connector.twitter.model;

import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class BootStrapper {
	
	public static Twitter bootStrapTwitterAPI() {
		ConfigurationBuilder cb = new ConfigurationBuilder();
		Twitter twitter = null;
		TwitterFactory tf = null;
		try {
			cb.setDebugEnabled(true)
					.setOAuthConsumerKey(CommonCredentials.CONSUMER_KEY_TWITTER)
					.setOAuthConsumerSecret(CommonCredentials.CONSUMER_SECRET_TWITTER)
					.setOAuthAccessToken(CommonCredentials.ACCESS_TOKEN_TWITTER)
					.setOAuthAccessTokenSecret(CommonCredentials.ACCESS_TOKEN_SECRET_TWITTER);

			tf = new TwitterFactory(cb.build());
			twitter = tf.getInstance();

		} catch (Exception e) {
			// not able to get a twitter API instance.
		}
		return twitter;
	}
	
	public static Twitter bootStrapTwitterAPI(String consumerKey, String consumerSecret, String accessToken, String accessTokenSecret) {
		ConfigurationBuilder cb = new ConfigurationBuilder();
		Twitter twitter = null;
		TwitterFactory tf = null;
		try {
			cb.setDebugEnabled(true)
					.setOAuthConsumerKey(consumerKey)
					.setOAuthConsumerSecret(consumerSecret)
					.setOAuthAccessToken(accessToken)
					.setOAuthAccessTokenSecret(accessTokenSecret);

			tf = new TwitterFactory(cb.build());
			twitter = tf.getInstance();

		} catch (Exception e) {
			// not able to get a twitter API instance.
		}
		return twitter;
	}
	
}
