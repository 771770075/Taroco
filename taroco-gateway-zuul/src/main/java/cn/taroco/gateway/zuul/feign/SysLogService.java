package cn.taroco.gateway.zuul.feign;

import cn.taroco.common.constants.ServiceNameConst;
import cn.taroco.common.entity.SysLog;
import cn.taroco.gateway.zuul.feign.fallback.SysLogServiceFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 系统日志Service
 *
 * @author liuht
 * @date 2018/9/13 17:06
 */
@FeignClient(name = ServiceNameConst.RBAC_SERVICE, fallbackFactory = SysLogServiceFallbackFactory.class)
public interface SysLogService {

    /**
     * 添加日志
     *
     * @param log 日志实体
     */
    @PostMapping("/log")
    void add(@RequestBody SysLog log);
}
