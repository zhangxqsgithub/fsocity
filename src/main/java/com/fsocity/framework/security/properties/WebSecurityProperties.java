package com.fsocity.framework.security.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author zail
 * @date 2022/1/24
 */
@Data
@ConfigurationProperties(prefix = "fsocity.security")
@Component
public class WebSecurityProperties {
    // 提示需要登录页面
    private String requireAuthenticationUrl = "/admin/authentication/require";
    // 登录页面
    private String loginPage = "/admin/login";
    // 处理登录的链接
    private String loginProcessingUrl = "/admin/login";
    // 退出登录 url
    private String logoutUrl = "/admin/logout";
    // 登录成功跳转的 url
    private String loginSuccessUrl = "/admin/index";
    // 访问拒绝页面
    private String accessDeniedUrl = "/admin/access/denied";
    // 需要身份认证的匹配链接
    private String[] authenticatedUrls = {"/admin", "/admin/**"};
    // 不需要身份认证的匹配链接
    private String[] unauthenticatedUrls = {};
    // 验证码配置
    private ValidationCodeProperties validationCode = new ValidationCodeProperties();
    // 记住我时间配置(单位秒)
    private Integer rememberMeSeconds = 3600 * 2;
    // jwt 配置
    private JWTProperties jwt = new JWTProperties();
}
