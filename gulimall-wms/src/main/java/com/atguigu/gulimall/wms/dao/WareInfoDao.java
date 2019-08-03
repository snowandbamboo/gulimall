package com.atguigu.gulimall.wms.dao;

import com.atguigu.gulimall.wms.entity.WareInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 仓库信息
 * 
 * @author zhupeng
 * @email zp@atguigu.com
 * @date 2019-08-02 12:52:55
 */
@Mapper
public interface WareInfoDao extends BaseMapper<WareInfoEntity> {
	
}
