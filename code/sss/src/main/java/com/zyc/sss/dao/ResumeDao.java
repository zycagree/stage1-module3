package com.zyc.sss.dao;

import com.zyc.sss.pojo.Resume;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author zhangyongchao
 * @date 2020/5/15 23:33
 * @description
 */
public interface ResumeDao extends JpaRepository<Resume, Long> , JpaSpecificationExecutor<Resume> {
}
