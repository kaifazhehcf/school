package cn.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class Xsleave implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 学生请假id
     */
    @TableId(value = "xsqjid", type = IdType.AUTO)
    private Integer xsqjid;

    /**
     * 学生id
     */
    private Integer xsid;

    /**
     * 学生请假原因
     */
    private String xsqjwhy;

    /**
     * 家长是否同意（0.1）
     */
    private Integer xsqjparentsagree;

    /**
     * 学生请假时长
     */
    private Integer xsqjlenth;

    /**
     * 学生请假当前时间
     */
    private LocalDateTime xsqjcurrenttime;


}
