package com.tt.teach.service;

import com.tt.teach.pojo.Result;
import com.tt.teach.pojo.Subject;

import java.util.List;

public interface ResultService {
    List<Result> getResultList();

    int deleteResult(Integer resultNo);

    int updateResult(Result result);

    int addResult(Result result);

    List<Subject> getSubject();
}
