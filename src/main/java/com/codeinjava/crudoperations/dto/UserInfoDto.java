package com.codeinjava.crudoperations.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfoDto {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;

}
