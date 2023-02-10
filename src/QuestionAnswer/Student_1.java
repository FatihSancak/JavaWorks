package src.QuestionAnswer;

public class Student_1 {
    String name = "Emily";
    int age = 20;

    public Student_1(String name, int age) {
        this.name = name;
        this.age = 22;
    }

    public static void main(String[] args) {
        Student_1 st = new Student_1("Oliver", 21);
        System.out.print(st.name);
        System.out.print(", "+ st.age);
    }
}
