package com.codeaffectionado.learning.greeter.monday;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;

import com.codeaffectionado.learning.greeter.api.Greeter;

@Component(name="Monday Greeting Implementation")
@Service(value=Greeter.class)
public class MondayGreeter implements Greeter {

	@Override
	public String greet() {
		return "bah!";
	}

}
