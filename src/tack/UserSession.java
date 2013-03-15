package tack;

/** Handles all requests / posts for a single user's session. */
public class UserSession {
	private User user;
	private TackServer server;

	// assumes valid username, good login
	public UserSession(String username, TackServer server) {
		this.server = server;
		this.user = server.userFromUsername(username);
	}

	public boolean postTack(Tack t) {
		/* Add the new Tack to the database. */
		if (!db.postTack(t)) {
			return false;
		}

		/* Add the new Tack to the user's list of Tacks. */
		if (!user.postTack(t)) {
			/* Remove the tack from the database. */
			db.removeTack(t);

			return false;
		}

		/* If nothing went wrong, verify that the Tack was added. */
		return true;
	}

	public List<Tack> nearestTacks(Location currentLocation) {
		List<Tack> nearby = db.getTacksNear(currentLocation);

		java.util.Collections.sort(nearby, new Comparator<Tack>() {
			public int compare(Tack t1, Tack t2) {
				return t1.getLocation().distanceTo(currentLocation)
						 .compareTo(t2.getLocations().distanceTo(currentLocation));
			}
		});

		return nearby;
	}

	public void closeSession() {
		/* Write data out to file. */
	}
}