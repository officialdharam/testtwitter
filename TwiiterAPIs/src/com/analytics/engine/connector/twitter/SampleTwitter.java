package com.analytics.engine.connector.twitter;

import java.util.List;

import twitter4j.Tweet;

import com.analytics.engine.connector.twitter.model.CommonCredentials;

public class SampleTwitter {
	public static void main(String[] args) {
		searchTweets(false, "carlsberg",false, null);
//		searchTrends(false,false, null);
	}

	public static void searchTweets(boolean constructStory,final String query,  boolean downloadAndSaveImages, String newPath) {
		SearchTweets search = new SearchTweets(CommonCredentials.CONSUMER_KEY_TWITTER, CommonCredentials.CONSUMER_SECRET_TWITTER, CommonCredentials.ACCESS_TOKEN_TWITTER, CommonCredentials.ACCESS_TOKEN_SECRET_TWITTER);
		List<Tweet> tweets = search.searchTweets(constructStory, query, 30,downloadAndSaveImages);

		for (Tweet tweet : tweets) {
			System.out.println(tweet);

		}
	}
	

//	public static void searchTrends(boolean constructStory,boolean downloadAndSaveImages, String newPath) {
//		SearchTrends search = new SearchTrends();
//		List<Trend> trends = search.searchTrend(constructStory, false, null);
//
//		for (Trend trend : trends) {
//			System.out.println(trend);
//
//		}
//	}

}
