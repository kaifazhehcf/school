package cn.service.impl;

import cn.entity.Testscores;
import cn.mapper.TestscoresMapper;
import cn.service.ITestscoresService;
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
public class TestscoresServiceImpl extends ServiceImpl<TestscoresMapper, Testscores> implements ITestscoresService {

}
