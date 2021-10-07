package com.yukino.gulimall.order.vo;

import lombok.Data;

/**
 * @Description: 库存vo
 * @author: yukino
 * @createTime: 2020-07-03 18:13
 **/

@Data
public class SkuStockVo {


    private Long skuId;

    private Boolean hasStock;

}
