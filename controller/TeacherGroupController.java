package controller;

import model.Teacher;
import service.TeacherGroupService;

public class TeacherGroupController {
    private TeacherGroupService service;

    public TeacherGroupController(TeacherGroupService service) {
        this.service = service;
    }
    
    public void addTeacher(Teacher teacher) {
        service.addTeacher(teacher);
    }
}
