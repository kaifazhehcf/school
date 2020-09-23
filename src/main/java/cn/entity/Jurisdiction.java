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
public class Jurisdiction implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 身份
     */
    private String identity;


}
