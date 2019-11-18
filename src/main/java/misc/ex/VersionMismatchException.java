package misc.ex;

public class VersionMismatchException extends RuntimeException {

	/**
	 * Idk what this is but it yelled at me when I didn't add it
	 */
	private static final long serialVersionUID = 1L;
	public VersionMismatchException(String found, String expected) {
		super("Version found: " + found + "\nExpected: " + expected);
	}
}
