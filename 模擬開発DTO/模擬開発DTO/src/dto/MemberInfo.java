package dto;

import java.util.Date;

public class MemberInfo {
    private int memberId;
    private int userId;
    private String memberMail;
    private String memberName;
    private String memberAddress;
    private String memberPost;
    private String memberPhone;
    private Date memberRegisterDate;
    private Date updateRegisterDate;

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getMemberMail() {
        return memberMail;
    }

    public void setMemberMail(String memberMail) {
        this.memberMail = memberMail;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberAddress() {
        return memberAddress;
    }

    public void setMemberAddress(String memberAddress) {
        this.memberAddress = memberAddress;
    }

    public String getMemberPost() {
        return memberPost;
    }

    public void setMemberPost(String memberPost) {
        this.memberPost = memberPost;
    }

    public String getMemberPhone() {
        return memberPhone;
    }

    public void setMemberPhone(String memberPhone) {
        this.memberPhone = memberPhone;
    }

    public Date getMemberRegisterDate() {
        return memberRegisterDate;
    }

    public void setMemberRegisterDate(Date memberRegisterDate) {
        this.memberRegisterDate = memberRegisterDate;
    }

    public Date getUpdateRegisterDate() {
        return updateRegisterDate;
    }

    public void setUpdateRegisterDate(Date updateRegisterDate) {
        this.updateRegisterDate = updateRegisterDate;
    }
}
