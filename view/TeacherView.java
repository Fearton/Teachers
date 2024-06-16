package view;

import java.util.List;

import model.Teacher;

public class TeacherView implements UserView<Teacher>{

    @Override
    public void sendOnConsole(List<Teacher> users) {
        System.out.println(users);
    }
    
}
