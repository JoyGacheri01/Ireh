class Course{
    //private attribute
    private String CourseName;
    private String  CourseUnit;
    private String Student;

    //Getter and setter methods are used to provide access and modify the private attribute
    public String getCourseName(){
        return CourseName;
    }
    public void  setCourseName(String CourseName){
        this.CourseName = CourseName;
    }
    public  String getCourseUnit(){
        return  CourseUnit;
    }
    public void setCourseUnit(String CourseUnit){
        this.CourseUnit = CourseUnit;
    }
    public   String getStudent(){
        return Student;
    }
    public  void  setStudent(String Student){
        this.Student = Student;
    }
    public  void displayCourse(){
        System.out.println("Course Name: " + CourseName);
        System.out.println("The course Unit is:" + CourseUnit);
        System.out.println("Student name is:" + Student);
    }

}


public  static void main(String[] args) {
    Course course = new Course();
    course.setCourseName("Mathematics");
    course.setCourseUnit("MATH101");
    course.setStudent("Christine");
    course.displayCourse();
}  
               
