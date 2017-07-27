package com.sun.www.service;


import com.sun.www.bean.AccountBean;

/**
 * Created by suny on 2017/7/25.
 */
public interface AccountService {
    AccountBean getAccount(String accountId);

    int createAccount(AccountBean accountBean);
}
