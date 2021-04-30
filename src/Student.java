public class Student extends User{

    private String school;
    private String address;

    public void Student(){

    }

    public void Student(String school, String address){
        this.setSchool(school);
        this.setAddress(address);
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void showStudentInfo(){
        System.out.println("Öğrenci Id : " + getId());
        System.out.println("Öğrenci Adı : " + getFirstName());
        System.out.println("Öğrenci Soyadı : " + getLastName());
        System.out.println("Öğrenci E-Mail : " + getEmail());
        System.out.println("Öğrenci Adresi : " + getAddress());
        System.out.println("Öğrenci Okulu : " + getSchool());
    }
}
