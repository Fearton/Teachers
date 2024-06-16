package controller;

import java.util.List;

import model.Teacher;
import model.User;
import view.TeacherView;
import view.UserView;

public class TeacherConteroller implements UserController {

    private UserView<Teacher> view = new TeacherView();

    @Override
    public <T extends User> User create(T user) {
        return user;
    }
    
    public void sendOnConsole(List<Teacher> teachers) {
        view.sendOnConsole(teachers);
    }
}
