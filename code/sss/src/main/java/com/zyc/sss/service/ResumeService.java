package com.zyc.sss.service;

import com.zyc.sss.pojo.Resume;

import java.util.List;

/**
 * @author zhangyongchao
 * @date 2020/5/16 16:24
 * @description
 */
public interface ResumeService {

    List<Resume>  findAll();

    Resume findById(Long id);

    void insert(Resume resume);

    void update(Resume resume);

    void deleteById(Long id);
}
