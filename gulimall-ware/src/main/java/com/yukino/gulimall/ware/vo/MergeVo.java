package com.yukino.gulimall.ware.vo;

import lombok.Data;

import java.util.List;

/**
 * @Description:
 * @author: yukino
 * @createTime: 2020-06-01 17:04
 **/

@Data
public class MergeVo {

    private Long purchaseId;

    private List<Long> items;

}
