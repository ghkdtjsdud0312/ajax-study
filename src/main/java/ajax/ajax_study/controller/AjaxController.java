package ajax.ajax_study.controller;

import ajax.ajax_study.dto.AjaxDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AjaxController {

    @GetMapping("/ex01")
    public String ex01() {
        System.out.println("AjaxController.ex01");
        return "index"; // index.html에 작성된 내용이 출력됨
        }

    @PostMapping("/ex02")
    public @ResponseBody String ex02() {
        System.out.println("AjaxController.ex02");
        return "안녕하세요."; // 리턴 값이 그대로 출력됨
    }

    @GetMapping("/ex03")
    // 파라미터 매개 변수 넣어 주기
    public @ResponseBody String ex03(@RequestParam("param1") String param1,
                                     @RequestParam("param2") String param2) {
        System.out.println("param1 = " + param1 + ", param2 = " + param2);
        return "ex03 메서드 호출 완료";
    }

    @PostMapping("/ex04")
    public @ResponseBody String ex04(@RequestParam("param1") String param1,
                                     @RequestParam("param2") String param2) {
        System.out.println("param1 = " + param1 + ", param2 = " + param2);
        return "ex04 메서드 호출 완료";
    }

    @GetMapping("/ex05")
    // @ResponseBody 뒤 AjaxDTO를 리턴 타입으로 지정하기
    public @ResponseBody AjaxDTO ex05(@ModelAttribute AjaxDTO ajaxDTO) {
        System.out.println("ajaxDTO = " + ajaxDTO);
        return ajaxDTO; // html 파일에서 res 부분이 매개 값이 어떻게 보여지느냐를 확인 할 수 있다.
    }

    @PostMapping("/ex06")
    public @ResponseBody AjaxDTO ex06(@ModelAttribute AjaxDTO ajaxDTO) {
        System.out.println("ajaxDTO = " + ajaxDTO);
        return ajaxDTO;
    }

    @PostMapping("/ex07")
    // @ResponseBody : 응답을 어떻게 받을 수 있나
    // @RequestBody : 요청을 어떻게 받을 수 있나
    public @ResponseBody AjaxDTO ex07(@RequestBody AjaxDTO ajaxDTO) {
        System.out.println("ajaxDTO = " + ajaxDTO);
        return ajaxDTO;
    }

    private List<AjaxDTO> DTOList() {
        List<AjaxDTO> dtoList = new ArrayList<>();
        dtoList.add(new AjaxDTO("data1", "data11")); // dtoList
        dtoList.add(new AjaxDTO("data2", "data22")); // dtoList
        return dtoList;
    }

    @PostMapping("/ex08")
    // @ResponseBody : 응답을 어떻게 받을 수 있나
    // @RequestBody : 요청을 어떻게 받을 수 있나
    public @ResponseBody List<AjaxDTO> ex08(@RequestBody AjaxDTO ajaxDTO) {
        System.out.println("ajaxDTO = " + ajaxDTO);
        List<AjaxDTO> dtoList = DTOList();
        dtoList.add(ajaxDTO); // 3개의 객체 리스트가 들어 있는 DTOList
        return dtoList;
    }

    @PostMapping("/ex09")
    // @ResponseBody : 응답을 어떻게 받을 수 있나 / 데이터만 리턴을 준다 라는 의미
    // @RequestBody : 요청을 어떻게 받을 수 있나
    // ResponseEntity : body 정보뿐 아니라 헤더 부분에 대한 정보들, 스테이터스 코드(404,500 등) 메시지도 다 같이 줄 수 있다. responsebody보단 더 포괄적인 의미를 가짐
    public ResponseEntity ex09(@RequestBody AjaxDTO ajaxDTO) {
        System.out.println("ajaxDTO = " + ajaxDTO);
        return new ResponseEntity<>(HttpStatus.OK); // responseEntity를 여기서 선언한다. 여기서 데이터를 리턴하는 것이 아니라 스테이터스 코드만 리턴하는 경우만 리턴한다.
    }


}
