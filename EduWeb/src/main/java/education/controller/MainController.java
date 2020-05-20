package education.controller;

import education.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/MainController")
public class MainController {
    @RequestMapping("/login")
    public String login(Student student){
        if(student.getStuId()==123&&student.getStuPassword().equals("666")){
            return "success";
        }else {
            return "failure";
        }
    }
}
