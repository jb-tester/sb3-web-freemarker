package com.mytests.spring.boot3.test;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConfigurationProperties(prefix = "my.props")
public class MyConfigProperties {

    private final String url;
    private final String username;
    private final String password;
    private boolean flag = false;

    @ConstructorBinding   // should not be shown as not used: https://youtrack.jetbrains.com/issue/IDEA-293427
    public MyConfigProperties(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public MyConfigProperties(String url, String username, String password, boolean flag) {
        this.url = url;
        this.username = username;
        this.password = password;
        this.flag = flag;
    }

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean isFlag() {
        return flag;
    }
}