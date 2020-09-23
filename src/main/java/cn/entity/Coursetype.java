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
public class Coursetype implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 课程类型id
     */
    @TableId(value = "kclxid", type = IdType.AUTO)
    private Integer kclxid;

    /**
     * 课程名
     */
    private String kclxname;


}
