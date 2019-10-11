package com.example.resource.controller;

import lombok.Builder;
import lombok.Data;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: oauth->UserController
 * @description:
 * @author: 夏磊
 * @create: 2019-10-11 15:20
 **/
@RestController
@RequestMapping("/oauth/api")
public class UserController {

  @RequestMapping("user")
  public UserDto user() {
    return UserDto.builder()
        .username("xialei")
        .age(18)
        .build();
  }
}

@Builder
@Data
class UserDto {

  private String username;

  private Integer age;
}