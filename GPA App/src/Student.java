public class Student {
    private String name; // اسم الطالب
    private int id; // رقم الجامعة
    private int numCourses; // عدد المواد
    private double[] grades; // درجات المواد
    
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    public String getName() { 
        return name;
    }
    
    public int getId() { 
        return id;
    }
    
    public void setNumCourses(int numCourses) { // تعيين عدد المواد
        this.numCourses = numCourses;
        grades = new double[numCourses];
    }
    
    public void setGrade(int index, double grade) { 
        grades[index] = grade;
    }
    
    public double[] getGrades() { // الحصول على درجات المواد
        return grades;
    }
    
    public double getGPA() { // حساب المتوسط التراكمي للطالب
        double total = 0;
        for(int i = 0; i < numCourses; i++) {
            total += grades[i];
        }
        double gpa = total / numCourses;
        return gpa;
    }
}

