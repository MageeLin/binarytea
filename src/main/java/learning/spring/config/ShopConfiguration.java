// 配置类
//这个配置类生效的条件是 binarytea.ready 属性的值为 true，也就是店铺已经准备就绪了，除此之外
//的值或者不存在该属性时 ShopConfiguration 都不会生效。
package learning.spring.config;

import learning.spring.binarytea.BinaryTeaProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(BinaryTeaProperties.class)
@ConditionalOnProperty(name = "binarytea.ready", havingValue = "true")
public class ShopConfiguration {
}
