package com.evo.async;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import com.sun.tools.javac.code.Attribute.Array;


@Component
public class Service {

private List <Model> obj=Arrays.asList(new Model("456",new BigDecimal(426300),426399,"AIB","EUR"),
		new Model("123",new BigDecimal(426300),426399,"AIB","EUR")
		
		
		);

public List<Model> showall(){
	return obj;
	
}



public Model showall(String id){
	return obj.stream().filter(t->t.getid().equals(id)).findFirst().get();

	
}





	
}
