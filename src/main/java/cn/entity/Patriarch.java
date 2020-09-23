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
public class Patriarch implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 家长id
     */
    @TableId(value = "jzid", type = IdType.AUTO)
    private Integer jzid;

    /**
     * 家长姓名
     */
    private String jzname;

    /**
     * 家长关系
     */
    private String jzrelation;

    /**
     * 家长联系电话
     */
    private String jzphone;


}
