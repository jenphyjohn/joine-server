package com.github.joine.mc.listener;

import com.github.joine.common.constant.MqQueueConstant;
import com.github.joine.mc.handler.DingTalkMessageHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author JenphyJohn
 * @date 2018/4/22
 * 监听服务状态改变发送请求
 */
@Slf4j
@Component
@RabbitListener(queues = MqQueueConstant.DINGTALK_SERVICE_STATUS_CHANGE)
public class DingTalkServiceChangeReceiveListener {
    @Autowired
    private DingTalkMessageHandler dingTalkMessageHandler;

    @RabbitHandler
    public void receive(String text) {
        long startTime = System.currentTimeMillis();
        log.info("消息中心接收到钉钉发送请求-> 内容：{} ", text);
        dingTalkMessageHandler.process(text);
        long useTime = System.currentTimeMillis() - startTime;
        log.info("调用 钉钉网关处理完毕，耗时 {}毫秒", useTime);
    }
}
