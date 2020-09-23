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
public class Students implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 学生id
     */
    @TableId(value = "xsid", type = IdType.AUTO)
    private Integer xsid;

    /**
     * 学生姓名
     */
    private String xsname;

    /**
     * 学生学分
     */
    private String xscredit;

    /**
     * 学生学习专业id
     */
    private Integer xxid;

    /**
     * 学生性别
     */
    private String xsgender;

    /**
     * 学生头像
     */
    private String xsportrait;

    /**
     * 学生生日
     */
    private LocalDate xsbirthday;

    /**
     * 身份证
     */
    private String xsidentity;

    /**
     * 学生地址
     */
    private String xssite;

    /**
     * 学生籍贯
     */
    private String xsplace;

    /**
     * 学生民族
     */
    private String mzethnic;

    /**
     * 学生专业id
     */
    private Integer zyid;

    /**
     * 学生年级id
     */
    private Integer njid;

    /**
     * 学生班级
     */
    private Integer bjid;

    /**
     * 学生学历id
     */
    private Integer xlid;

    /**
     * 学生手机号
     */
    private String xsmobilephon;

    /**
     * 学生家长id
     */
    private Integer jzid;

    /**
     * 学生磁卡号
     */
    private Integer xscard;

    /**
     * 是否删除（1,0）
     */
    private Integer xsxsdelete;

    /**
     * 学生保险id
     */
    private Integer bxid;


}
