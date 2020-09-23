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
public class Facilities implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 设施id
     */
    @TableId(value = "ssid", type = IdType.AUTO)
    private Integer ssid;

    /**
     * 设施名称
     */
    private String ssname;

    /**
     * 设施数量
     */
    private Integer ssnumber;

    /**
     * 维修申请
     */
    private String ssmaintenance;


}
