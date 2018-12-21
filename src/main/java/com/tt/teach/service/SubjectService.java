package com.tt.teach.service;

import com.tt.teach.pojo.Grade;
import com.tt.teach.pojo.Subject;

import java.util.List;

public interface SubjectService {
    List<Subject> getSubjectList();

    int deleteSubject(Integer subjectNo);

    int updateSubject(Subject subject);

    List<Grade> getGrade();

    int addSubject(Subject subject);
}
