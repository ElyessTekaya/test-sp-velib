package com.example.messagingstompwebsocket.feign;

import com.example.messagingstompwebsocket.pojos.RecupData;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "feignClient", url = "https://opendata.paris.fr/api/records/1.0")
public interface FeignClientInteface {

  @GetMapping("/search")
  RecupData get(@RequestParam("dataset") String dataset, @RequestParam("rows") String rows, @RequestParam("q") String q,
      @RequestParam("start") String start);
}
