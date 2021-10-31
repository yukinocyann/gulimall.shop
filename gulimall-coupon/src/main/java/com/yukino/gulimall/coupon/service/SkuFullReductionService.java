package com.yukino.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yukino.common.to.SkuReductionTo;
import com.yukino.common.utils.PageUtils;
import com.yukino.gulimall.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author 夏沫止水
 * @email HeJieLin@gulimall.shop
 * @date 2020-05-22 19:35:30
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveSkuReduction(SkuReductionTo skuReductionTo);
}

