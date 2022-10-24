package practiki.prac_6;

public class Student implements Comparable<Student>{
    private String name;
    private double grade;
    public Student(String name, double grade){
        this.name = name;
        this.grade = grade;
    }

    public String getName() {return name;}
    public double getGrade() {return grade;}
    public void getInfo() {
        System.out.println(name+' '+grade);}

    @Override
    public int compareTo(Student o) {
        if(grade < o.getGrade()) return 1;
        if(grade > o.getGrade()) return -1;
        return 0;
    }
}
