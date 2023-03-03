
public class CourseCatalog {
    //create one string array to store course details
    String selectedCourse;
    public void setCourseDetails(int courseNumber){

        // Scanner scan = new Scanner(System.in);
        

        //create variables for course name, course code, available seats
        System.out.println("Course selected: " + courseNumber);

        //create a Switch case for each available course
        switch (courseNumber){
            case 15432:
                selectedCourse = "Computer Science";
                System.out.println(selectedCourse);
                break;
            case 15424:
                selectedCourse = "Electrical Engineering";
                System.out.println(selectedCourse);
                break;
            case 15515:
                selectedCourse = "Mechanical Engineering";
                System.out.println(selectedCourse);
                break;
            default:
            selectedCourse = "NULL";
                System.out.println("Invalid Course");
        }



    }
    // public String enrollCourse(){
    //     return selectedCourse;
    // }

}
