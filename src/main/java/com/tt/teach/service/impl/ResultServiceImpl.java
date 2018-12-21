package com.tt.teach.service.impl;

import com.tt.teach.dao.ResultDao;
import com.tt.teach.pojo.Result;
import com.tt.teach.pojo.Subject;
import com.tt.teach.service.ResultService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ResultServiceImpl implements ResultService{
    @Resource
     private ResultDao resultDao;

    @Override
    public List<Result> getResultList() {
        return resultDao.getResultList();
    }

    @Transactional
    public int deleteResult(Integer resultNo) {
        return resultDao.deleteResult(resultNo);
    }

    @Transactional
    public int updateResult(Result result) {
        return resultDao.updateResult(result);
    }

    @Transactional
    public int addResult(Result result) {
        return resultDao.addResult(result);
    }

    @Override
    public List<Subject> getSubject() {
        return resultDao.getSubject();
    }
}
