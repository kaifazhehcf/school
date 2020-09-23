package cn.entity;

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
public class Lesson implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 节数id
     */
    private Integer jsid;

    /**
     * 节数名
     */
    private String jsname;


}
