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
public class Classstatus implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 班级状态id、
     */
    @TableId(value = "bjztid", type = IdType.AUTO)
    private Integer bjztid;

    /**
     * 班级状态（上课，毕业，停课，等等）
     */
    private String bjztstatus;


}
