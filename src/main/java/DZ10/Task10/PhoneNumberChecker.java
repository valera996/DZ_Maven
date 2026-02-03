package DZ10.Task10;

public class PhoneNumberChecker {
    public boolean isValidPhoneNumber(String phone) {
        return phone.matches("\\+\\d{1,3} \\d{10}");
    }
}
