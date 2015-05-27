package com.codeaffectionado.learning.greeter.command;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Properties;
import org.apache.felix.scr.annotations.Property;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.Service;

import com.codeaffectionado.learning.greeter.api.Greeter;

@Component(name="Greet Gogo Command")
@Service(value=Object.class)
@Properties({
	@Property(name="osgi.command.scope",value="tutorial"),
	@Property(name="osgi.command.function",value="greet")
})
public class GreetCommand {
	
	@Reference
	private Greeter greeter;

	public void greet(){
		System.out.println(greeter.greet());
	}
}
