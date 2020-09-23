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
public class Labor implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 劳动id
     */
    @TableId(value = "ldid", type = IdType.AUTO)
    private Integer ldid;

    /**
     * 劳动状态
     */
    private String ldstate;


}
