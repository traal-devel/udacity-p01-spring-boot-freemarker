package ch.traal.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.traal.demo.model.Student;

@Controller
public class StudentListController {

  /* methods */

  @RequestMapping("/list")
  public String list(Model model) {
    List<Student> list = new ArrayList<>();
    
    list.add(new Student(1, "Tom", 80.5));
    list.add(new Student(2, "Jerry", 90.4));  
    list.add(new Student(3, "Paul", 77.5));
    model.addAttribute("list", list);
    
    return "list";
  }
}
