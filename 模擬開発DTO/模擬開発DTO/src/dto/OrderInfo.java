package dto;

import java.util.Date;

public class OrderInfo {
    private int orderId;
    private int memberId;
    private int productId;
    private Date orderDate;
    private Date orderUpdateDate;
    private int buyQuantity;
    private int totalPrice;
    private String other;
    private String depositSituation;
    private String sendSituation;
    private String guestMail;
    private String guestName;
    private String guestAddress;
    private String guestPost;
    private String guestPhone;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getOrderUpdateDate() {
        return orderUpdateDate;
    }

    public void setOrderUpdateDate(Date orderUpdateDate) {
        this.orderUpdateDate = orderUpdateDate;
    }

    public int getBuyQuantity() {
        return buyQuantity;
    }

    public void setBuyQuantity(int buyQuantity) {
        this.buyQuantity = buyQuantity;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getDepositSituation() {
        return depositSituation;
    }

    public void setDepositSituation(String depositSituation) {
        this.depositSituation = depositSituation;
    }

    public String getSendSituation() {
        return sendSituation;
    }

    public void setSendSituation(String sendSituation) {
        this.sendSituation = sendSituation;
    }

    public String getGuestMail() {
        return guestMail;
    }

    public void setGuestMail(String guestMail) {
        this.guestMail = guestMail;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getGuestAddress() {
        return guestAddress;
    }

    public void setGuestAddress(String guestAddress) {
        this.guestAddress = guestAddress;
    }

    public String getGuestPost() {
        return guestPost;
    }

    public void setGuestPost(String guestPost) {
        this.guestPost = guestPost;
    }

    public String getGuestPhone() {
        return guestPhone;
    }

    public void setGuestPhone(String guestPhone) {
        this.guestPhone = guestPhone;
    }
}
