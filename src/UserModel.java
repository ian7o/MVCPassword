import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UserModel {
    private String name ;
    private String pass;

    public UserModel(String name, String pass) {
        this.name = name;
        this.pass = pass;
    }

    private List<UserModel> userModelList = new ArrayList<>();

    public List<UserModel> getUserList() {
        return userModelList;
    }

    @Override
    public String toString() {
        return " a lista tem o nome " + name + " a lista tem a senha " + pass;
    }

    public UserModel() {
        add();
    }

    public void add(){
        userModelList.add(new UserModel("zee","123"));
        userModelList.add(new UserModel("pedro","pedrin"));
//        userModelList.add(new UserModel(name,pass));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserModel userModel = (UserModel) o;
        return Objects.equals(name, userModel.name) && Objects.equals(pass, userModel.pass) && Objects.equals(userModelList, userModel.userModelList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, pass, userModelList);
    }

    public String getName() {
        return name;
    }

    public String getPass() {
        return pass;
    }
}
