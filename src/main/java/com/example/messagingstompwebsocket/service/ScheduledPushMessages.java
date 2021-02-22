package com.example.messagingstompwebsocket.service;

import com.example.messagingstompwebsocket.feign.FeignClientInteface;
import com.example.messagingstompwebsocket.pojos.RecupData;

import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledPushMessages {

  public String dataSet;

  public String q;

  public String rows;

  public String start;

  @Autowired
  FeignClientInteface feignClientInteface;

  @Autowired
  SimpMessagingTemplate simpMessagingTemplate;

  @Scheduled(fixedRate = 60000)
  public void sendMessage() {
    if (Strings.isNotBlank(dataSet)) {
      RecupData data = feignClientInteface.get(dataSet, rows, q, start);
      simpMessagingTemplate.convertAndSend("/topic/elements", data);
    }
  }

}