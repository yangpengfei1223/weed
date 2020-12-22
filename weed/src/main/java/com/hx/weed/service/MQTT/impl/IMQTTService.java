package com.hx.weed.service.MQTT.impl;

import com.hx.weed.service.MQTTService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class IMQTTService implements MQTTService {
    @Override
    public void processingMsg(String topic, byte[] msg) {

    }

    @Override
    public void sendtoUI(Map<String, Object> map) {

    }

    @Override
    public void TestJugat(double lat, double lon, String carcode) {

    }
}
