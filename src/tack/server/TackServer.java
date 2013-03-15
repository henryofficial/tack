package tack.server;

/** Handles all database read/writes, as well as non-user-specific actions. */
public class TackServer {
	private TackDatabase tackDatabase;
	private UserDatabase userDatabase;

	// queries user database and (re)creates an object representation
	public User userFromUsername(String username) {

	}

	public boolean postTack(Tack t) {

	}

	public boolean removeTack(Tack t) {

	}

	public List<Tack> getTacksNear(Location loc) {

	}
}