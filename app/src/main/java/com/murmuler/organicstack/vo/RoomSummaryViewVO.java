package com.murmuler.organicstack.vo;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

public class RoomSummaryViewVO {
    private int roomId;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private String postType;
    private String title;
    private String sido;
    private String sigungu;
    private String roadname;
    private int periodNum;
    private String periodUnit;
    private String roomType;
    private String rentType;
    private double area;
    private String deposit;
    private String monthlyCost;
    private String manageCost;
    private Date writeDate;
    private int views;
    private String roomImg;
    private List<String> roomOptions;

    public RoomSummaryViewVO() { }

    public RoomSummaryViewVO(int roomId, BigDecimal latitude, BigDecimal longitude, String postType, String title, String sido, String sigungu, String roadname, int periodNum, String periodUnit, String roomType, String rentType, double area, String deposit, String monthlyCost, String manageCost, Date writeDate, int views, String roomImg, List<String> roomOptions) {
        this.roomId = roomId;
        this.latitude = latitude;
        this.longitude = longitude;
        this.postType = postType;
        this.title = title;
        this.sido = sido;
        this.sigungu = sigungu;
        this.roadname = roadname;
        this.periodNum = periodNum;
        this.periodUnit = periodUnit;
        this.roomType = roomType;
        this.rentType = rentType;
        this.area = area;
        this.deposit = deposit;
        this.monthlyCost = monthlyCost;
        this.manageCost = manageCost;
        this.writeDate = writeDate;
        this.views = views;
        this.roomImg = roomImg;
        this.roomOptions = roomOptions;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSido() {
        return sido;
    }

    public void setSido(String sido) {
        this.sido = sido;
    }

    public String getSigungu() {
        return sigungu;
    }

    public void setSigungu(String sigungu) {
        this.sigungu = sigungu;
    }

    public String getRoadname() {
        return roadname;
    }

    public void setRoadname(String roadname) {
        this.roadname = roadname;
    }

    public int getPeriodNum() {
        return periodNum;
    }

    public void setPeriodNum(int periodNum) {
        this.periodNum = periodNum;
    }

    public String getPeriodUnit() {
        return periodUnit;
    }

    public void setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getDeposit() {
        return deposit;
    }

    public void setDeposit(String deposit) {
        this.deposit = deposit;
    }

    public String getMonthlyCost() {
        return monthlyCost;
    }

    public void setMonthlyCost(String monthlyCost) {
        this.monthlyCost = monthlyCost;
    }

    public String getManageCost() {
        return manageCost;
    }

    public void setManageCost(String manageCost) {
        this.manageCost = manageCost;
    }

    public Date getWriteDate() {
        return writeDate;
    }

    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public String getRoomImg() {
        return roomImg;
    }

    public void setRoomImg(String roomImg) {
        this.roomImg = roomImg;
    }

    public List<String> getRoomOptions() {
        return roomOptions;
    }

    public void setRoomOptions(List<String> roomOptions) {
        this.roomOptions = roomOptions;
    }

    @Override
    public String toString() {
        return "RoomSummaryViewVO{" +
                "roomId=" + roomId +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", postType='" + postType + '\'' +
                ", title='" + title + '\'' +
                ", sido='" + sido + '\'' +
                ", sigungu='" + sigungu + '\'' +
                ", roadname='" + roadname + '\'' +
                ", periodNum=" + periodNum +
                ", periodUnit='" + periodUnit + '\'' +
                ", roomType='" + roomType + '\'' +
                ", rentType='" + rentType + '\'' +
                ", area=" + area +
                ", deposit=" + deposit +
                ", monthlyCost=" + monthlyCost +
                ", manageCost=" + manageCost +
                ", writeDate=" + writeDate +
                ", views=" + views +
                ", roomImg='" + roomImg + '\'' +
                ", roomOptions=" + roomOptions +
                '}';
    }
}
