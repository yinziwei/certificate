package com.cnk.qiye.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 首页
 * @author 黄山
 *
 */
@Controller
public class IndexController {

	@RequestMapping("/")
	public String goIndex(){
		System.out.println("go Index");
		return "index";
	}
}
