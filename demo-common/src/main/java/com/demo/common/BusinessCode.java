package com.demo.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 统一状态码
 *
 * @author fuchangshun
 * @date 2020-11-11 11:11:11
 */
@Getter
@AllArgsConstructor
public enum BusinessCode {
    //状态码
    SUCCESS("000000", "success"),
    WARN("100000", "${请自定义前端直接提示的信息}$"),
    EXTRA("100100", "${携带扩展内容请覆盖此信息}$"),

    //用户相关
    USER_NOT_LOGIN("20100", "登录获取更好体验~"),
    USER_NON_EXISTENT("20101", "用户不存在"),
    USER_LOGIN_TIME_OUT("20102", "登录超时"),
    USER_STATUS_ERROR("20103", "用户状态异常"),
    USER_PASSWORD_ERROR("20104", "用户密码错误"),
    USER_LOGIN_LOCKED("20105", "用户登录锁定"),
    USER_ROLE_LOCKED("20106", "用户角色停用"),
    USER_LOGIN_KICKED("20107", "用户登录踢出"),
    USER_CAPTCHA_ERROR("20108", "验证码错误"),
    //token验证
    USER_LOGIN_TOKEN_INVALID("20109", "TOKEN已失效"),

    //接口校验相关
    ERROR_AUTH("400101", "无权访问/操作"),
    ERROR_PARAMS("400201", "参数非法"),
    ERROR_RISK("400301", "异常请求"),

    //前台用户权限
    ERROR_EXPIRE_STANDARD("400501", "正式权限到期"),
    ERROR_EXPIRE_EXPERIENCE("400601", "体验权限到期"),

    //系统错误
    FATAL("500000", "服务器出了点小问题, 请稍后重试"),
    FUSING("500001", "您点的太快了, 请稍后重试"),
    BUSYNESS("500002", "系统繁忙, 请稍后重试"),

    //前台提示状态码
    WARN_MOSILODU("600201", "敏感词校验未通过"),
    WARN_IMAGE_ILLEGAL("600202","图片校验未通过"),
    WARN_SERIAL_USER_ILLEGAL("600303", "用户非法"),
    WARN_SERIAL_WAIT_REPAIR("600312", "业务待修复"),

    // 课程状态码
    COURSE_REMOVED("700001", "课程已下架,请查看其他课程"),
    SECTION_REMOVED("700002", "课节已下架"),
    TRAINING_COURSE_SORT_EXISTED("700003", "该平台实训课排序已存在"),
    TEACHER_REMOVED("700004","讲师已下架"),
    COURSE_ILLEGALITY("700005", "课程非法"),
    CATEGORY_REMOVED("700006", "分类不存在"),

    ;

    private final String code;
    private final String desc;

}
