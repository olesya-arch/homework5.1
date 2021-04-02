package academy.belhard;


import academy.belhard.entity.Users;

public class Main{

    public static void main(String[] args) {
        Users user1 = new Users("David", "Brown", "david.brown@gmail.com", "qwe" );
        user1.getFullInfo();
        user1.isPasswordCorrect("ttt");
        user1.isPasswordCorrect("qwe");
    }
}
