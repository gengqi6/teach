package com.tt.teach.controller;

import com.tt.teach.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/stu")
public class StudentController {
    @Resource
    private StudentService studentService;
}
