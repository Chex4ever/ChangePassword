import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

public class Main {
	public static void main(String[] args) {
		String login = "Evgeniy_Chekhovich";
		String password = "P@ssw0rd";
		String confirmPassword = "Passw0rd";
		changePassword(login, password, confirmPassword);
	}

	public static void changePassword(String login, String password, String confirmPassword) {
		try {
			validateLogin(login);
			validatePassword(password, confirmPassword);
		} catch (WrongLoginException e) {
			e.printStackTrace();
		} catch (WrongPasswordException e) {
			e.printStackTrace();
		};
	}

	public static Boolean validateLogin(String login) throws WrongLoginException {
		String patternLogin = "^[a-zA-Z0-9_]{3,20}$";
		if (!login.matches(patternLogin)) {
			throw new WrongLoginException();
		};
		return true;
	}

	public static Boolean validatePassword(String password, String confirmPassword) throws WrongPasswordException {
		String patternPassword = "^[a-zA-Z0-9_]{3,20}$";
		if (!password.matches(patternPassword) || !password.equals(confirmPassword)) {
			throw new WrongPasswordException();
		};
		return true;
	}
}
