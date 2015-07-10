package com.analytics.engine.connector.twitter;


/**
 * Reference:
 * https://github.com/yusuke/twitter4j/tree/master/twitter4j-examples/
 * src/main/java/twitter4j/examples User: Ram Parashar Date: 8/2/13 Time: 12:50
 * PM
 */
public class SearchTrends {

	private String consumerKey;
	private String consumerSecret;
	private String accessToken;
	private String accessTokenSecret;
	
	public SearchTrends() {
		super();
	}

	public SearchTrends(String consumerKey, String consumerSecret, String accessToken, String accessTokenSecret) {
		super();
		this.consumerKey = consumerKey;
		this.consumerSecret = consumerSecret;
		this.accessToken = accessToken;
		this.accessTokenSecret = accessTokenSecret;
	}

	public String getConsumerKey() {
		return consumerKey;
	}

	public void setConsumerKey(String consumerKey) {
		this.consumerKey = consumerKey;
	}

	public String getConsumerSecret() {
		return consumerSecret;
	}

	public void setConsumerSecret(String consumerSecret) {
		this.consumerSecret = consumerSecret;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getAccessTokenSecret() {
		return accessTokenSecret;
	}

	public void setAccessTokenSecret(String accessTokenSecret) {
		this.accessTokenSecret = accessTokenSecret;
	}
}


