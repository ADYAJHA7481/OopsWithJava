//Create a database for 3 students. Use proper OOP approach
public class ex3 {
    public static class Student {
        private String name;
        private int id;
        private int age;

        public Student(String name, int id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }

        public void output() {
            System.out.println("Name = " + name);
            System.out.println("ID = " + id);
            System.out.println("Age = " + age);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Ram", 1, 20);
        Student s2 = new Student("Shyam", 2, 22);
        Student s3 = new Student("Sita", 3, 21);

        s1.output();
        s2.output();
        s3.output();
    }
}

