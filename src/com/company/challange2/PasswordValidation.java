package com.company.challange2;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Validation Password
 * */
public class PasswordValidation {
    private Pattern pattern;
    private Matcher matcher;

    private static final String PASSWORD_REGEX =
            "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,})";

    public PasswordValidation(){
        pattern = Pattern.compile(PASSWORD_REGEX);
    }

    /**
     * We use regular expressions to validate our password!
     * -> @param password for validation
     * -> @return true valid password, false invalid password
     */
    public boolean validate(final String password) {
        matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
