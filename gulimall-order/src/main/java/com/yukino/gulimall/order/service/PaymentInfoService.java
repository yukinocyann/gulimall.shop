package com.yukino.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yukino.common.utils.PageUtils;
import com.yukino.gulimall.order.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author 夏沫止水
 * @email HeJieLin@gulimall.shop
 * @date 2020-05-22 19:49:53
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

