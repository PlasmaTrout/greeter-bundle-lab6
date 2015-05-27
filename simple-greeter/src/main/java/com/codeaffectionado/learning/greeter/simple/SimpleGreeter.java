package com.codeaffectionado.learning.greeter.simple;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;

import com.codeaffectionado.learning.greeter.api.Greeter;

@Component(name="Simple Greeter Implementation")
@Service(value=Greeter.class)
public class SimpleGreeter implements Greeter {

	@Override
	public String greet() {
		return "Static Greeter From Simple Greeter";
	}

}
