package com.sun.www.service.impl;

import com.sun.www.bean.AccountBean;
import com.sun.www.dao.AccountDAO;
import com.sun.www.service.AccountService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by suny on 2017/7/25.
 */
@Service
public class AccountServiceImpl implements AccountService {

    Logger logger = Logger.getLogger(AccountServiceImpl.class);

    @Autowired
    AccountDAO accountDAO;

    @Override
    public AccountBean getAccount(String accountId) {
        return accountDAO.getAccount(accountId);
    }

    @Override
    public int createAccount(AccountBean accountBean) {
        return 0;
    }

}
