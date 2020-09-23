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
public class Health implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 健康id
     */
    @TableId(value = "jkid", type = IdType.AUTO)
    private Integer jkid;

    /**
     * 学生id
     */
    private Integer xsid;

    /**
     * 是否外宿（0.1）
     */
    private Integer jksleepover;

    /**
     * 交通方式
     */
    private String jktraffic;

    /**
     * 检查时间（获取当前时间）
     */
    private LocalDate jkchecktime;

    /**
     * 体温
     */
    private String jktemperature;

    /**
     * 是否有不良症状（0.1）
     */
    private Integer jksymptoms;


}
