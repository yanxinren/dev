package com.ryx.others.designPattern;


import org.apache.log4j.Logger;

import java.security.acl.LastOwnerException;

/**
 * @author ryx
 * @ProjectName demo
 * @Description: 实现一个记录日志的装饰器
 * @date 2018/9/5 00059:45
 */
public class LoggerDecorator implements Command {
    Command cmd;

    public LoggerDecorator(Command command) {
        this.cmd = command;
    }

    @Override
    public void execute() {
        Logger logger = Logger.getLogger(LoggerDecorator.class);
        //记录日志
        logger.debug("开始---------!!");
        this.cmd.execute();
        logger.debug("结束------------!!");
    }
}
