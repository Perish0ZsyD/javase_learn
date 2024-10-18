package com.siyuan.project3.service;

/**
 * @author Siyuan
 * @Date 2024/10/18 16:30
 */
public class TeamException extends Exception{
    static final long serialVersionUID = -3387516993124229948L;

    public TeamException() {
    }

    public TeamException(String message) {
        super(message);
    }
}
