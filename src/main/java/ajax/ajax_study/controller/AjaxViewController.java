package ajax.ajax_study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AjaxViewController {

    // 1. get 요청하기
    @GetMapping("/ajax-ex-01")
    public String ajaxEx01() {
        return "ajax-ex-01";
    }

    // 2. post 요청하기
    @GetMapping("/ajax-ex-02")
    public String ajaxEx02() {
        return "ajax-ex-02";
    }

    // 3. get 요청 & parameter 전달하기
    @GetMapping("/ajax-ex-03")
    public String ajaxEx03() {
        return "ajax-ex-03";
    }

    // 4. post 요청 & parameter 전달하기
    @GetMapping("/ajax-ex-04")
    public String ajaxEx04() {
        return "ajax-ex-04";
    }

    // 5. get 요청 & parameter DTO 받기(@ModelAttribute) & DTO 객체 리턴 하기
    @GetMapping("/ajax-ex-05")
    public String ajaxEx05() {
        return "ajax-ex-05";
    }

    // 6. post 요청 & parameter DTO 받기(@ModelAttribute) & DTO 객체 리턴 하기
    @GetMapping("/ajax-ex-06")
    public String ajaxEx06() {
        return "ajax-ex-06";
    }

    // 7. post 요청 & parameter DTO 받기(@RequestBody) & DTO 객체 리턴 하기
    @GetMapping("/ajax-ex-07")
    public String ajaxEx07() {
        return "ajax-ex-07";
    }

    // 8. post 요청 & parameter 전달 하기 & List 객체 리턴 하기
    @GetMapping("/ajax-ex-08")
    public String ajaxEx08() {
        return "ajax-ex-08";
    }

    // 9. post 요청 & parameter 전달 하기 & ResponseEntity에 DTO 객체 리턴 하기
    @GetMapping("/ajax-ex-09")
    public String ajaxEx09() {
        return "ajax-ex-09";
    }

    // 9. post 요청 & parameter 전달 하기 & ResponseEntity에 List 객체 리턴 하기
    @GetMapping("/ajax-ex-10")
    public String ajaxEx10() {
        return "ajax-ex-10";
    }
}
