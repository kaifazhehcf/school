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
public class Week implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 星期id
     */
    @TableId(value = "xqid", type = IdType.AUTO)
    private Integer xqid;

    /**
     * 星期名（星期几）
     */
    private String xqname;


}
