package com.lumengjun;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BooStart {

	
	public static void main(String[] args) throws IOException {
		System.out.println("准备启动");
		// 加载上下文
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext-*.xml");
		System.out.println("配置文件加载完成");
		//启动环境
		context.start();
		System.out.println("启动成功");
		//阻塞
		System.in.read();
	}
}
