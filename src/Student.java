class Student extends Person{

    String course;

    int attendance;

    double marks;

    public Student(
            int id,
            String name,
            String course){

        super(id,name);

        this.course=course;

        attendance=0;

        marks=0;
    }

    public void setAttendance(
            int attendance){

        this.attendance=
                attendance;
    }

    public void setMarks(
            double marks){

        this.marks=
                marks;
    }

    public double calculateGPA(){

        return marks/10;

    }

    @Override

    public void display(){

        super.display();

        System.out.println(
        "Course: "+course);

        System.out.println(
        "Attendance: "
        +attendance+"%");

        System.out.println(
        "Marks: "+marks);

        System.out.println(
        "GPA: "+
        calculateGPA());

    }
    public Student(
        int id,
        String name,
        String course,
        int attendance,
        double marks){

    super(id,name);

    this.course=course;

    this.attendance=attendance;

    this.marks=marks;

}

    public String saveFormat(){

        return id+","
                +name+","
                +course+","
                +attendance+","
                +marks;
    }
    public void reportCard(){

System.out.println(
"\n===== Report Card =====");

System.out.println(
"ID: "+id);

System.out.println(
"Name: "+name);

System.out.println(
"Course: "+course);

System.out.println(
"Attendance: "
+attendance+"%");

System.out.println(
"Marks: "+marks);

System.out.println(
"GPA: "+
calculateGPA());

}

}