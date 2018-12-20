package com.tt.teach.service.impl;

import com.tt.teach.dao.ResultDao;
import com.tt.teach.pojo.Result;
import com.tt.teach.service.ResultService;
import org.springframework.stereotype.Service;

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
}
