import java.util.Scanner;
class Student
{
    void display(String name,int age)
    {
        System.out.println(name);
        System.out.println(age);
    }
    public static void main(String args[])
    {
        Student s=new Student();
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        int age=sc.nextInt();
        s.display(name,age);
        s.display("AB",40);
    }
}