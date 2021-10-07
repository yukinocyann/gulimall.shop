package com.yukino.common.to;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Description:
 * @author: yukino
 * @createTime: 2020-06-01 08:45
 **/

@Data
public class SpuBoundTo {

    private Long spuId;

    private BigDecimal buyBounds;

    private BigDecimal growBounds;

}
