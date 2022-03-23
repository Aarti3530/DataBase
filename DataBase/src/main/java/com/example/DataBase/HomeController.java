package com.example.DataBase;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.DataBase.dao.AliensRepo;
import com.example.DataBase.entity.Alien;

@Controller
public class HomeController {
	
	@Autowired
	private AliensRepo repo;
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@GetMapping("getAlien")
	public String getAlien(@RequestParam int id,Model m) {
		m.addAttribute("aliens",repo.getById(id));
		return "result.jsp";
	}
	
	@GetMapping("all")
	@ResponseBody
	public List<Alien> all(){
		List<Alien> list = repo.findAll();
		return list;
	}
	
	@PostMapping("addAlien")
	@ResponseBody
	public Alien add(@RequestBody Alien a) {
	    return repo.save(a);
	}

}
