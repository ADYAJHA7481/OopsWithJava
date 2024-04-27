//Write a program to print name of two students and their marks, and show whose marks is higher using parameterized constructor
public class ex2 {
    private String name;
    private int marks;
    
    // Parameterized constructor
    public ex2(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    
    public static void compareMarks(ex2 student1, ex2 student2) {
            if (student1.marks > student2.marks) {
                System.out.println(student1.name + " has higher marks.");
            } else if (student1.marks < student2.marks) {
                System.out.println(student2.name + " has higher marks.");
            } else {
                System.out.println("Both students have the same marks.");
            }
        }
    
    public static void main(String[] args) {
        ex2 student1 = new ex2("adya", 85);
        ex2 student2 = new ex2("divya", 92);
        System.out.println("Student 1: " + student1.name + ", Marks: " + student1.marks);
        System.out.println("Student 2: " + student2.name + ", Marks: " + student2.marks);
        compareMarks(student1, student2);
    }
}
