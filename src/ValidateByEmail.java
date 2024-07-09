// 6510405792 Vimudakorn Kittechapanich
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class ValidateByEmail implements Validation {
    private String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    @Override
    public void validate(User user) {
        isEmpty(user);
        checkFormat(user);
        checkDomain(user);
    }

    public void isEmpty(User user) {
        if (user.getEmail() == null || user.getEmail().trim().equals("")) {
            throw new IllegalStateException("Exception should not empty");
        }
    }

    public void checkFormat(User user) {
        Pattern validEmailPattern = Pattern.compile(EMAIL_PATTERN);
        if( !validEmailPattern.matcher(user.getEmail()).matches() ) {
            throw new IllegalArgumentException("Email is wrong format");
        }
    }

    public void checkDomain(User user) {
        List<String> notAllowDomains = Arrays.asList("dom1.cc","dom2.cc", "dom3.cc");
        if(notAllowDomains.contains(user.getEmail().split("@")[1])) {
            throw new IllegalArgumentException("Domain Email is not allow");
        }
    }
}
