package ru.niir.dispatcher.agents;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ru.niir.dispatcher.EventBus;
import ru.niir.dispatcher.events.StateChangedEvent;
import ru.niir.dispatcher.events.StateChangedEvent.EmergencyType;

@SuppressWarnings("serial")
public class ExternalEmergencyAgent extends HttpServlet {
	private final EventBus eventBus;

	public ExternalEmergencyAgent(final EventBus eventBus) {
		super();
		this.eventBus = eventBus;
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		eventBus.fireEvent(new StateChangedEvent(1, 0, EmergencyType.GAS_ATTACK, "Gas atack"));
		resp.setStatus(HttpServletResponse.SC_OK);
	}
}
