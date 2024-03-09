//Write a program to add, substract, multiply and divide using switch case
public class ex3 {
    public static void main(String args[]){
        int number = 2;
        int a = 15;
        int b =7;
        switch (number) {
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(a/b);
                break;        
            default:
            System.out.println("Enter Valid Input!!!");
        }
    }
}
