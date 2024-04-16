import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

public class Main {
	public static void main(String[] args) {
		String login = "Evgeniy_Chekhovich";
		String password = "Passw0rd";
		String confirmPassword = "Passw0rd";
		if (changePassword(login, password, confirmPassword)) {
			System.out.println("Пароль успешно обновлён");
		};
	}

	public static Boolean changePassword(String login, String password, String confirmPassword) {
		try {
			validateLogin(login);
			validatePassword(password, confirmPassword);
			return true;
		} catch (WrongLoginException e) {
			e.printStackTrace();
		} catch (WrongPasswordException e) {
			e.printStackTrace();
		};
		return false;
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
