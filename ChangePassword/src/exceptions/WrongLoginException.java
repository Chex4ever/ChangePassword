package exceptions;

public class WrongLoginException extends RuntimeException{

		public WrongLoginException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WrongLoginException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public WrongLoginException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public WrongLoginException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public WrongLoginException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
}
