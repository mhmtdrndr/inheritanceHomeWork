public class Main {

    public static void main(String[] args) {

            //Eğitmen nesnesi oluşturduk.
        Instructor instructor = new Instructor();
        instructor.setId(1);
        instructor.setFirstName("Engin");
        instructor.setLastName("Demiroğ");
        instructor.setEmail("engindemirog@gmail.com");
        instructor.setInstructorCV("Java & C# Eğitmeni");
            //Eğitmen nesnesini kaydettik, sildik ve güncelledik
        UserManager userManager = new InstructorManager();
        userManager.add(instructor);
        userManager.delete(instructor);
        userManager.update(instructor);
            //Eğitmen özet bilgisi görüntüleme
        instructor.showInstructorInfo();

            //Öğrenci nesnesi oluşturduk.
        Student student = new Student();
        student.setId(2);
        student.setFirstName("Gürkan");
        student.setLastName("Derindere");
        student.setAddress("Ankara");
        student.setEmail("gurkan@gurkan.com.tr");
        student.setSchool("Ortadoğu Teknik Üniversitesi");
            //Öğrenci nesnesini kaydettik, sildik ve güncelledik
        UserManager userManager1 = new StudentManager();
        userManager1.add(student);
        userManager1.delete(student);
        userManager1.update(student);
            //Öğrenci özet bilgisi görüntüleme
        student.showStudentInfo();

    }
}
