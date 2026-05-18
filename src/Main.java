import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        Login login = new Login();

        System.out.println(
                "===== Login =====");

        System.out.print(
                "Username: ");

        String user =
                sc.next();

        System.out.print(
                "Password: ");

        String pass =
                sc.next();

        if (!login.authenticate(
                user,
                pass))

        {

            System.out.println(
                    "Invalid Login");

            System.exit(0);

        }

        System.out.println(
                "Login Successful");

        ArrayList<Student> students =
                new ArrayList<>();


        // Load data automatically

        try {

            File file =
                    new File(
                            "../data/students.txt");

            Scanner fileReader =
                    new Scanner(file);

            while (
                    fileReader.hasNextLine()) {

                String line =
                        fileReader.nextLine();

                String data[] =
                        line.split(",");

                int id =
                        Integer.parseInt(
                                data[0]);

                String name =
                        data[1];

                String course =
                        data[2];

                int attendance =
                        Integer.parseInt(
                                data[3]);

                double marks =
                        Double.parseDouble(
                                data[4]);

                students.add(

                        new Student(
                                id,
                                name,
                                course,
                                attendance,
                                marks)

                );

            }

            fileReader.close();

        }

        catch(Exception e){

            System.out.println(
                    "No previous data found");

        }


        while(true){

            System.out.println(
                    "\n===== Smart E-Learning =====");

            System.out.println(
                    "1.Add Student");

            System.out.println(
                    "2.Display Students");

            System.out.println(
                    "3.Update Attendance");

            System.out.println(
                    "4.Update Marks");

            System.out.println(
                    "5.Generate Report");

            System.out.println(
                    "6.Search by Course");

            System.out.println(
                    "7.Save Data");

            System.out.println(
                    "8.Exit");

            System.out.print(
                    "Enter choice: ");

            int choice =
                    sc.nextInt();

            switch(choice){

                case 1:

                    System.out.print(
                            "Enter ID: ");

                    int id =
                            sc.nextInt();

                    sc.nextLine();

                    System.out.print(
                            "Enter Name: ");

                    String name =
                            sc.nextLine();

                    System.out.print(
                            "Enter Course: ");

                    String course =
                            sc.nextLine();

                    students.add(

                            new Student(
                                    id,
                                    name,
                                    course)

                    );

                    System.out.println(
                            "Student Added");

                    break;


                case 2:

                    if(students.isEmpty()){

                        System.out.println(
                                "No Students");

                    }

                    else{

                        for(Student s:
                                students){

                            s.display();

                            System.out.println(
                                    "-------------");

                        }

                    }

                    break;


                case 3:

                    System.out.print(
                            "Student ID: ");

                    int aid =
                            sc.nextInt();

                    System.out.print(
                            "Attendance: ");

                    int att =
                            sc.nextInt();

                    for(Student s:
                            students){

                        if(s.id==aid){

                            s.setAttendance(
                                    att);

                        }

                    }

                    break;


                case 4:

                    System.out.print(
                            "Student ID: ");

                    int mid =
                            sc.nextInt();

                    System.out.print(
                            "Marks: ");

                    double m =
                            sc.nextDouble();

                    for(Student s:
                            students){

                        if(s.id==mid){

                            s.setMarks(
                                    m);

                        }

                    }

                    break;


                case 5:

                    System.out.print(
                            "Enter Student ID: ");

                    int rid =
                            sc.nextInt();

                    for(Student s:
                            students){

                        if(s.id==rid){

                            s.reportCard();

                        }

                    }

                    break;


                case 6:

                    sc.nextLine();

                    System.out.print(
                            "Enter Course: ");

                    String searchCourse =
                            sc.nextLine();

                    for(Student s:
                            students){

                        if(
                                s.course.equalsIgnoreCase(
                                        searchCourse))

                        {

                            s.display();

                            System.out.println(
                                    "------------");

                        }

                    }

                    break;


                case 7:

                    try{

                        FileWriter fw =
                                new FileWriter(
                                        "../data/students.txt");

                        for(Student s:
                                students){

                            fw.write(
                                    s.saveFormat()
                                            +"\n");

                        }

                        fw.close();

                        System.out.println(
                                "Data Saved");

                    }

                    catch(Exception e){

                        System.out.println(
                                e);

                    }

                    break;


                case 8:

                    System.out.println(
                            "Exiting...");

                    System.exit(0);


                default:

                    System.out.println(
                            "Invalid Choice");

            }

        }

    }

}