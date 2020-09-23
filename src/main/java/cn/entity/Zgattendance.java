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
public class Zgattendance implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 考勤id
     */
    private Integer zgkqid;

    /**
     * 职工id
     */
    private Integer zgid;

    /**
     * 签到时间
     */
    private LocalDateTime zgkqsignin;

    /**
     * 签退时间
     */
    private LocalDateTime zgkqsignback;


}
