package recipes.exception;

@SuppressWarnings("serial")
public class DbException extends RuntimeException {

	public DbException() {
			}

	public DbException(String message) {
		super(message);
	}

	public DbException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public DbException(String message, Throwable cause) {
		super(message, cause);
	}

	public DbException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
