package com.zyc.sss.controller;

import com.zyc.sss.dao.ResumeDao;
import com.zyc.sss.pojo.Resume;
import com.zyc.sss.service.ResumeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Optional;

/**
 * @author zhangyongchao
 * @date 2020/5/16 10:50
 * @description
 */
@Controller
public class ResumeController {

    @Autowired
    private ResumeServiceImpl resumeService;

    @RequestMapping("/list")
    public ModelAndView queryAll(){
        List<Resume> allResumes = resumeService.findAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("allResumes", allResumes);
        modelAndView.setViewName("list");
        return modelAndView;
    }

    @RequestMapping("/add")
    public ModelAndView add(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("add");
        return  modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(Resume resume){
        resumeService.insert(resume);
        return "redirect:list";
    }

    @RequestMapping("findById")
    public ModelAndView findById(Long id){
        Resume resume = resumeService.findById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("edit");
        modelAndView.addObject("resume", resume);
        return modelAndView;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(Resume resume){
        resumeService.update(resume);
        return "redirect:list";
    }

    @RequestMapping("delete")
    public String deleteById(Long id){
        resumeService.deleteById(id);
        return "redirect:list";
    }

}
