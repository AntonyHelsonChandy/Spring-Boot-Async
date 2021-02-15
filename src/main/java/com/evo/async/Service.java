package com.evo.async;

import java.util.List;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import com.sun.tools.javac.code.Attribute.Array;


@Component
public class Service {

private List <Model> obj=Arrays.asList(new Model(125,444,426399,"AIB","EUR"),
		new Model(125,444,426399,"AIB","EUR"),
		new Model(125,444,426399,"AIB","EUR"),
		new Model(125,444,426399,"AIB","EUR"),
		new Model(125,444,426399,"AIB","EUR"),
		new Model(125,444,426399,"AIB","EUR")
		
		);

public List<Model> showall(){
	return obj;
	
}

	
}
