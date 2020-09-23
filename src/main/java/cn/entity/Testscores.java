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
public class Testscores implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 考试id
     */
    @TableId(value = "ksid", type = IdType.AUTO)
    private Integer ksid;

    /**
     * 学生id
     */
    private Integer xsid;

    /**
     * 考试类型id
     */
    private Integer kslxid;

    /**
     * 成绩
     */
    private Integer ksresults;

    /**
     * 考试开始时间
     */
    private LocalDate ksstarttime;

    /**
     * 考试结束时间
     */
    private LocalDate ksendtime;

    /**
     * 考试是否通过
     */
    private Integer ksthrough;


}
