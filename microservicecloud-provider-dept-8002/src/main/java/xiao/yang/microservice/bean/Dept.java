package xiao.yang.microservice.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class Dept {
    private Integer id;
    private String name;
    private String source;
}

