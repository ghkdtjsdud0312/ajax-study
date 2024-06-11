package ajax.ajax_study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AjaxController {

    @GetMapping("/ajax-ex-01")
    public String ex01() {
        System.out.println("AjaxController.ex01");
        return "ajax-ex-01";
        }
    @PostMapping("/ajax-ex-02")
    public String ex02() {
        System.out.println("AjaxController.ex02");
        return "ajax-ex-02";
    }
}
