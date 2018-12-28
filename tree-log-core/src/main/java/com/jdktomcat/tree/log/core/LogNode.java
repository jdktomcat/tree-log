package com.jdktomcat.tree.log.core;

import java.util.Date;
import java.util.Stack;

/**
 * 接口描述：日志节点接口
 *
 * @author 汤旗
 * @date 2018-12-28
 */
public interface LogNode {

    /**
     * 获取日志节点标识
     *
     * @return 日志节点标识
     */
    Long getLogNodeId();

    /**
     * 获取上层日志节点标识
     *
     * @return 日志节点标识
     */
    Long getParentNodeId();

    /**
     * 获取节点创建时间
     *
     * @return 节点创建时间
     */
    Date getCreateTime();

    /**
     * 获取节点日志信息
     *
     * @return 节点日志信息
     */
    String getLogNodeMessage();

    /**
     * 追加日志信息
     *
     * @param message 日志信息
     */
    void appendLogNodeMessage(String message);

    /**
     * 获取节点异常堆栈
     *
     * @return 异常堆栈
     */
    Stack<StackTraceElement> getTraceStack();

    /**
     * 设置异常堆栈
     *
     * @param traceStack 异常堆栈
     */
    void setTraceStack(Stack<StackTraceElement> traceStack);
}
