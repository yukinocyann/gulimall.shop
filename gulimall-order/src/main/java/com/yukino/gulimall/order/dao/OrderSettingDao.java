package com.yukino.gulimall.order.dao;

import com.yukino.gulimall.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author 夏沫止水
 * @email HeJieLin@gulimall.shop
 * @date 2020-05-22 19:49:53
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
