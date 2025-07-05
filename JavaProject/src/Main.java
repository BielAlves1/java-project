import model.User;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        User user =  new User("Nano", "nano@gmail.com", "senhaenha", "Admin");

        System.out.println(user);

        System.out.println(user.getUserName());
        System.out.println("Senha atual: "+user.getPassword());
        user.updatePassword("senha123");
        System.out.println("Senha atualizada: "+ user.getPassword());
    }
}