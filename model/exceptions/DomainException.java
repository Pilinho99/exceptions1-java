package exceptions_14.model.exceptions;

// RuntimeException = not mandatory to catch exceptions
// Exception = mandatory to catch exceptions

public class DomainException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) {
		super(msg);
	}

}
