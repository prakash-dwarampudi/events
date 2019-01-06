package com.prakash.eventsdemo.core.slingevents;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(immediate = true, service = EventHandler.class, property = { "event.topics=" + "sample/topic" })
public class SampleEventSubscriber implements EventHandler {

	private static final Logger LOG = LoggerFactory.getLogger(SampleEventSubscriber.class);

	@Override
	public void handleEvent(Event event) {
		LOG.info("Printing entire event :" + event);
		String val = (String) event.getProperty("name");

		LOG.info("Received event name is :" + val);
	}

}
