import java.util.Scanner;

/**
 * Created by stevejaminson on 5/18/16.
 */
public class Greeting {

    String name = "";
    public String getUserName(String msg){
        System.out.println(msg);
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        return name;
    }

    public boolean checkName(String name){
        if(name.equals("Alice") || name.equals("Bob"))
            return true;
        else
            return false;
    }

    public void printName(){
        if(checkName(getUserName("Enter your name: "))){
            System.out.println("Hello " + name);
        }
    }

    public static void main(String[] args) {
        Greeting greeting = new Greeting();
        greeting.printName();
    }
}
