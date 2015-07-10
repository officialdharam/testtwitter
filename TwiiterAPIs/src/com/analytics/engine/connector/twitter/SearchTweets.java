package com.analytics.engine.connector.twitter;

import java.util.ArrayList;
import java.util.List;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.TweetEntity;
import twitter4j.Twitter;
import twitter4j.TwitterException;

import com.analytics.engine.connector.twitter.model.BootStrapper;
import com.analytics.engine.connector.twitter.model.Tweet;

/**
 * 
 * @author dprasad
 */
public class SearchTweets {

	private String consumerKey;
	private String consumerSecret;
	private String accessToken;
	private String accessTokenSecret;

	private static final String permalink = "http://twitter.com/{username}/status/{tweetID}";

	public SearchTweets() {
		super();
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

	public SearchTweets(String consumerKey, String consumerSecret, String accessToken, String accessTokenSecret) {
		super();
		this.consumerKey = consumerKey;
		this.consumerSecret = consumerSecret;
		this.accessToken = accessToken;
		this.accessTokenSecret = accessTokenSecret;
	}

	public List<Status> searchTweets(boolean constructStory, String queryString, int count, boolean downloadAndSaveImages) {

		Twitter twitter = BootStrapper.bootStrapTwitterAPI(consumerKey, consumerSecret, accessToken, accessTokenSecret);
		List<Status> tweetList = new ArrayList<Status>();
		try {

			QueryResult result;
			do {
				Query query = new Query(queryString);
				result = twitter.search(query);

				List<Status> tweets = result.getTweets();
				for (Status tweet : tweets) {
					tweetList.add(tweet);

				}
			} while ((queryString = result.getQuery()) != null);
		} catch (TwitterException te) {
			te.printStackTrace();
			System.out.println("Failed to search tweets: " + te.getMessage());
		}
		return tweetList;
	}
}
