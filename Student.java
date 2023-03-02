
public class Student {
    private String name;
    private int age;
    private Double gpa;
    private String email;
    private int qualification;


    public void getStudentDetails(){
        System.out.println(name + '\n'+ age +'\n'+ email+ '\n'+gpa+ '\n'+qualification +'\n');
    }
    public void setDetails(String name, int age,Double gpa, String email, int qualification) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.qualification=qualification;
        this.gpa = gpa;
    }

}
