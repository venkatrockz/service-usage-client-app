package com.utils.serviceusageclientapp.controller;



import com.utils.serviceusagepublisher.model.UsageTrackingMessage;
import com.utils.serviceusagepublisher.producer.ServiceUsageTrackerProducer;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ServiceUsageTrackerController {

    private final ServiceUsageTrackerProducer producer;

    @PostMapping("/service-usage-tracker/test")
    @ResponseBody
    public ResponseEntity<?> postMessage(@RequestBody UsageTrackingMessage message) {
        producer.publishMessage(message);
        return ResponseEntity.noContent().build();
    }
}
