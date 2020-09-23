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
public class Building implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 楼号id
     */
    @TableId(value = "lhid", type = IdType.AUTO)
    private Integer lhid;

    /**
     * 楼号名称
     */
    private String lhname;


}
