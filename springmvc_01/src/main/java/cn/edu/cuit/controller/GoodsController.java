package cn.edu.cuit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GoodsController {
    //private GoodService goodservice;
    @RequestMapping("/goods")
	   public String goods(Model model) {
		      
		   return "showgoods";
	   }
}
