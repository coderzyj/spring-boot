package com.zyj.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.zyj.entity.StockEntity;
/**
 * 
 * @author 张勇杰
 * @date:日期:2017年11月23日时间:上午12:23:01
 * @version 1.0
 */
public interface StockMapper {
	
	@Select("select * from stock")
	List<StockEntity> getAll();
	
	@Select("select * from stock where id=#{id}")
	StockEntity getOne(int id);
	
	@Insert("insert into stock(item,count) values (#{item},#{count})")
	void insert(StockEntity stockEntity);
	
	@Update("update stock set count=#{count} where item=#{item}")
	void update(StockEntity stockEntity);
	
	@Delete("delete from stock where id=#{id}")
	void delete(int id);
}
