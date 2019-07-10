package cn.edu.cuit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.edu.cuit.service.UserService;

@Controller
public class HelloWorldController {
	@Autowired
	private UserService userService;
	@RequestMapping("/hw")
	public String hw01() {
		return "login";
	}
	@RequestMapping("/login")
	public String login(@RequestParam String name,@RequestParam String pass,Model model) {
		  boolean ret = userService.login(name,pass);
		  if(ret) {
			  return "hello";
		  }else {
			  model.addAttribute("msg", "用户名或密码错误");
			  model.addAttribute("name", name);
		return "login";
		  }
	}
}
