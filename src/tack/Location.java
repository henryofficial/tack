package tack;

import java.ma

public class Location {
	private double longitude, latitude, altitude;

	public Location(double longitude, double latitude, double altitude) {
		this.longitude = longitude;
		this.latitude = latitude;
		this.altitude = altitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public double getAltitude() {
		return altitude;
	}

	/** Calculates the 2D (non-altitudinal) distance between two locations.
	 *
	 *	@param 	l 	the "destination" location.
	 *	@returns 	the distance (in kilometers) from this Location to Location l, or 
	 *					-1 if l is an invalid Location.
	 */
	public double distanceTo(Location l) {
		if (l == null) {
			return -1;
		}

		return 2. * r * Math.asin(Math.sqrt(Math.sin((l.getLatitude()-latitude)/2.) * Math.sin((l.getLatitude()-latitude)/2.) 
			+ Math.cos(l.getLatitude()) * Math.cos(latitude) 
			* Math.sin((l.getLongitude()-longitude)/2.) * Math.sin((l.getLongitude-longitude)/2.)));
	}

 	public int hashCode() {
		int toReturn = 17;

		long l = Double.doubleToLongBits(longitude);
		toReturn = 31 * toReturn + (int)(l ^ (l >>> 32));
		l = Double.doubleToLongBits(latitude);
		toReturn = 31 * toReturn + (int)(l ^ (l >>> 32));
		l = Double.doubleToLongBits(altitude);
		toReturn = 31 * toReturn + (int)(l ^ (l >>> 32));

		return toReturn;
	}

	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if ((o == null) || !(o instanceof Location)) {
			return false;
		}

		Locaiton l = (Locaiton)o;

		return (t.getLongitude().equals(longitude) &&
				t.getLatitude().equals(latitude) &&
				t.getAltitude().equals(altitude));
	}

	public String toString() {
		return "(" + latitude + ", " + longitude + ")";
	}
}