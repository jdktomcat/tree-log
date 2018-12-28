package com.jdktomcat.tree.log.core;

import com.sun.istack.internal.NotNull;

import java.util.Map;

/**
 * 接口描述：日志树抽象接口
 *
 * @author 汤旗
 * @date 2018-12-28
 */
public interface LogTree {

    /**
     * 获取日志树标识
     *
     * @return 日志树标识
     */
    Long getLogTreeId();

    /**
     * 获取日志树所属领域
     *
     * @return 日志树所属领域
     */
    String getLogTreeDomain();

    /**
     * 获取根节点
     *
     * @return 根节点
     */
    LogNode getRootNode();

    /**
     * 获取当前叶子节点
     *
     * @return 当前叶子节点
     */
    LogNode getLeafNode();

    /**
     * 设置叶子节点
     *
     * @param leafNode 叶子节点
     */
    void setLeafNode(@NotNull LogNode leafNode);

    /**
     * 获取日志树节点映射
     *
     * @return 节点映射
     */
    Map<Long,LogNode> getTreeNodeMap();
}
