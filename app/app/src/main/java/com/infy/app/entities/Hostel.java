package com.infy.app.entities;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="HOSTEL")
public class Hostel {

	@Id
    @Column(name="HOSTEL_NAME")
	private String hostelName;
    @Column(name="USER_ID")
	private String userId;
    @Column(name="HOSTEL_CATEGORY")
	private String hostelCategory;
    @Column(name="LOCATION")
    private String location;
    @Column(name="CONTACT_NO")
    private long contactNo;
    @Column(name="TWO_SHARE")
    private int twoShare;
    @Column(name="TWO_SHARE_AC")
    private int twoShareAc;
    @Column(name="THREE_SHARE")
    private int threeShare;
    @Column(name="THREE_SHARE_AC")
    private int threeShareAc;
    @Column(name="FOUR_SHARE")
    private int fourShare;
    @Column(name="FOUR_SHARE_AC")
    private int fourShareAc;
    public int getTwoShare() {
		return twoShare;
	}
	public void setTwoShare(int twoShare) {
		this.twoShare = twoShare;
	}
	public int getTwoShareAc() {
		return twoShareAc;
	}
	public void setTwoShareAc(int twoShareAc) {
		this.twoShareAc = twoShareAc;
	}
	public int getThreeShare() {
		return threeShare;
	}
	public void setThreeShare(int threeShare) {
		this.threeShare = threeShare;
	}
	public int getThreeShareAc() {
		return threeShareAc;
	}
	public void setThreeShareAc(int threeShareAc) {
		this.threeShareAc = threeShareAc;
	}
	public int getFourShare() {
		return fourShare;
	}
	public void setFourShare(int fourShare) {
		this.fourShare = fourShare;
	}
	public int getFourShareAc() {
		return fourShareAc;
	}
	public void setFourShareAc(int fourShareAc) {
		this.fourShareAc = fourShareAc;
	}

	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getHostelName() {
		return hostelName;
	}
	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getHostelCategory() {
		return hostelCategory;
	}
	public void setHostelCategory(String hostelCategory) {
		this.hostelCategory = hostelCategory;
	}
}
