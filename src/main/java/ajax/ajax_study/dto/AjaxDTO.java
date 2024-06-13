package ajax.ajax_study.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class AjaxDTO {
    private String param1;
    private String param2;

    // 기본 생성자 추가
    public AjaxDTO() {
    }
}
