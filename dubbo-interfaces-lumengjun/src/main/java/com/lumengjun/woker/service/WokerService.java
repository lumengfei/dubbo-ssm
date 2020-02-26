package com.lumengjun.woker.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.lumengjun.woker.pojo.Article;

public interface WokerService {

	int get(int i, int j);

	List<Article> getList(String dtj, String dt1, String dt2);

}
