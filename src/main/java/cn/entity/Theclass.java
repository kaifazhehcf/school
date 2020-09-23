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
public class Theclass implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 班级id
     */
    @TableId(value = "bjid", type = IdType.AUTO)
    private Integer bjid;

    /**
     * 班级名
     */
    private String bjname;

    /**
     * 职工id(负责的老师)
     */
    private Integer zgid;

    /**
     * 开班日期
     */
    private LocalDate datecommencement;

    /**
     * 班长
     */
    private String monitor;

    /**
     * 班级状态id
     */
    private Integer bjztid;


}
