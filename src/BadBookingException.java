
public class BadBookingException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BadBookingException() {
		// TODO Auto-generated constructor stub
		super("Bad Booking");
	}
	
	public BadBookingException(String message) {
		super(message);
	}
	
	
}
