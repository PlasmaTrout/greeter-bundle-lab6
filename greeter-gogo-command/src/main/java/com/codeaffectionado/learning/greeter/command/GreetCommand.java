package com.codeaffectionado.learning.greeter.command;

import java.util.ArrayList;
import java.util.List;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Properties;
import org.apache.felix.scr.annotations.Property;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.ReferenceCardinality;
import org.apache.felix.scr.annotations.ReferencePolicy;
import org.apache.felix.scr.annotations.Service;

import com.codeaffectionado.learning.greeter.api.Greeter;

@Component(name="Greet Gogo Command")
@Service(value=Object.class)
@Properties({
	@Property(name="osgi.command.scope",value="tutorial"),
	@Property(name="osgi.command.function",value="greet")
})
public class GreetCommand {
	
	@Reference(cardinality=ReferenceCardinality.OPTIONAL_MULTIPLE,
			policy=ReferencePolicy.DYNAMIC,bind="setGreeter",unbind="unsetGreeter",
			referenceInterface=Greeter.class)
	private List<Greeter> greeter;

	public void greet(){
		for(Greeter g : greeter ){
			System.out.println(g.greet());
		}
	}
	
	public void setGreeter(Greeter greet){
		if(greeter==null){
			greeter = new ArrayList<Greeter>();
		}
		greeter.add(greet);
	}
	
	public void unsetGreeter(Greeter greet){
		greeter.remove(greet);
	}
}
