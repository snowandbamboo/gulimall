package com.atguigu.gulimall.oms.dao;

import com.atguigu.gulimall.oms.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author zhupeng
 * @email zp@atguigu.com
 * @date 2019-08-02 12:24:40
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
