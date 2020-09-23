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
public class Homework implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 作业id
     */
    @TableId(value = "zybid", type = IdType.AUTO)
    private Integer zybid;

    /**
     * 班级id
     */
    private Integer bjid;

    /**
     * 学生id
     */
    private Integer xsid;

    /**
     * 完成率
     */
    private String zybcompletion;

    /**
     * 批改时间（获取当前时间）
     */
    private LocalDate zybcorrectingtime;

    /**
     * 备注信息
     */
    private String zybnote;


}
