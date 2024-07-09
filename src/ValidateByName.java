// 6510405792 Vimudakorn Kittechapanich
public class ValidateByName implements Validation{
    @Override
    public void validate(User user) {
        isEmpty(user);
        checkFormat(user);
    }

    public void isEmpty(User user) {
        if (user.getName() == null || user.getName().trim().equals("")) {
            throw new IllegalArgumentException("Name should not empty");
        }
    }

    public void checkFormat(User user) {
        if ( !user.getName().matches("[a-zA-Z]+")){
            throw new IllegalArgumentException("Name is wrong format");
        }
    }
}
