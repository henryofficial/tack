package tack;

import java.util.*;

public class Tack {
	/* Content data */
	private User author;
	private String content;
	private Location location;

	/* Metadata */
	private int viewCount;
	private Date dateCreated;
	private long tack_id;

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

	public long getID() {
		return tack_id;
	}

	public int hashCode() {
		int toReturn = 17;

		toReturn = 31 * toReturn + ((author == null) ? author.hashCode() : 0);
		toReturn = 31 * toReturn + ((content == null) ? content.hashCode() : 0);
		toReturn = 31 * toReturn + ((location == null) ? location.hashCode() : 0);
		toReturn = 31 * toReturn + ((dateCreated == null) ? dateCreated.hashCode() : 0);
		toReturn = 31 * toReturn + viewCount;

		return toReturn;
	}

	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if ((o == null) || !(o instanceof Tack)) {
			return false;
		}

		Tack t = (Tack)o;

		return (t.getAuthor().equals(author) &&
				t.getContent().equals(content) &&
				t.getLocation().equals(location) &&
				t.getDateCreated().equals(dateCreated) &&
				(t.getViewCount() == viewCount));
	}

	public String toString() {
		return user.toString() + " : " + content + "\t" + location.toString();
	}
}