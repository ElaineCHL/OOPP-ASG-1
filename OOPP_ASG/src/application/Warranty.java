package application;

public class Warranty {

	private static int duration; // in Years

	public Warranty() {
		Warranty.duration = 0;
	}

	public Warranty(int duration) {

		Warranty.duration = duration;
	}

	public static int getDuration() {
		return duration;
	}

}
