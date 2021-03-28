package domain;

public class DuckException extends RuntimeException{

	public DuckException() {
		super();
	}

	public DuckException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public DuckException(String message, Throwable cause) {
		super(message, cause);
	}

	public DuckException(String message) {
		super(message);
	}

	public DuckException(Throwable cause) {
		super(cause);
	}

}
