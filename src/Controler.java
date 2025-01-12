public class Controler {
    private UserModel userModel = new UserModel();
    private View view = new View();

    public String getViewUser() {
        return view.registerName();
    }

    public String getViewPass() {
        return view.registerPass();
    }


    public void compare() {
        UserModel userModel1 = new UserModel(getViewUser(), getViewPass());

        if (userModel.getUserList().contains(userModel1)){
            System.out.println("está na lista");
            configureView();
        }
        else {
            System.out.println("não contem tente de novo");
        }
    }

    public void configureView() {
        view.startVisual(getViewUser(), getViewPass());
    }
}