package com.spring.employees.constant;

public class SecurityConstant {
    public static final long EXPIRATION_TIME = 432_000_000; // 5 days expressed in milliseconds
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String JWT_TOKEN_HEADER = "Jwt-Token";
    public static final String TOKEN_CANNOT_BE_VERIFIED = "Token cannot be verified";
    public static final String MFORTUNE = "Mfortune, LLC";
    public static final String MFORTUNE_ADMIN = "User Management Portal";
    public static final String AUTHORITIES = "Authorities";
    public static final String FORBIDDEN_MESSAGE = "Login is needed to access this page";
    public static final String ACCESS_DENIED_MESSAGE = "You are not allowed to access this page";
    public static final String OPTIONS_HTTP_METHOD = "OPTIONS";
//    public static final String[] PUBLIC_URLS = {"/user/login", "user/register", "/user/resetpassword/**", "user/image/**"};
   public static final String[] PUBLIC_URLS = {"**"};
}
