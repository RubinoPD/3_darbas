package lt.eif.viko.rkaskur._3uzdv_JAXRS_WebService;

/**
 * Exception thrown when a computer shop is not found.
 */

public class VeterinaryNotFoundException extends RuntimeException {

	/**
	 * Constructs a new ComputerShopNotFoundException with the specified shop ID.
	 *
	 * @param id the ID of the computer shop that was not found
	 */
	public VeterinaryNotFoundException(long id) {
		super("Could not find account " + id);
	}
}
