package com.example.messagingstompwebsocket.controller;

import com.example.messagingstompwebsocket.pojos.Inputs;
import com.example.messagingstompwebsocket.service.ScheduledPushMessages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

@Controller
@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:4200" })
public class MainController {

	@Autowired
	ScheduledPushMessages scheduledPushMessages;

	@MessageMapping("/get")
	@SendTo("/topic/elements")
	public void getElements(Inputs inputs) {
		scheduledPushMessages.dataSet = inputs.getDataset();
		scheduledPushMessages.q = inputs.getQ();
		scheduledPushMessages.rows = inputs.getRow();
		scheduledPushMessages.start = inputs.getStart();
		scheduledPushMessages.sendMessage();
	}

}
