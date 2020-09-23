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
public class Education implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 学历id
     */
    @TableId(value = "xlid", type = IdType.AUTO)
    private Integer xlid;

    /**
     * 学历选择
     */
    private String xlselect;


}
