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
public class Subjects implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 科目id
     */
    @TableId(value = "kmid", type = IdType.AUTO)
    private Integer kmid;

    /**
     * 科目名称
     */
    private String kmname;

    /**
     * 科目课数
     */
    private Integer kmlesson;


}
