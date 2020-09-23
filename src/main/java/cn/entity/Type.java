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
public class Type implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 教室类型id
     */
    @TableId(value = "jslxid", type = IdType.AUTO)
    private Integer jslxid;

    /**
     * 教室类型大小（大或者小）
     */
    private String jslxtype;

    /**
     * 教室座位数量
     */
    private Integer jslxnumber;


}
