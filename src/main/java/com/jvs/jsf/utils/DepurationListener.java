package com.jvs.jsf.utils;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DepurationListener implements PhaseListener {

	private static final Logger log = LoggerFactory.getLogger(DepurationListener.class);

	@Override
	public void beforePhase(PhaseEvent event) {		
		log.info("BEFORE PHASE:" + event.getPhaseId().toString());
	}

	@Override
	public void afterPhase(PhaseEvent event) {
		log.info("AFTER PHASE:" + event.getPhaseId().toString());

	}

	@Override
	public PhaseId getPhaseId() {
		return PhaseId.ANY_PHASE;
	}

}
