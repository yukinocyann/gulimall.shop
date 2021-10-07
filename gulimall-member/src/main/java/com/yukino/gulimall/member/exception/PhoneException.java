package com.yukino.gulimall.member.exception;

/**
 * @Description:
 * @author: yukino
 * @createTime: 2020-06-27 16:04
 **/
public class PhoneException extends RuntimeException {

    public PhoneException() {
        super("存在相同的手机号");
    }
}
