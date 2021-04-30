public class UserManager {

    public void add(User user){
        System.out.println(user.getId() + " Id'li kullanıcı eklendi.");
    }

    public void delete(User user){
        System.out.println(user.getId() + " Id'li kullanıcı silindi");
    }

    public void update(User user){
        System.out.println(user.getId() + " Id'li kullanıcı güncellendi");
    }


}
