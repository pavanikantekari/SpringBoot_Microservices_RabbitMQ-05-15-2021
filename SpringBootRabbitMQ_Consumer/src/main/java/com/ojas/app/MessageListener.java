package com.ojas.app;

import java.util.Date;
import java.util.UUID;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Component
public class MessageListener {

	@RabbitListener(queues=MQConfig.QUEUE)
	public void listener(CustomMessage message) {
		System.out.println(message);
	}
}