package com.cat2bug.system.domain;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.cat2bug.common.annotation.Excel;
import com.cat2bug.common.core.domain.BaseEntity;

import javax.servlet.annotation.HandlesTypes;

/**
 * 缺陷对象 sys_defect
 * 
 * @author yuzhantao
 * @date 2023-11-23
 */
@Data
public class SysDefect extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 缺陷id
 */
    private Long defectId;

    /** 缺陷类型
 */
    @Excel(name = "缺陷类型")
    private Integer defectType;

    /** 缺陷标题 */
    @Excel(name = "缺陷标题")
    private String defectName;

    /** 缺陷描述 */
    private String defectDescribe;

    /** 附件 */
    @Excel(name = "附件")
    private List<String> annexUrls;

    /** 项目id */
    private Long projectId;

    /** 项目 */
    @Excel(name = "项目")
    private String projectName;


    /** 测试计划id */
//    @Excel(name = "测试计划id")
    private Long testPlanId;

    /** 测试用例id */
//    @Excel(name = "测试用例id")
    private Long caseId;

    /** 数据来源 */
    @Excel(name = "数据来源")
    private Integer dataSources;

    /** 数据来源相关参数 */
    @Excel(name = "数据来源相关参数")
    private String dataSourcesParams;

    /** 测试模块id */
    @Excel(name = "测试模块id")
    private Long moduleId;

    /** 版本 */
    @Excel(name = "版本")
    private String moduleVersion;

    /** 缺陷状态 */
    @Excel(name = "缺陷状态")
    private Integer defectState;

    /** 用例步骤id */
//    @Excel(name = "用例步骤id")
    private Long caseStepId;

    /** 处理人id */
    private String handleBy;

    @Excel(name = "处理人")
    private String handleName;

    /** 处理时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "处理时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date handleTime;

    /** 缺陷等级 */
    private String defectLevel;

    @Excel(name = "缺陷等级")
    private String defectLevelName;

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("defectId", getDefectId())
            .append("defectType", getDefectType())
            .append("defectName", getDefectName())
            .append("defectDescribe", getDefectDescribe())
            .append("annexUrls", getAnnexUrls())
            .append("projectId", getProjectId())
            .append("testPlanId", getTestPlanId())
            .append("caseId", getCaseId())
            .append("dataSources", getDataSources())
            .append("dataSourcesParams", getDataSourcesParams())
            .append("moduleId", getModuleId())
            .append("moduleVersion", getModuleVersion())
            .append("createBy", getCreateBy())
            .append("updateTime", getUpdateTime())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("defectState", getDefectState())
            .append("caseStepId", getCaseStepId())
            .append("handleBy", getHandleBy())
            .append("handleTime", getHandleTime())
            .append("defectLevel", getDefectLevel())
            .toString();
    }
}