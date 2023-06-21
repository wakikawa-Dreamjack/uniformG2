package dto;

import java.util.Date;

public class OrnerInfo {
    private int ornerId;
    private int userId;
    private String ornerMail;
    private Date ornerRegisterDate;
    private Date ornerUpdateDate;

    public int getOrnerId() {
        return ornerId;
    }

    public void setOrnerId(int ornerId) {
        this.ornerId = ornerId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getOrnerMail() {
        return ornerMail;
    }

    public void setOrnerMail(String ornerMail) {
        this.ornerMail = ornerMail;
    }

    public Date getOrnerRegisterDate() {
        return ornerRegisterDate;
    }

    public void setOrnerRegisterDate(Date ornerRegisterDate) {
        this.ornerRegisterDate = ornerRegisterDate;
    }

    public Date getOrnerUpdateDate() {
        return ornerUpdateDate;
    }

    public void setOrnerUpdateDate(Date ornerUpdateDate) {
        this.ornerUpdateDate = ornerUpdateDate;
    }
}

