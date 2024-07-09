// 6510405792 Vimudakorn Kittechapanich
public class ValidateByAge implements Validation {
    @Override
    public void validate(User user) {
        if( user.getAge() < 20 ) {
            throw new IllegalArgumentException("Age should more than 20 years");
        }
    }
}
