//作用是创建一个 BinaryTeaProperties 的 Bean，并将就绪状态和营业时间绑定到 Bean 的成员上。
package learning.spring.binarytea;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("binarytea")
public class BinaryTeaProperties {
    private boolean ready;
    private String openHours;

    public boolean isReady() {
        return ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public String getOpenHours() {
        return openHours;
    }

    public void setOpenHours(String openHours) {
        this.openHours = openHours;
    }
}
