package tack.server;

public class UserDatabase {
	public boolean writeUserFile(User user) {

	}

	public User parseUserFile(String username) {
		File userFile = new File("/data/users/" + username);
		if (!userFile.exists()) {
			throw new NoSuchElementException("Could not find a user file with that name.");
		}

		
	}
}