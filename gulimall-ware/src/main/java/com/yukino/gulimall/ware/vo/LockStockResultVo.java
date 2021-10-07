package com.yukino.gulimall.ware.vo;

import lombok.Data;

/**
 * @Description:
 * @author: yukino
 * @createTime: 2020-07-05 10:57
 **/

@Data
public class LockStockResultVo {

    private Long skuId;

    private Integer num;

    /** 是否锁定成功 **/
    private Boolean locked;

}
