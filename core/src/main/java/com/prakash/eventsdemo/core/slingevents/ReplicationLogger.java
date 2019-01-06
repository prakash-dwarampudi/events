package com.prakash.eventsdemo.core.slingevents;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.day.cq.replication.ReplicationAction;

@Component(immediate = true, service = EventHandler.class, property = {
		"event.topics=" + ReplicationAction.EVENT_TOPIC })
public class ReplicationLogger implements EventHandler {

	private static final Logger LOG = LoggerFactory.getLogger(ReplicationLogger.class);
	@Override
	public void handleEvent(Event event) {
		LOG.info("Replication event captured under : "+event.toString());
	}

}
