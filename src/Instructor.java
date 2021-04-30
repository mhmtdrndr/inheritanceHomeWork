public class Instructor extends User{

    private String instructorCV;


    public void Instructor(){

    }

    public void Instructor(String instructorCV){

        this.setInstructorCV(instructorCV);

    }


    public String getInstructorCV() {
        return instructorCV;
    }

    public void setInstructorCV(String instructorCV) {
        this.instructorCV = instructorCV;
    }

    public void showInstructorInfo(){
        System.out.println("Eğitmen Id : " + getId());
        System.out.println("Eğitimen Adı : " + getFirstName());
        System.out.println("Eğitimen Soyadı : " + getLastName());
        System.out.println("Eğitmen E-Mail : " + getEmail());
        System.out.println("Eğitmen Bilgisi : " + getInstructorCV());
    }
}
