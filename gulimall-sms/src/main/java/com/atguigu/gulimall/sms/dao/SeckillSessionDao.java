package com.atguigu.gulimall.sms.dao;

import com.atguigu.gulimall.sms.entity.SeckillSessionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动场次
 * 
 * @author zhupeng
 * @email zp@atguigu.com
 * @date 2019-08-02 12:47:37
 */
@Mapper
public interface SeckillSessionDao extends BaseMapper<SeckillSessionEntity> {
	
}
