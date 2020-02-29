package com.fangjie.springcloud.api.bean;

import java.io.Serializable;

/**
 * @author fangjie
 * @Description: 部门Bean
 * @date 2020/2/23 16:14
 */
public class Dept implements Serializable {

    private static final long serialVersionUID = -1555039872651941709L;

    /**
     * 部门ID
     */
    private Long deptId;
    /**
     * 部门名称
     */
    private String deptName;

    public Dept() {
    }

    public Dept(Long deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"deptId\":")
                .append(deptId);
        sb.append(",\"deptName\":\"")
                .append(deptName).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
