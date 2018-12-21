package com.tt.teach.controller;

import com.tt.teach.pojo.Admins;
import com.tt.teach.pojo.Student;
import com.tt.teach.service.StudentService;
import com.tt.teach.utils.BaseController;
import com.tt.teach.utils.JsonResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/stu")
public class StudentController extends BaseController{
    @Resource
    private StudentService studentService;

    //请求：http://localhost:8080/stu/login
    @RequestMapping("/login")
    public String login(){
        return "/student/login";
    }

    //请求：http://localhost:8080/stu/index
    @RequestMapping("/index")
    public String index(){
        /*String studentName = (String) getSession().getAttribute(SESSION_KEY);
        if(studentName!=null){
            return "/student/index";
        }
        return REDIRECT+"/stu/login";*/
        String adminName = (String) getSession().getAttribute("adminName");
        if(adminName!=null){
            return "/student/index";
        }
        return REDIRECT+"/stu/login";
    }

    //请求：http://localhost:8080/stu/student
    @RequestMapping("/student")
    public String student(){
        return "/student/student";
    }

    //请求：http://localhost:8080/stu/doLogin
    @RequestMapping(value = "/doLogin",method = RequestMethod.POST)
    public String doLogin(){
        /*String xuehao = getRequest().getParameter("studentNo");
        Integer studentNo = Integer.parseInt(xuehao);
        String loginPwd = getRequest().getParameter("loginPwd");
        Student student = new Student();
        student.setLoginPwd(loginPwd);
        student.setStudentNo(studentNo);
        Student student1 = studentService.doLogin(student);
        if(student!=null){
            getSession().setAttribute(SESSION_KEY,student1.getStudentName());
            return FORWARD+"/stu/index";
        }
        return REDIRECT+"/stu/login";*/
        String bianhao = getRequest().getParameter("adminNo");
        Integer adminNo = Integer.parseInt(bianhao);
        String loginPwd = getRequest().getParameter("loginPwd");
        Admins admins = new Admins();
        admins.setAdminNo(adminNo);
        admins.setLoginPwd(loginPwd);
        Admins admins1 =  studentService.doLoginadmins(admins);

        if(admins1!=null){
            getSession().setAttribute("adminName",admins1.getAdminName());
            return FORWARD+"/stu/index";
        }
        return REDIRECT+"/stu/login";
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        /*session.removeAttribute(SESSION_KEY);
        return REDIRECT+"/stu/login";*/
        session.removeAttribute("adminName");
        return REDIRECT+"/stu/login";
    }

    @RequestMapping(value = "/getStudentList",method = RequestMethod.GET)
    @ResponseBody
    public Object getStudentList() {
        List<Student> list = studentService.getStudentList();
        return list;
    }

    @RequestMapping(value = "/deleteStudent/{stuNo}",method = RequestMethod.DELETE)
    @ResponseBody
    public Object deleteStudent(@PathVariable Integer stuNo){
        int result = studentService.deleteStudent(stuNo);
        if(result>0){
            return JsonResult.ok("删除成功",result);
        }
        return JsonResult.no("删除失败",result);
    }

    @RequestMapping(value = "/updateStudent",method = RequestMethod.POST)
    public String updateStudent() {
        String xuehao = getRequest().getParameter("stuNo");
        Integer stuNo = Integer.parseInt(xuehao);
        String stuName = getRequest().getParameter("stuName");
        String stuPwd = getRequest().getParameter("stuPwd");
        String stuPhone = getRequest().getParameter("stuPhone");
        Student student = new Student();
        student.setStudentNo(stuNo);
        student.setStudentName(stuName);
        student.setLoginPwd(stuPwd);
        student.setPhone(stuPhone);
        int result = studentService.updateStudent(student);
        if(result>0){
            return FORWARD+"/stu/student";
        }
        return FORWARD+"stu/student";
    }

    @RequestMapping(value = "/getStuByNo/{studentNo}",method = RequestMethod.GET)
    @ResponseBody
    public Object getStuByNo(@PathVariable Integer studentNo){
        Student student = studentService.getStuByNo(studentNo);
        if(student!=null){
            return JsonResult.ok("有该学生",student);
        }
        return JsonResult.no("没有该学生",student);
    }


}
