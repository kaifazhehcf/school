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
public class Internship implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实习id
     */
    @TableId(value = "sxid", type = IdType.AUTO)
    private Integer sxid;

    /**
     * 学生id
     */
    private Integer xsid;

    /**
     * 是否成功就业
     */
    private Integer sxemployment;

    /**
     * 实习地点
     */
    private String sxplace;

    /**
     * 实习时长
     */
    private Integer sxthelength;

    /**
     * 实习情况
     */
    private String sxsituation;

    /**
     * 是否删除
     */
    private Integer sxshanchu;

    /**
     * 备注
     */
    private String sxnote;


}
