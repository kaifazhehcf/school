package cn.service.impl;

import cn.entity.Management;
import cn.mapper.ManagementMapper;
import cn.service.IManagementService;
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
public class ManagementServiceImpl extends ServiceImpl<ManagementMapper, Management> implements IManagementService {

}
