package service;

import java.util.Collections;
import java.util.List;

import model.Teacher;
import model.TeacherGroup;

public class TeacherGroupService {
    private TeacherGroup teacherGroup;

    public TeacherGroupService(TeacherGroup teacherGroup) {
        this.teacherGroup = teacherGroup;
    }

    public void addTeacher(Teacher teacher) {
        teacherGroup.teachers.add(teacher);
    }

    public List<Teacher> sort() {
        Collections.sort(teacherGroup.teachers);
        return teacherGroup.teachers;
    }
}
