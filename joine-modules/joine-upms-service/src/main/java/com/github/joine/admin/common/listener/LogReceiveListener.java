package com.github.joine.admin.common.listener;

import com.github.joine.admin.service.SysLogService;
import com.github.joine.common.constant.MqQueueConstant;
import com.github.joine.common.entity.SysLog;
import com.github.joine.common.vo.LogVO;
import org.slf4j.MDC;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author JenphyJohn
 * @date 2017/11/17
 */
@Component
@RabbitListener(queues = MqQueueConstant.LOG_QUEUE)
public class LogReceiveListener {
    private static final String KEY_USER = "user";

    @Autowired
    private SysLogService sysLogService;

    @RabbitHandler
    public void receive(LogVO logVo) {
        SysLog sysLog = logVo.getSysLog();
        MDC.put(KEY_USER, logVo.getUsername());
        sysLog.setCreateBy(logVo.getUsername());
        sysLogService.insert(sysLog);
        MDC.remove(KEY_USER);
    }
}
