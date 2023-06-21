package dto;

public class Userinfo {
    private int userId;
    private String userName;
    private String password;
    private String userFlug;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserFlug() {
        return userFlug;
    }

    public void setUserFlug(String userFlug) {
        this.userFlug = userFlug;
    }
}

