package com.yukino.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yukino.common.utils.PageUtils;
import com.yukino.gulimall.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author 夏沫止水
 * @email HeJieLin@gulimall.shop
 * @date 2020-05-22 19:42:06
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

