package com.lumengjun.woker.controller;


import java.util.List;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.lumengjun.woker.pojo.Article;
import com.lumengjun.woker.service.WokerService;


@Controller
public class WokerController {

	@Reference
	WokerService wokerService;
	
	
	@RequestMapping("list")
	public String list(@RequestParam(defaultValue="")String dtj,@RequestParam(defaultValue="")String dt2,@RequestParam(defaultValue="")String dt1, Model model){
		List<Article> list = wokerService.getList(dtj,dt1,dt2);
		model.addAttribute("list", list);
		model.addAttribute("dt2", dt2);
		model.addAttribute("dt1", dt1);
		model.addAttribute("dtj", dtj);
		return "list";
		
	}
	
}
