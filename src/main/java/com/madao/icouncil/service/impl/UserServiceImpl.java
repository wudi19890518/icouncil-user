package com.madao.icouncil.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.madao.icouncil.mapper.UserMapper;
import com.madao.icouncil.model.User;
import com.madao.icouncil.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserServiceImpl  extends ServiceImpl<UserMapper, User>
        implements IUserService {
}
