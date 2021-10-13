package lesson13HomeWork.LoginProgram;

public class Login {

    public static boolean isStringValid(String toValidate) {
            for (int i = 0; i < toValidate.length(); i++) {
                if (!Character.isLetterOrDigit(toValidate.charAt(i)) && (toValidate.charAt(i) != '_')) {
                    return false;
                }
            }
        return true;
    }

    public static void loginUser (String login, String password, String confirmPassword) {
        try {
          if (!isStringValid(login) || (login.length() > 20)) {
              throw new WrongLoginException("Login is incorrect");
          } else if (!isStringValid(password) || (password.length() > 20) || !confirmPassword.equals(password)) {
              throw new WrongPasswordException("Password is incorrect");
          } else {
              System.out.println("Login and password are correct. Welcome back!");
          }
        } catch (WrongLoginException e) {
            System.out.println("Login process: " + e.getMessage());
            e.printStackTrace();
        } catch (WrongPasswordException j) {
            System.out.println("Login process: " + j.getMessage());
            j.printStackTrace();
        }
    }

    public static void main(String[] args) {
        loginUser("` ", "qweds ÎÍÅr123", "qweds ÎÍ fÅr123");
        loginUser("ValeraValera", "qwerty 123", "qwerty123");
        loginUser("Valerka_666", "lolkek_123", "lolkek_123");
    }
}

