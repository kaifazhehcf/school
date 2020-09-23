package cn.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
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
public class Insurance implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 保险id
     */
    @TableId(value = "bxid", type = IdType.AUTO)
    private Integer bxid;

    /**
     * 是否购买（0.1）
     */
    private Integer bxbuy;

    /**
     * 购买的产品名称
     */
    private String bxname;

    /**
     * 购买时间
     */
    private LocalDate bxbuytime;

    /**
     * 到期时间
     */
    private LocalDate bxduetime;


}
