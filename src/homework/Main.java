package homework;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");
        Reporter rep = new Reporter();
        rep.report(user);
        user.save();
    }
}