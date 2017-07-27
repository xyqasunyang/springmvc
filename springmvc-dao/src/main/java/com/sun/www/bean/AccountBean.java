package com.sun.www.bean;

/**
 * Created by suny on 2017/7/24.
 */
public class AccountBean extends BaseBean{

    private String id;

    private String accountId;

    private String name;

    private String licenseNumber;

    private Integer licenseType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public Integer getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(Integer licenseType) {
        this.licenseType = licenseType;
    }

    @Override
    public String toString() {
        return "AccountBean{" +
                "id='" + id + '\'' +
                ", accountId='" + accountId + '\'' +
                ", name='" + name + '\'' +
                ", licenseNumber='" + licenseNumber + '\'' +
                ", licenseType=" + licenseType +
                '}';
    }
}
