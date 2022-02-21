package com.company.challange2;

/**
 * Question 2
 * Deborah signed up for a social network to keep in touch with her friends.
 * The registration page required the completion of the name and password fields,
 * but the password needs to be strong. The site considers a strong password when
 * it meets the following criteria:
 *    -> It has at least 6 characters.
 *    -> Contains at least 1 digit.
 *    -> Contains at least 1 letter in lowercase.
 *    -> Contains at least 1 letter in capital letters.
 *    -> Contains at least 1 special character. Special characters are: !@#$%^&*()-+
 * */

public class PasswordRegex {
    public static void main(String[] args) {
        PasswordValidation passwordValidator = new PasswordValidation();

        System.out.println("'jhM7@' is valid? = "+passwordValidator.validate("jhM7@"));
        System.out.println("'jhn7MCS&' is valid?  = "+passwordValidator.validate("jhn7MCS&"));
        System.out.println("'carl77Mcs$&' is valid?  = "+passwordValidator.validate("carl77Mcs$&"));

        System.out.println("--------------------------------------------------");

        // Use case: It has at least 6 characters

        System.out.println("'c7MC$' is valid? = "+passwordValidator.validate("c7MC$"));

        // Use case: Contains at least 1 letter in capital letters
        System.out.println("'jhon7$' is valid? = "+passwordValidator.validate("jhon7$"));


        // Use case: Contains at least 1 special character. Special characters are: !@#$%^&*()-+
        System.out.println("'emmanoelMC7*' is valid? = "+passwordValidator.validate("emmanoelMC7*"));

        // Use case: Contains at least 1 digit

        System.out.println("'emmanoelDD&' is valid? = "+passwordValidator.validate("emmanoelDD&"));


        // Use Case: Contains at least 1 letter in lowercase
        System.out.println("'MANEL7&' is valid? = "+passwordValidator.validate("MANEL7&"));
    }
}
