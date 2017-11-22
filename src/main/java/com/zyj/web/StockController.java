package com.zyj.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zyj.entity.StockEntity;
import com.zyj.mapper.StockMapper;

@RestController
public class StockController {
	@Autowired
	private StockMapper stockMapper;
	
	@RequestMapping("/getAll")
	public List<StockEntity> getAll()
	{
		List<StockEntity> stocks=stockMapper.getAll();
		return stocks;
	}
	
	@RequestMapping("/getStock")
	public StockEntity getStock(int id)
	{
		StockEntity stock=stockMapper.getOne(id);
		return stock;
	}
	
	@RequestMapping("/add")
    public void save(StockEntity user) {
		stockMapper.insert(user);
    }
    
    @RequestMapping(value="update")
    public void update(StockEntity user) {
    	stockMapper.update(user);
    }
    
    @RequestMapping(value="/delete/{id}")
    public void delete(@PathVariable("id") int id) {
    	stockMapper.delete(id);
    }
}
