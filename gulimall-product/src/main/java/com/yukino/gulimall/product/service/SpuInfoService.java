package com.yukino.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yukino.common.utils.PageUtils;
import com.yukino.gulimall.product.entity.SpuInfoEntity;
import com.yukino.gulimall.product.vo.SpuSaveVo;

import java.util.Map;

/**
 * spu信息
 *
 * @author 夏沫止水
 * @email HeJieLin@gulimall.shop
 * @date 2020-05-22 19:00:18
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void savesupInfo(SpuSaveVo vo);

    void saveBaseSpuInfo(SpuInfoEntity spuInfoEntity);

    PageUtils queryPageByCondtion(Map<String, Object> params);

    /**
     * 商品上架
     * @param spuId
     */
    void up(Long spuId);

    /**
     * 根据skuId查询spu的信息
     * @param skuId
     * @return
     */
    SpuInfoEntity getSpuInfoBySkuId(Long skuId);
}

