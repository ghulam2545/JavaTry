package com.ghulam.dto;

import com.ghulam.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class EmpReqDto {
    private String empName;
    private Gender gender;
    private String address;
    private String email;
    private String mobNo;
}
