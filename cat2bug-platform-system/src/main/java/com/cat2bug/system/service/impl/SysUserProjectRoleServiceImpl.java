package com.cat2bug.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cat2bug.system.mapper.SysUserProjectRoleMapper;
import com.cat2bug.system.domain.SysUserProjectRole;
import com.cat2bug.system.service.ISysUserProjectRoleService;

/**
 * 用户项目角色Service业务层处理
 * 
 * @author yuzhantao
 * @date 2023-11-22
 */
@Service
public class SysUserProjectRoleServiceImpl implements ISysUserProjectRoleService 
{
    @Autowired
    private SysUserProjectRoleMapper sysUserProjectRoleMapper;

    /**
     * 查询用户项目角色
     * 
     * @param userProjectRoleId 用户项目角色主键
     * @return 用户项目角色
     */
    @Override
    public SysUserProjectRole selectSysUserProjectRoleByUserProjectRoleId(Long userProjectRoleId)
    {
        return sysUserProjectRoleMapper.selectSysUserProjectRoleByUserProjectRoleId(userProjectRoleId);
    }

    /**
     * 查询用户项目角色列表
     * 
     * @param sysUserProjectRole 用户项目角色
     * @return 用户项目角色
     */
    @Override
    public List<SysUserProjectRole> selectSysUserProjectRoleList(SysUserProjectRole sysUserProjectRole)
    {
        return sysUserProjectRoleMapper.selectSysUserProjectRoleList(sysUserProjectRole);
    }

    /**
     * 新增用户项目角色
     * 
     * @param sysUserProjectRole 用户项目角色
     * @return 结果
     */
    @Override
    public int insertSysUserProjectRole(SysUserProjectRole sysUserProjectRole)
    {
        return sysUserProjectRoleMapper.insertSysUserProjectRole(sysUserProjectRole);
    }

    /**
     * 修改用户项目角色
     * 
     * @param sysUserProjectRole 用户项目角色
     * @return 结果
     */
    @Override
    public int updateSysUserProjectRole(SysUserProjectRole sysUserProjectRole)
    {
        return sysUserProjectRoleMapper.updateSysUserProjectRole(sysUserProjectRole);
    }

    /**
     * 批量删除用户项目角色
     * 
     * @param userProjectRoleIds 需要删除的用户项目角色主键
     * @return 结果
     */
    @Override
    public int deleteSysUserProjectRoleByUserProjectRoleIds(Long[] userProjectRoleIds)
    {
        return sysUserProjectRoleMapper.deleteSysUserProjectRoleByUserProjectRoleIds(userProjectRoleIds);
    }

    /**
     * 删除用户项目角色信息
     * 
     * @param userProjectRoleId 用户项目角色主键
     * @return 结果
     */
    @Override
    public int deleteSysUserProjectRoleByUserProjectRoleId(Long userProjectRoleId)
    {
        return sysUserProjectRoleMapper.deleteSysUserProjectRoleByUserProjectRoleId(userProjectRoleId);
    }
}