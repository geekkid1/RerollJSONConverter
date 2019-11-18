package misc.ex;

/**
 * This exception will be thrown if the version number provided in the XML does not match
 * with the expected version (in this case "5"). If the versions do not match then deserialization
 * may not be possible due to the differences in formats between versions.
 * @author geekkid1
 *
 */
public class VersionMismatchException extends RuntimeException {

	/**
	 * Idk what this is but it yelled at me when I didn't add it
	 */
	private static final long serialVersionUID = 1L;
	public VersionMismatchException(String found, String expected) {
		super("Version found: " + found + "\nExpected: " + expected);
	}
}
