public class InstructorManager extends UserManager{

    public void add(User user){
        System.out.println(user.getId() + " Id'li eğitmen eklendi.");
    }

    public void delete(User user){
        System.out.println(user.getId() + " Id'li eğitmen silindi");
    }

    public void update(User user){
        System.out.println(user.getId() + " Id'li eğitmen güncellendi");
    }
}
