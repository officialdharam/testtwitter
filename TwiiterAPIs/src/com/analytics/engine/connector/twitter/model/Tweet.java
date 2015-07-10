package com.analytics.engine.connector.twitter.model;

import java.util.Date;
import java.util.List;

public class Tweet{
	private Date createdAt ;
	private long id;
	private String text;
	private String source;
	private long favoriteCount;
	private long retweetCount;
	private boolean isPossiblySensitive;
	private String isoLanguageCode;
	private String screenName;
	private String permalink;
	private List<String> hashTags;

    public List<String> getHashTags() {
		return hashTags;
	}

	public void setHashTags(List<String> hashTags) {
		this.hashTags = hashTags;
	}

	public String getPermalink() {
		return permalink;
	}

	public void setPermalink(String permalink) {
		this.permalink = permalink;
	}


	public Long getRowKey() {
        return Long.MAX_VALUE - createdAt.getTime();
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public long getFavoriteCount() {
		return favoriteCount;
	}

	public void setFavoriteCount(long favoriteCount) {
		this.favoriteCount = favoriteCount;
	}

	public long getRetweetCount() {
		return retweetCount;
	}

	public void setRetweetCount(long retweetCount) {
		this.retweetCount = retweetCount;
	}

	public boolean isPossiblySensitive() {
		return isPossiblySensitive;
	}

	public void setPossiblySensitive(boolean isPossiblySensitive) {
		this.isPossiblySensitive = isPossiblySensitive;
	}

	public String getIsoLanguageCode() {
		return isoLanguageCode;
	}

	public void setIsoLanguageCode(String isoLanguageCode) {
		this.isoLanguageCode = isoLanguageCode;
	}

	@Override
	public String toString() {
		return "Tweet [createdAt=" + createdAt + ", text=" + text
				+ ", favoriteCount=" + favoriteCount + ", retweetCount="
				+ retweetCount + ", isPossiblySensitive=" + isPossiblySensitive
				+ ", screenName=" + screenName + "]";
	}
}
