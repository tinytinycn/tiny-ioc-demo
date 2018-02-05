import cn.tinytiny.beans.TinyBean;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIOC {
    @Test
    public void testIOC(){
        ClassPathXmlApplicationContext cpxac = new ClassPathXmlApplicationContext("spring-config.xml");
        TinyBean tinyBean = cpxac.getBean("tinyBean", TinyBean.class);

    }
}
