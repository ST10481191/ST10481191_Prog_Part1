public class Login {

    private String firstName;
    private String lastName;

    private String storedUsername;
    private String storedPassword;
    private String storedCell;

    public Login(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public boolean checkUserName(String username) {
        return username.contains("_") && username.length() <= 5;
    }

    public boolean checkPasswordComplexity(String password) {
        if (password.length() < 8) return false;

        boolean hasUpper = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) hasUpper = true;
            else if (Character.isDigit(c)) hasDigit = true;
            else if (!Character.isLetterOrDigit(c)) hasSpecial = true;
        }

        return hasUpper && hasDigit && hasSpecial;
    }

    public boolean checkCellPhoneNumber(String cell) {
        return cell.startsWith("+27") && cell.length() == 12;
    }

    public String registerUser(String username, String password, String cell) {

        if (!checkUserName(username)) {
            return "Username is not correctly formatted";
        }

        if (!checkPasswordComplexity(password)) {
            return "Password is not correctly formatted";
        }

        if (!checkCellPhoneNumber(cell)) {
            return "Cell phone number incorrectly formatted";
        }

        storedUsername = username;
        storedPassword = password;
        storedCell = cell;

        return "User successfully registered";
    }

    public boolean loginUser(String username, String password) {
        return username.equals(storedUsername) && password.equals(storedPassword);
    }

    public String returnLoginStatus(boolean success) {
        if (success) {
            return "Welcome " + firstName + " " + lastName + ", it is great to see you again.";
        } else {
            return "Username or password incorrect, please try again.";
        }
    }
}