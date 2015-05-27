package com.codeaffectionado.learning.greeter.universe;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;

import com.codeaffectionado.learning.greeter.api.Greeter;

@Component(name="Universe Greeter")
@Service(value=Greeter.class)
public class UniverseGreeter implements Greeter {

	@Override
	public String greet() {
		return "Hello From The Universe";
	}

}
