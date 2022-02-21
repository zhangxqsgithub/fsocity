package com.fsocity.modules.admin.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.fsocity.modules.admin.entity.AdminUser;

/**
 * <p>
 * 用户信息表 服务类
 * </p>
 *
 * @author Zail
 * @since 2022-02-21
 */
public interface AdminUserService extends IService<AdminUser> {
    
    /**
     */
    AdminUser getByUsername(String username);
    
    /**
     * 分页查找
     */
    Page<AdminUser> findAll(AdminUser form, Integer pageNum, Integer pageSize);
    
    /**
     * 根据ID删除
     */
    boolean deleteById(Integer id);
}
