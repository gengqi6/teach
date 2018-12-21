package com.tt.teach.service.impl;

import com.tt.teach.dao.StudentDao;
import com.tt.teach.pojo.Admins;
import com.tt.teach.pojo.Student;
import com.tt.teach.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    @Resource
    private StudentDao studentDao;

    @Override
    public Student doLogin(Student student) {
        return studentDao.doLogin(student);
    }

    @Override
    public List<Student> getStudentList() {
        return studentDao.getStudentList();
    }

    @Transactional
    public int updateStudent(Student student) {
        return studentDao.updateStudent(student);
    }

    @Transactional
    public int deleteStudent(Integer stuNo) {
        return studentDao.deleteStudent(stuNo);
    }

    //admin登录
    public Admins doLoginadmins(Admins admins) {
        return studentDao.doLoginadmins(admins);
    }

    @Override
    public Student getStuByNo(Integer studentNo) {
        return studentDao.getStuByNo(studentNo);
    }
}
