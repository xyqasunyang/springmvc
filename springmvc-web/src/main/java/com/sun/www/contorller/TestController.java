package com.sun.www.contorller;

import com.sun.www.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by suny on 2017/7/27.
 */
@Controller
public class TestController {

    @Autowired
    AccountService accountService;

    @RequestMapping("/a.do")
    public void test(){
        System.out.println(accountService.getAccount("0664CDC2FDB04E57A250F17F42D478A3"));
    }
}
