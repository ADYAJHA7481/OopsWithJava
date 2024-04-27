//WAP  to take input from user to print name and age & compare the age by creating objects and methods in two different classes. 
import java.util.*;

class Name_age {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class CompAge {
    public void compAge(Name_age user1, Name_age user2) {
        if (user1.getAge() > user2.getAge()) {
            System.out.println(user1.getName() + " is older than " + user2.getName());
        } else if (user1.getAge() < user2.getAge()) {
            System.out.println(user2.getName() + " is older than " + user1.getName());
        } else {
            System.out.println(user1.getName() + " and " + user2.getName() + " are of the same age.");
        }
    }
}

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Name_age user1 = new Name_age();
        System.out.print("Enter Your name : ");
        user1.setName(sc.nextLine());
        System.out.print("Enter Your age : ");
        user1.setAge(sc.nextInt());

        Name_age user2 = new Name_age();
        System.out.print("Enter Your name : ");
        sc.nextLine();
        user2.setName(sc.nextLine());
        System.out.print("Enter Your age : ");
        user2.setAge(sc.nextInt());

        CompAge c1 = new CompAge();
        c1.compAge(user1, user2);
    }
}
