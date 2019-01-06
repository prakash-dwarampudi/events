package com.prakash.eventsdemo.core.slingevents;

import java.util.HashMap;
import java.util.Map;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventAdmin;

@Component(immediate=true)
public class SampleEventSender {
	
	@Reference
	private EventAdmin eventAdmin;
	
	@Activate
	public void init(){
		
		Map<String, String> props = new HashMap<>();
		props.put("name", "Sample Topic");
		
		Event event = new Event("sample/topic", props);
		eventAdmin.postEvent(event);
	}

}
