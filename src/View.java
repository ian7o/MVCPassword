import java.util.Scanner;

public class View {

//    private String userLogin;
//    private String pass;

    public String registerName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("screva o nome do usuário: ");
        return scanner.nextLine();
    }

    public String registerPass() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("escrava a pass: ");
        return scanner.nextLine();
    }

//    public String getuserLogin() {
//        return userLogin;
//    }
//
//    public String getPass() {
//        return pass;
//    }

    public void startVisual(String name, String pass) {
            System.out.println("passou o nome é " + name + " a pass é " + pass);
    }
}
