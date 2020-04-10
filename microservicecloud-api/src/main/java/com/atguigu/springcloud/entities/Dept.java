package com.atguigu.springcloud.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * Created by Spike on 2020/4/8.
 */
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Dept implements Serializable{
    private static final long serialVersionUID = -7483840657981626637L;

    private Long  deptno;   //主键
    private String  dname;   //部门名称
    private String  db_source;//来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库

    public Dept(String dname) {
        this.dname = dname;
    }

    public static void main(String[] args) {
        Dept dept = new Dept("abc");
        System.out.println(dept);
    }
}
