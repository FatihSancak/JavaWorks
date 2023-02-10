package src.QuestionAnswer;

public class Student_2 {
    String name;
    String phone;
    int age;

    Student_2(){

    }

    Student_2(String name, int age,String phone) {
        this.name = name;
        this.phone = phone;
    }

    public static void main(String[] args) {
        Student_2 st1 = new Student_2();
        Student_2 st2 = new Student_2("Jhon",25,"029-998877");
        System.out.println(st2.name+", "+st2.age +", "+ st2.phone);
    }
}
