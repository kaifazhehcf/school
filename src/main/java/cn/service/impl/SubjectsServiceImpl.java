package cn.service.impl;

import cn.entity.Subjects;
import cn.mapper.SubjectsMapper;
import cn.service.ISubjectsService;
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
public class SubjectsServiceImpl extends ServiceImpl<SubjectsMapper, Subjects> implements ISubjectsService {

}
