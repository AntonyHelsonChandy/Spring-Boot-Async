package com.evo.async;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class control {
	
	@Autowired
	Service ff ;
	
	@RequestMapping("/img")
public List<Model> show() {
	
return ff.showall();	
		
}
	
	
	
}
