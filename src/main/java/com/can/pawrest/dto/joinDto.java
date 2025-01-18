package com.can.pawrest.dto;


import jakarta.persistence.Column;
import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class joinDto {

    @NotBlank(message = "아이디는 필수 입력값입니다.")
//    @Pattern(regexp = "^[a-z0-9]{4,20}$", message = "아이디는 영문 소문자와 숫자 4~12자리여야 합니다.")
    private String userId;

    @NotBlank(message = "닉네임은 필수 입력값입니다.")
//    @Pattern(regexp = "^[가-힣a-zA-Z0-9]{2,10}$" , message = "닉네임은 특수문자를 포함하지 않은 2~10자리여야 합니다.")
    private String username;


    @NotBlank(message = "비밀번호는 필수 입력값입니다.")
//    @Pattern(regexp="(?=.*[0-9])(?=.*[a-zA-Z])(?=.*\\W)(?=\\S+$).{8,20}",
//            message = "비밀번호는 영문 대,소문자와 숫자, 특수기호가 적어도 1개 이상씩 포함된 8자 ~ 20자의 비밀번호여야 합니다.")
    private String password;


    @NotBlank(message = "비밀번호 재입력은 필수 입력값입니다.")
    private String confirmPassword;

    @NotBlank(message = "전화번호는 필수 입력값입니다.")
    private String phoneNumber;

    @AssertTrue(message = "비밀번호와 비밀번호 재입력이 일치해야 합니다.")
    public boolean isPasswordMatch() {
        return password.equals(confirmPassword);
    }


}


