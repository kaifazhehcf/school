package cn.entity;

import java.time.LocalDateTime;
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
public class Xsattendance implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 考勤id
     */
    private Integer xskqid;

    /**
     * 学生id、
     */
    private Integer xsid;

    /**
     * 签到时间
     */
    private LocalDateTime xskqsignin;

    /**
     * 签退时间
     */
    private LocalDateTime xskqsignback;

    /**
     * 是否旷课（0.1）
     */
    private Integer xskqtruancy;

    /**
     * 是否迟到（0.1）
     */
    private Integer xskqlate;

    /**
     * 是否请假（0.1）
     */
    private Integer xskqleave;


}
