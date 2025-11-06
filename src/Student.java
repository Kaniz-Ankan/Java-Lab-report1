public class Student {
    int id;
    String name;
    String email;
    double cgpa;
    String hometown;

    void display(){

        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Email: "+email);
        System.out.println("CGPA: "+cgpa);
        System.out.println("Home Town: "+hometown);
    }
    public static void main(String[] args ){
        Student s1 = new Student();
        s1.id=408;
        s1.name= "Kaniz Fatema Ankan";
        s1.email="ankankaniz@gmail.com";
        s1.cgpa= 3.94;
        s1.hometown="Bogra";

        Student s2 = new Student();
        s2.id= 404;
        s2.name="Karima khan";
        s2.email="karima@gmail.com";
        s2.cgpa=3.55;
        s2.hometown="Dhaka";

        s1.display();  // with methods

        System.out.println("ID: "+s2.id);   //without methods
        System.out.println("Name: "+s2.name);
        System.out.println("Email: "+s2.email);
        System.out.println("CGPA: "+s2.cgpa);
        System.out.println("Home Town: "+s2.hometown);

    }
}
