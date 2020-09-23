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
public class Personnel implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 人事id
     */
    @TableId(value = "rsid", type = IdType.AUTO)
    private Integer rsid;

    /**
     * 人事状态
     */
    private String rstatepersonnel;


}
