package cn.bdqn.service.impl;

import cn.bdqn.domain.Account;
import cn.bdqn.mapper.AccountMapper;
import cn.bdqn.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;


    // 查询全部账号
    public List<Account> queryAll() {
        System.out.println("查询全部账号");
        return accountMapper.selectAll();


    }

    // 保存账号
    public void save(Account account) {
        System.out.println("保存账号");
    }
}
