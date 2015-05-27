package com.codeaffectionado.learning.greeter.universe;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Properties;
import org.apache.felix.scr.annotations.Property;
import org.apache.felix.scr.annotations.Service;

import com.codeaffectionado.learning.greeter.api.Greeter;

@Component(name="Universe Greeter")
@Service(value=Greeter.class)
@Properties({
	@Property(name="dayofweek",value="tuesday")
})
public class UniverseGreeter implements Greeter {

	@Override
	public String greet() {
		return "Hello From The Universe";
	}

}
