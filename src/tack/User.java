package tack;

public class User {
	private String username, password;
	private LinkedList<Tack> myTacks;

	public User(String username, String password) {
		this.username = username;
		this.password = password;

		myTacks = new LinkedList<Tack>();
	}

	public String getUsername() {
		return username;
	}

	public List<Tack> getTacks() {
		return myTacks;
	}

	public boolean postTack(Tack t) {
		if (t == null) return false;

		myTacks.addFirst(t);

		return true;
	}

	/** Creates an XML representation of a user's data. */
	public String getUserData() {
		String toReturn = "<user>\n";

		toReturn = toReturn + "<username>" + username + "</username>\n";
		toReturn = toReturn + "<myTacks>" + getTackData() + "</myTacks>\n";

		return toReturn + "</user>";
	}

	private String getTackData() {
		String toReturn = "";

		for (Tack t : myTacks) {
			toReturn = toReturn + "<tack>" + t.getID() + "</tack>\n";
		}

		return toReturn;
	}

	public String toString() {
		return username;
	}

	public int hashCode() {
		int toReturn = 17;

		toReturn = 31 * toReturn + ((username == null) ? username.hashCode() : 0);
		toReturn = 31 * toReturn + ((password == null) ? password.hashCode() : 0);

		return toReturn;
	}

	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if ((o == null) || !(o instanceof User)) {
			return false;
		}

		User u = (User)o;

		return u.getUsername().equals(username);
	}
}