package com.jdktomcat.tree.log.core.impl;

import com.jdktomcat.tree.log.core.LogNode;

import java.util.Date;
import java.util.Stack;

/**
 * 类描述：默认日志节点实现类
 *
 * @author 汤旗
 * @date 2018-12-28
 */
public class DefaultLogNode implements LogNode {

    /**
     * 节点标识
     */
    private Long logNodeId;

    /**
     * 父节点标识
     */
    private Long parentNodeId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 日志信息
     */
    private StringBuilder logNodeMessage = new StringBuilder();

    /**
     * 堆栈
     */
    private Stack<StackTraceElement> traceStack = new Stack<>();

    public DefaultLogNode(Long logNodeId, Long parentNodeId, Date createTime) {
        this.logNodeId = logNodeId;
        this.parentNodeId = parentNodeId;
        this.createTime = createTime;
    }

    /**
     * 获取日志节点标识
     *
     * @return 日志节点标识
     */
    @Override
    public Long getLogNodeId() {
        return logNodeId;
    }

    /**
     * 获取上层日志节点标识
     *
     * @return 日志节点标识
     */
    @Override
    public Long getParentNodeId() {
        return parentNodeId;
    }

    /**
     * 获取节点创建时间
     *
     * @return 节点创建时间
     */
    @Override
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 获取节点日志信息
     *
     * @return 节点日志信息
     */
    @Override
    public String getLogNodeMessage() {
        return logNodeMessage.toString();
    }

    /**
     * 追加日志信息
     *
     * @param message 日志信息
     */
    @Override
    public void appendLogNodeMessage(String message) {
        logNodeMessage.append(message);
    }

    /**
     * 获取节点异常堆栈
     *
     * @return 异常堆栈
     */
    @Override
    public Stack<StackTraceElement> getTraceStack() {
        return traceStack;
    }

    /**
     * 设置异常堆栈
     *
     * @param traceStack 异常堆栈
     */
    @Override
    public void setTraceStack(Stack<StackTraceElement> traceStack) {
        this.traceStack = traceStack;
    }
}
