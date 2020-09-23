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
public class Zgleave implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 职工请假id
     */
    @TableId(value = "zgqjid", type = IdType.AUTO)
    private Integer zgqjid;

    /**
     * 部门id
     */
    private Integer bmid;

    /**
     * 请假标题
     */
    private String zgqjtitle;

    /**
     * 详细原因
     */
    private String zgqjdetailed;

    /**
     * 是否带薪休假（0.1）
     */
    private Integer zgqjvacation;

    /**
     * 部门负责人审批（0.1）
     */
    private Integer zgqjexamination;

    /**
     * 是否同意请假成功（0.1）
     */
    private Integer zgqjagree;

    /**
     * 职工id
     */
    private Integer zgid;


}
