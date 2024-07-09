// 6510405792 Vimudakorn Kittechapanich

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user = new User("vimudakorn.k@gmail.com" , "vimudakorn" , 21);
        ValidateByEmail validateByEmail = new ValidateByEmail();
        ValidateByName validateByName = new ValidateByName();
        ValidateByAge validateByAge = new ValidateByAge();

        List<Validation> validationList = new ArrayList<>();
        validationList.add(validateByEmail);
        validationList.add(validateByName);
        validationList.add(validateByAge);

        System.out.println(user.register(user,validationList));
    }
}