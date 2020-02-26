package com.lumengjun.woker.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lumengjun.woker.pojo.Article;

public interface WokerMapper {

	
	
	List<Article> getList(@Param("dtj")String dtj,@Param("dt1") String dt1,@Param("dt2") String dt2);

}
