package Chapter2Labs;

public class OfferedCourse extends Course {
    // TODO: Declare private fields
    private String instructorName;
    private String location;
    private String classTime;
    
    /** 
     * @param instructor
     */
    // TODO: Define mutator methods -
    //      setInstructorName(), setLocation(), setClassTime()
     public void setInstructorName(String instructor) {
        instructorName = instructor;
     }
     
     public void setLocation(String classLocation) {
        location = classLocation;
     }

     public void setClassTime(String time) {
        classTime = time;
     }
 
    // TODO: Define accessor methods -
    //      getInstructorName(), getLocation(), getClassTime()
    public String getInstructorName() {
        return instructorName;
    }

    public String getLocation() {
        return location;
    }

    public String getClassTime() {
        return classTime;
    }
 }
