package com.service.xzw;

import io.servicecomb.foundation.common.utils.BeanUtils;
import io.servicecomb.foundation.common.utils.Log4jUtils;

/**
 * <一句话功能简述>
 * <功能详细描述>
 *
 * @author  someCoolGuy
 * @version  [版本号, Dec 1, 2017]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class XzwApplication {
    public static void main(String[] args) throws Exception {
        Log4jUtils.init();
        BeanUtils.init(BeanUtils.DEFAULT_BEAN_RESOURCE, "classpath*:META-INF/spring/*.server.xml");
    }
}
