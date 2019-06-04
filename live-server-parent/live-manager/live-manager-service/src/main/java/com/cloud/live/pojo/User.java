package com.cloud.live.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_user")
@Getter
@Setter
public class User implements Serializable {
    @TableId("id")
    private String id;
    @TableField("user_name")
    private String userName;
    @TableField("password")
    private String password;
    @TableField("full_name")
    private String fullName;
    @TableField("create_time")
    private Date createTime;

}
