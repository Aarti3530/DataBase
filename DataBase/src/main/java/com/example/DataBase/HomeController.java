package com.example.DataBase;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.DataBase.dao.AliensRepo;
import com.example.DataBase.entity.Alien;

@RestController
public class HomeController {
	
	@Autowired
	private AliensRepo repo;
	
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView("home.jsp");
	    return mav;
	}
	
	@GetMapping("getAlien")
	public ModelAndView getAlien(@RequestParam int id,ModelAndView m) {
		m.addObject("aliens",repo.getById(id));
		m.setViewName("result.jsp");
		return m;
	}
	
	@GetMapping("all")
	public List<Alien> all(){
		List<Alien> list = repo.findAll();
		return list;
	}
	
	
	@GetMapping("/addAlien")
	public Alien add(Alien a) {
		repo.save(a);
	    return a;
	}

}
