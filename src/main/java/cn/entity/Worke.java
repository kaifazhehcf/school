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
public class Worke implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 职工id
     */
    @TableId(value = "zgid", type = IdType.AUTO)
    private Integer zgid;

    /**
     * 职工名称
     */
    private String zgname;

    /**
     * 部门id
     */
    private Integer bmid;

    /**
     * 身份证
     */
    private String idcard;

    /**
     * 职工生日
     */
    private LocalDate zgbirthday;

    /**
     * 职工头像
     */
    private String zgportrait;

    /**
     * 职工更新时间
     */
    private LocalDate zgdatupdate;

    /**
     * 职工性别
     */
    private String zggender;

    /**
     * 职工手机号
     */
    private String zgmobilephone;

    /**
     * 地址
     */
    private String address;

    /**
     * 职工邮箱
     */
    private String zgemail;

    /**
     * 职工名族
     */
    private String zgethnic;

    /**
     * 学历id
     */
    private Integer xlid;

    /**
     * 职工籍贯
     */
    private String zgplace;

    /**
     * 专业id
     */
    private Integer zyid;

    /**
     * 职工婚姻
     */
    private String zgmarriage;

    /**
     * 人事id
     */
    private Integer rsid;

    /**
     * 劳动合同（0未签到.1签到）
     */
    private Integer zgcontract;

    /**
     * 职工劳动关系id
     */
    private Integer ldid;

    /**
     * 保险id
     */
    private Integer bxid;

    /**
     * 职工磁卡号
     */
    private String zgcardno;

    /**
     * 职工转正日期
     */
    private LocalDate zgobtainment;

    /**
     * 职工卡号
     */
    private String zgwage;

    /**
     * 职工社保
     */
    private String zgsecurity;

    /**
     * 政治面貌（）
     */
    private String zgpolitical;

    /**
     * 职工是否删除
     */
    private Integer zgsfdelete;


}
