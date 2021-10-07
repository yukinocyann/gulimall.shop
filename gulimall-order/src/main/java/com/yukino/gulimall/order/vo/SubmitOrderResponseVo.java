package com.yukino.gulimall.order.vo;

import com.yukino.gulimall.order.entity.OrderEntity;
import lombok.Data;

/**
 * @Description:
 * @author: yukino
 * @createTime: 2020-07-04 22:34
 **/

@Data
public class SubmitOrderResponseVo {

    private OrderEntity order;

    /** 错误状态码 **/
    private Integer code;


}
