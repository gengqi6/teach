package com.tt.teach.service.impl;

import com.tt.teach.dao.SubjectDao;
import com.tt.teach.pojo.Grade;
import com.tt.teach.pojo.Subject;
import com.tt.teach.service.SubjectService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectService{
    @Resource
    private SubjectDao subjectDao;

    @Override
    public List<Subject> getSubjectList() {
        return subjectDao.getSubjectList();
    }

    @Transactional
    public int deleteSubject(Integer subjectNo) {
        return subjectDao.deleteSubject(subjectNo);
    }

    @Transactional
    public int updateSubject(Subject subject) {
        return subjectDao.updateSubject(subject);
    }

    @Override
    public List<Grade> getGrade() {
        return subjectDao.getGrade();
    }

    @Transactional
    public int addSubject(Subject subject) {
        return subjectDao.addSubject(subject);
    }
}
