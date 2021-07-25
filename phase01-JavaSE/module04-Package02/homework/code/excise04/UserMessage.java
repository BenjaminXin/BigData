package com.lagou.phase01.module04.homework.excise04;

public class UserMessage implements java.io.Serializable {

    private static final long serialVersionUID = 9495L;

    private String status;
    private User user;

    public UserMessage() {}

    public UserMessage(String status, User user) {
        setStatus(status);
        setUser(user);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "UserMessage{" +
                "status='" + status + '\'' +
                ", user=" + user +
                '}';
    }
}
