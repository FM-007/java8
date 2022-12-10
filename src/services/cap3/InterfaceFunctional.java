package services.cap3;

import interfaces.Validator;

public class InterfaceFunctional {

    public static void main(String[] args) {

        Validator<String> validateCEP = value -> {
            return value.matches("[0-9]{5}-[0-9]{3}");
        };

        System.out.println(validateCEP.validate("09941-230"));
    }
}
