public class StudentManager extends  UserManager{

    public void add(User user){
        System.out.println(user.getId() + " Id'li öğrenci eklendi.");
    }

    public void delete(User user){
        System.out.println(user.getId() + " Id'li öğrenci silindi");
    }

    public void update(User user){
        System.out.println(user.getId() + " Id'li öğrenci güncellendi");
    }
}
