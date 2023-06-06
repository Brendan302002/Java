package Chapter2Labs;

public class Course{
    // TODO: Declare private fields
    private String courseNum;
    private String courseTitle;

    // TODO: Define mutator methods - 
    //       setCourseNumber(), setCourseTitle()
    public void setCourseNumber(String course) {
        courseNum = course;
    }

    public void setCourseTitle(String title) {
        courseTitle = title;

    }
 
    // TODO: Define accessor methods - 
    //       getCourseNumber(), getCourseTitle()
    public String getCourseNumber() {
        return courseNum; 
    } 
    
    public String getCourseTitle() {
        return courseTitle;
    }
    // TODO: Define printInfo()

    public void printInfo() {
        System.out.println("Course Information: ");
        System.out.println("   Course Number: " + courseNum);
        System.out.println("   Course Title: " + courseTitle);
        


       
    }
  
 }
 