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
public class Credits implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 学分id
     */
    @TableId(value = "xfid", type = IdType.AUTO)
    private Integer xfid;

    /**
     * 学生id
     */
    private Integer xsid;

    /**
     * 考试成绩id（成绩计算学分）
     */
    private Integer ksid;

    /**
     * 学生考勤id（迟到计算学分）
     */
    private Integer xskqid;

    /**
     * 学分
     */
    private Integer xfcredits;


}
