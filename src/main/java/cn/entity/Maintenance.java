package cn.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
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
public class Maintenance implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 维修id
     */
    @TableId(value = "wxid", type = IdType.AUTO)
    private Integer wxid;

    /**
     * 维系名称
     */
    private String wxname;

    /**
     * 维修时间（获取当前时间）
     */
    private LocalDate wxmaintenancetime;

    /**
     * 维修职工id
     */
    private Integer zgid;

    /**
     * 维修数量
     */
    private Integer wxnumber;

    /**
     * 备注信息
     */
    private String wxnote;


}
