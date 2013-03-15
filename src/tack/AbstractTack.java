package tack;

import java.util.*;

public abstract class AbstractTack {
	/* Content data */
	private User author;
	private String content;
	private Location location;

	/* Metadata */
	private int viewCount;
	private Date dateCreated;

	public User getAuthor() {
		return author;
	}

	public String getContent() {
		return content;
	}

	public User getLocation() {
		return location;
	}

	public int getViewCount() {
		return viewCount;
	}

	public Date getDateCreated() {
		return dateCreated;
	}
}