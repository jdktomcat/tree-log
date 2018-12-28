package com.jdktomcat.tree.log.core.impl;

import com.jdktomcat.tree.log.core.LogNode;
import com.jdktomcat.tree.log.core.LogTree;
import com.sun.istack.internal.NotNull;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 类描述：默认日志树实现
 *
 * @author 汤旗
 * @date 2018-12-28
 */
public class DefaultLogTree implements LogTree {

    /**
     * 日志树标识
     */
    private Long logTreeId;

    /**
     * 日志树所属域
     */
    private String logTreeDomain;

    /**
     * 根节点
     */
    private LogNode rootNode;

    /**
     * 叶子节点
     */
    private LogNode leafNode;

    /**
     * 日志节点映射
     */
    private Map<Long, LogNode> logNodeMap = new ConcurrentHashMap<>();

    public DefaultLogTree(@NotNull Long logTreeId, @NotNull String logTreeDomain, @NotNull LogNode rootNode) {
        this.logTreeId = logTreeId;
        this.logTreeDomain = logTreeDomain;
        this.rootNode = rootNode;
        logNodeMap.put(rootNode.getLogNodeId(), rootNode);
    }

    /**
     * 获取日志树标识
     *
     * @return 日志树标识
     */
    @Override
    public Long getLogTreeId() {
        return logTreeId;
    }

    /**
     * 获取日志树所属领域
     *
     * @return 日志树所属领域
     */
    @Override
    public String getLogTreeDomain() {
        return logTreeDomain;
    }

    /**
     * 获取根节点
     *
     * @return 根节点
     */
    @Override
    public LogNode getRootNode() {
        return rootNode;
    }

    /**
     * 获取当前叶子节点
     *
     * @return 当前叶子节点
     */
    @Override
    public LogNode getLeafNode() {
        return leafNode;
    }

    /**
     * 设置叶子节点
     *
     * @param leafNode 叶子节点
     */
    @Override
    public void setLeafNode(@NotNull LogNode leafNode) {
        this.leafNode = leafNode;
        this.logNodeMap.put(leafNode.getLogNodeId(), leafNode);
    }

    /**
     * 获取日志树节点映射
     *
     * @return 节点映射
     */
    @Override
    public Map<Long, LogNode> getTreeNodeMap() {
        return logNodeMap;
    }
}
