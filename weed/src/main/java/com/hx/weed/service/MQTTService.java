package com.hx.weed.service;

import java.util.Map;

public interface MQTTService {
    void processingMsg(String topic, byte[] msg);
    void sendtoUI(Map<String,Object> map);
    void TestJugat(double lat,double lon,String carcode);
}
