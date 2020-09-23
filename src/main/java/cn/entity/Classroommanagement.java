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
public class Classroommanagement implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 教室id
     */
    @TableId(value = "jsglid", type = IdType.AUTO)
    private Integer jsglid;

    /**
     * 教室楼层
     */
    private String jsglfloor;

    /**
     * 教室房号
     */
    private String jsglroomnumber;

    /**
     * 班级id
     */
    private Integer bjid;

    /**
     * 教室类型id
     */
    private Integer jslxid;

    /**
     * 楼号id
     */
    private Integer lhid;

    /**
     * 设施id
     */
    private Integer ssid;

    /**
     * 默认0
     */
    private Integer jsglstate;


}
