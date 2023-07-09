import java.util.Scanner;

public class GPAApp {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your name: ");// ادخال اسم الطالب
    String name = input.nextLine();
    System.out.print("Enter your university ID: ");// ادخال رقم الجامعة للطالب
    int id = input.nextInt();
    Student st = new Student(name, id);// إنشاء كائن الطالب
    System.out.println("Hello, " + st.getName() + "!");// طباعة رسالة ترحيبية

    System.out.print("Enter the number of courses you have:");  // إدخال عدد  المواد
    int numCourses = input.nextInt();
    st.setNumCourses(numCourses);
    double total = 0;
    double totalGPA = 0;
    for(int i = 0; i < numCourses; i++) {

        System.out.print("Enter the grade for course from 0 : 100 => " + (i+1) + ": ");  // إدخال درجة المادة
             double grade = input.nextDouble();
        if (grade<= 100 ){
             st.setGrade(i, grade);
             total += grade;
        }
        else{
            System.out.println("Wrong grade");
            break;
        }

        double gpa = 0;
        if(grade >= 97) {
            gpa = 4.0;
        } else if(grade >= 93) {
            gpa = 4.0;
        } else if(grade >= 90) {
            gpa = 3.7;
        } else if(grade >= 87) {
           gpa = 3.3;
        } else if(grade >= 83) {
            gpa = 3.0;
        } else if(grade >= 80) {
            gpa = 2.7;
        } else if(grade >= 77) {
            gpa = 2.3;
        } else if(grade >= 73) {
            gpa = 2.0;
        } else if(grade >= 70) {
            gpa = 1.7;
        } else if(grade >= 67) {
            gpa = 1.3;
        } else if(grade >= 65) {
            gpa = 1.0;
        }
        System.out.println("GPA for course " + (i+1) + ": " + gpa);
        totalGPA += gpa;
    }
        // حساب المتوسط التراكمي GPA

double overallGPA = totalGPA / numCourses;
System.out.println("Your Total GPA is " + overallGPA);


}
}