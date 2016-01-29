package com.lm.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lm.service.MetaService;
import com.taobao.metamorphosis.client.extension.spring.MessageBuilder;
import com.taobao.metamorphosis.client.extension.spring.MetaqTemplate;

@Service("meta")
public class MetaServiceImp implements MetaService {
	
	@Autowired
	MetaqTemplate metaqTemplate;
	
	@Override
	public void sendMessage() {
		
		final String topic = "test";  
		try {

			metaqTemplate.send(MessageBuilder.withTopic(topic).withBody(new Date()));
			
		} catch (InterruptedException e) {

		}  
	}

}
