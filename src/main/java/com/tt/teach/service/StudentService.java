package com.tt.teach.service;

import com.tt.teach.pojo.Admins;
import com.tt.teach.pojo.Student;

import java.util.List;

public interface StudentService {
    Student doLogin(Student student);

    List<Student> getStudentList();

    int updateStudent(Student student);

    int deleteStudent(Integer stuNo);

    Admins doLoginadmins(Admins admins);

    Student getStuByNo(Integer studentNo);
}
