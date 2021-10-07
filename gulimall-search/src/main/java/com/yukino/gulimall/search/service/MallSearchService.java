package com.yukino.gulimall.search.service;

import com.yukino.gulimall.search.vo.SearchParam;
import com.yukino.gulimall.search.vo.SearchResult;

/**
 * @Description:
 * @author: yukino
 * @createTime: 2020-06-13 14:17
 **/
public interface MallSearchService {

    /**
     * @param param 检索的所有参数
     * @return  返回检索的结果，里面包含页面需要的所有信息
     */
    SearchResult search(SearchParam param);
}
