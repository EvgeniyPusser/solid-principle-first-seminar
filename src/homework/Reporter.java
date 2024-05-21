package homework;

public class Reporter implements Repo{
    public void report(User user){
        System.out.println("Report for user: " + user.getName());
    }
}


