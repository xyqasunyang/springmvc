package com.sun.www.dao;


import com.sun.www.bean.AccountBean;

/**
 * Created by suny on 2017/7/25.
 */
public interface AccountDAO {

    AccountBean getAccount(String accountId);

    int createAccount(AccountBean accountBean);

    AccountBean getAccountByLicenseNum(String licenseNumber);
}
