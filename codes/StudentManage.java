import java.util.ArrayList;
import java.util.Scanner;


class Student{
    Scanner scn = new Scanner(System.in);

    private String id;
    private String phone;
    private String nam;
    private String gender;
    private String email;
    private String course;
    private String lang;

    
    public Student(){
        System.out.println("OBJECT CREATED");
        
    }
    public Student(String id, String phone, String nam, String gender, String email, String course, String lang){
        this.id = id;
        this.phone = phone;
        this.nam = nam;
        this.gender = gender;
        this.email = email;
        this.course = course;
        this.lang = lang;
    }
    public void setter(){
        System.out.println("Enter ID of student: ");
        this.id = scn.nextLine();

        System.out.println("Enter Name of student: ");
        this.nam = scn.nextLine();

        System.out.println("Enter Phone of student: ");
        this.phone = scn.nextLine();

        System.out.println("Enter Gender of student: ");
        this.gender = scn.nextLine();

        System.out.println("Enter Email of student: ");
        this.email = scn.nextLine();

        System.out.println("Enter Course of student: ");
        this.course = scn.nextLine();   
        
        System.out.println("Enter P Language of student: ");
        this.lang = scn.nextLine();
    }
    
    public String getter(){
        return id;
    }
    
    public String getPhone(){
        return phone;
    }
    
    public String getName(){
        return nam;
    }

    public String getGender(){
        return gender;
    }

    public String getEmail(){
        return email;
    }

    public String getCourse(){
        return course;
    }

    public String getLang(){
        return lang;
    }

    
    public void displayStudentInfo(){
        System.out.println("==================================================");
        System.out.println();
        System.out.println("NAME "+ nam);
        System.out.println("ID "+ id);
        System.out.println("PHONE "+phone );
        System.out.println("GENDER "+ gender);
        System.out.println("EMAIL "+ email);
        System.out.println("COURSE "+ course);
        System.out.println("LANGUAGE "+ lang);
        System.out.println();
        System.out.println("==================================================");
    }
}
public class StudentManage {  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<>();
        int choice;
        do{
            
            System.out.println("===========================================================");
            System.out.println();
            System.out.println("Enter your choice");
            System.out.println("1. Regester");
            System.out.println("2. View");  
            System.out.println("3. Exit");
            System.out.println();
            System.out.println("===========================================================");
            System.out.println();
            System.out.println("YOUR CHOICE: ");
            choice = scanner.nextInt();

            
            switch (choice) {
                case 1:
                    Student s = new Student();
                    s.setter();
                    studentList.add(s);
                    System.out.println("Student Registerd Succesfully");              
                    break;
                case 2:
                    System.out.println("Registerd Students");
                    for(Student st : studentList ){
                        st.displayStudentInfo();
                    }
                    break;
                case 3:
                    System.out.println("Exited");
                    break;
            
                default:
                    System.out.println("Invalid Choice");
                    break;
            }

        }while (choice!=3);
        scanner.close();
                      
    }
}
