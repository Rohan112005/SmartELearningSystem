class Course{

    String courseName;

    String instructor;

    public Course(
            String courseName,
            String instructor){

        this.courseName=
                courseName;

        this.instructor=
                instructor;

    }

    public void display(){

        System.out.println(
        "Course: "+
        courseName);

        System.out.println(
        "Instructor: "+
        instructor);

    }

}