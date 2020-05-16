package com.zyc.sss.service;

import com.zyc.sss.dao.ResumeDao;
import com.zyc.sss.pojo.Resume;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author zhangyongchao
 * @date 2020/5/16 16:24
 * @description
 */
@Service
public class ResumeServiceImpl implements ResumeService {

    @Autowired
    private ResumeDao resumeDao;

    @Override
    public List<Resume> findAll() {
        return resumeDao.findAll();
    }

    @Override
    public Resume findById(Long id) {
        Optional<Resume> resume = resumeDao.findById(id);
        return resume.get();
    }

    @Override
    public void insert(Resume resume) {
        resumeDao.save(resume);
    }

    @Override
    public void update(Resume resume) {
        resumeDao.save(resume);
    }

    @Override
    public void deleteById(Long id) {
        resumeDao.deleteById(id);
    }
}
