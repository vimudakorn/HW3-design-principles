// 6510405792 Vimudakorn Kittechapanich

import java.util.List;

public class User {
    private String email;
    private String name;
    private int age;
    User(String email , String name , int age) {
        this.email = email;
        this.name = name;
        this.age = age;

    }

    public boolean register(User user, List<Validation> validationList) {
        for (Validation validation:validationList){
            validation.validate(user);
        }
        return true;
    }
    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
