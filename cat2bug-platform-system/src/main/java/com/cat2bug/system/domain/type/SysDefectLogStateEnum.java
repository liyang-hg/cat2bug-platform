package com.cat2bug.system.domain.type;

/**
 * 缺陷日志状态
 */
public enum SysDefectLogStateEnum {
    /** 创建 */
    CREATE,
    /** 指派 */
    ASSIGN,
    /** 审核驳回 */
    REJECT,
    /** 审核通过 */
    PASS,
    /** 已拒绝 */
    REJECTED,
    /** 已关闭 */
    CLOSED
}