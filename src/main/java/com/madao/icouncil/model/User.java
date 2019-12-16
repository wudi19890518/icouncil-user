package com.madao.icouncil.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("t_icouncil_user")
public class User implements Serializable {

    @TableField("id")
    private Integer id;


    @TableId(type = IdType.ID_WORKER)
    @TableField("user_id")
    private Long userId;

    /**
     * 用户名
     */
    @TableField("user_name")
    private String username;

    /**
     * 密码
     */
    @TableField("password")
    private String password;
}
