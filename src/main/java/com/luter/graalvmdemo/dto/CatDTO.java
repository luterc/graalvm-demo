package com.luter.graalvmdemo.dto;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public class CatDTO implements Serializable {
    private String id;
    private String name;
    private Integer age;
}
