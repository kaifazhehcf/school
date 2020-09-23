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
public class Management implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 职工管理
     */
    @TableId(value = "glid", type = IdType.AUTO)
    private Integer glid;

    /**
     * 职工id
     */
    private Integer zgid;

    /**
     * 职位表id
     */
    private Integer zwid;


}
