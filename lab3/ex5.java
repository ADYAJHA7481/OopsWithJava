//WAP  to take input from user to print name and age & compare the age by creating objects and methods in two different classes. 
import java.util.*;

class Name_age
{
    public void Name()
    {
        String name;
        int age;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Your name : ");
        name = sc.nextLine();
        System.out.print("Enter Your age : ");
        age= sc.nextInt();
        System.out.print("Your Name is "+name);
        System.out.print("\nYour age is "+age);
    }
};

class CompAge
{
    public void CompareAge(Name_age user1,Name_age user2)
    {
    }
}

public class ex5 {
    
    public static void main(String[] args) {
        Name_age user1=new Name_age();
        user1.Name();
    }
}
