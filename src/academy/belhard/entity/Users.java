package academy.belhard.entity;

public class Users extends Person {
    private final String email;
    private final String password;
    public Users (String firstName, String lastName, String email, String password ) {
        super(firstName, lastName);
        this.email = email;
        this.password = password;

    }
    public void getFullInfo (){
        String fullInfo = "Имя: " + getFullName() + "\n" + "E-mail: " + email;
        System.out.println(fullInfo);
    }
    public boolean isPasswordCorrect (String password) {
    if (this.password.equals(password)) {
        System.out.println(true);
    }else
        System.out.println(false);
    return true;
    }
}

