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
public class Graduation implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 毕业id
     */
    @TableId(value = "byid", type = IdType.AUTO)
    private Integer byid;

    /**
     * 属性名称
     */
    private String byattributename;

    /**
     * 状态（0未毕业1毕业2学分不够）
     */
    private Integer bystate;

    /**
     * 就业率
     */
    private String byemployment;

    /**
     * 是否删除（0.1）
     */
    private Integer byshanchu;

    /**
     * 备注
     */
    private String bynote;


}
