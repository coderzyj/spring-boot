package com.zyj.mapper;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.zyj.entity.StockEntity;
@RunWith(SpringRunner.class)
@SpringBootTest
public class StockMapperTests {

	@Autowired
	private StockMapper stockMapper;
	@Test
	public void testGetAll() {
		List<StockEntity> stocks = stockMapper.getAll();
		System.out.println(stocks.toString());
	}

	@Test
	public void testGetOne() {
		StockEntity stockEntity=stockMapper.getOne(3);
		System.out.println(stockEntity);
	}

	@Test
	public void testInsert() {
		StockEntity stockEntity=new StockEntity();
		stockEntity.setItem(5);
		stockEntity.setCount(5000);
		stockMapper.insert(stockEntity);
	}

	@Test
	public void testUpdate() {
		StockEntity stockEntity=stockMapper.getOne(2);
		System.out.println(stockEntity);
		stockEntity.setCount(2000);
		
		stockMapper.update(stockEntity);
		
		Assert.assertEquals("2000",String.valueOf(stockMapper.getOne(2).getCount()));
		
	}

	@Test
	public void testDelete() {
		
	}

}
