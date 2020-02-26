package com.lumengjun.woker.service.impl;

import java.util.List;



import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;








import com.lumengjun.woker.mapper.WokerMapper;
import com.lumengjun.woker.pojo.Article;
import com.lumengjun.woker.service.WokerService;



@Service()
public class WokerServiceImpl implements WokerService{

	@Autowired
	WokerMapper mapper;

	@Override
	public int get(int i, int j) {
		// TODO Auto-generated method stub
		return (i+j);
	}

	@Override
	public List<Article> getList(String dtj, String dt1, String dt2) {
		
		List<Article> list = mapper.getList(dtj,dt1,dt2);
		return list;
	}
	
	
	
}
