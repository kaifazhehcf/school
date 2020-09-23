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
public class Professionalcourse implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 课程专业id
     */
    @TableId(value = "kczyid", type = IdType.AUTO)
    private Integer kczyid;

    /**
     * 专业id、
     */
    private Integer zyid;

    /**
     * 课程id
     */
    private Integer kclxid;

    /**
     * 课程专业学分
     */
    private Integer kczycredits;


}
