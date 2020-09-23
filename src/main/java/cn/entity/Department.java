package cn.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2020-09-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Department implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 部门id
     */
    @TableId(value = "bmid", type = IdType.AUTO)
    private Integer bmid;

    /**
     * 部门名称
     */
    private String bmname;

    /**
     * 部门负责人（职工id）
     */
    private String bmhead;

    /**
     * 部门人数
     */
    private Integer bmnumber;

    /**
     * 部门介绍
     */
    private String bmintroduce;


}
