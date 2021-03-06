import java.util.Objects;

class PasswordValidator {

    Boolean isValid(String password) {
        return hasUpperCase(password)
                && hasLowerCase(password)
                && hasUnderScore(password)
                && isLongEnough(password);
    }

    private boolean isLongEnough(String password) {
        return password.length() > 8;
    }

    private boolean hasUnderScore(String password) {
        return password.indexOf('_') != -1;
    }

    private boolean hasLowerCase(String password) {
        return !password.toUpperCase().equals(password);
    }

    private boolean hasUpperCase(String password) {
        return !password.toLowerCase().equals(password);
    }
}
