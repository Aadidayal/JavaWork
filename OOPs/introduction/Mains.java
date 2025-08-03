package OOPs.introduction;

public class Mains {
    public static void main(String[] args) {
        // store 5 roll nos
        int[] numbers = new int[5];

        // store 5 names
        String[] names = new String[5];

        // data of 5 students: {roll no, name, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];
        // just declaring
        // Student kunal;

        Student Aadi = new Student();
        Aadi.marks = 30.2f;
        Aadi.name = "Aadi Dayal";
        Aadi.rno = 23;
        // so repetative that i need to write all properties for this class

        // make use of constructor

        Student Rahul = new Student(23, "Aadi", 43.2f);

        // System.out.println(Rahul);
        // System.out.println(Rahul.name);
        // System.out.println(Rahul.rno);
        // System.out.println(Rahul.marks);
        // Rahul.greet();
        Student Aaadi = new Student(45, "Aadi Dayall", 43.2f);

        System.out.println(Aaadi.rno);
        System.out.println(Aaadi.name);
        System.out.println(Aaadi.marks);

        // System.out.println(Aadi.rno);
        // System.out.println(Aadi.name);
        // System.out.println(Aadi.marks);

        Student random = new Student(Aaadi);
        // System.out.println(random.name);

        // REFERENCE POINTING THING
        Student one = new Student();
        Student two = one;

        one.name = "Something something";

        // System.out.println(two.name);

    }

    static class Student {
        int rno;
        String name;
        float marks;

        // Default Constructor (Optional, but good practice)
        Student() {
            // this is how you call a constructor from another constructor
            // internally: new Student (13, "default person", 100.0f);
            this(13, "default person", 100.0f);
        }

        void greet() {
            System.out.println("Hellow my name is:" + this.name);

        }

        // Student arpit = new Student(17, "Arpit", 89.7f);
        // here, this will be replaced with arpit
        Student(int rno, String naaam, float markks) {
            this.rno = rno;
            this.name = naaam;
            this.marks = markks;
        }

        Student(Student other) {
            this.name = other.name;
            this.rno = other.rno;
            this.marks = other.marks;
        }

    }

}
