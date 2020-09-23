package cn.service.impl;

import cn.entity.Jurisdiction;
import cn.mapper.JurisdictionMapper;
import cn.service.IJurisdictionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-09-23
 */
@Service
public class JurisdictionServiceImpl extends ServiceImpl<JurisdictionMapper, Jurisdiction> implements IJurisdictionService {

}
