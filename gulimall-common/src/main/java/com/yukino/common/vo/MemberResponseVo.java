package com.yukino.common.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description:
 * @author: yukino
 * @createTime: 2020-06-28 14:51
 **/

@ToString
@Data
public class MemberResponseVo implements Serializable {

    private static final long serialVersionUID = 5573669251256409786L;

    @JsonIgnoreProperties(ignoreUnknown = true)
    private Long id;
    /**
     * 会员等级id
     */
    @JsonIgnoreProperties(ignoreUnknown = true)
    private Long levelId;
    /**
     * 用户名
     */
    @JsonIgnoreProperties(ignoreUnknown = true)
    private String username;
    /**
     * 密码
     */
    @JsonIgnoreProperties(ignoreUnknown = true)
    private String password;
    /**
     * 昵称
     */
    @JsonIgnoreProperties(ignoreUnknown = true)
    private String nickname;
    /**
     * 手机号码
     */
    @JsonIgnoreProperties(ignoreUnknown = true)
    private String mobile;
    /**
     * 邮箱
     */
    @JsonIgnoreProperties(ignoreUnknown = true)
    private String email;
    /**
     * 头像
     */
    @JsonIgnoreProperties(ignoreUnknown = true)
    private String header;
    /**
     * 性别
     */
    @JsonIgnoreProperties(ignoreUnknown = true)
    private Integer gender;
    /**
     * 生日
     */
    @JsonIgnoreProperties(ignoreUnknown = true)
    private Date birth;
    /**
     * 所在城市
     */
    @JsonIgnoreProperties(ignoreUnknown = true)
    private String city;
    /**
     * 职业
     */
    @JsonIgnoreProperties(ignoreUnknown = true)
    private String job;
    /**
     * 个性签名
     */
    @JsonIgnoreProperties(ignoreUnknown = true)
    private String sign;
    /**
     * 用户来源
     */
    @JsonIgnoreProperties(ignoreUnknown = true)
    private Integer sourceType;
    /**
     * 积分
     */
    @JsonIgnoreProperties(ignoreUnknown = true)
    private Integer integration;
    /**
     * 成长值
     */
    @JsonIgnoreProperties(ignoreUnknown = true)
    private Integer growth;
    /**
     * 启用状态
     */
    @JsonIgnoreProperties(ignoreUnknown = true)
    private Integer status;
    /**
     * 注册时间
     */
    @JsonIgnoreProperties(ignoreUnknown = true)
    private Date createTime;

    /**
     * 社交登录UID
     */
    @JsonIgnoreProperties(ignoreUnknown = true)
    private String socialUid;

    /**
     * 社交登录TOKEN
     */
    @JsonIgnoreProperties(ignoreUnknown = true)
    private String accessToken;

    /**
     * 社交登录过期时间
     */
    @JsonIgnoreProperties(ignoreUnknown = true)
    private long expiresIn;

}
