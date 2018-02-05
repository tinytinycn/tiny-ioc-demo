package cn.tinytiny.context;

import cn.tinytiny.loader.TinyDefaultResouceLoader;
import cn.tinytiny.loader.TinyResourceLoader;

import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 工厂实现类
 */
public class TinyDefaultBeanFactory extends TinyDefaultResouceLoader implements TinyBeanFactory {
    /*容器*/
    private final Map<String, TinyBeanDefinition> beanDefinitionMap = new ConcurrentHashMap<String, TinyBeanDefinition>(256);

    public Object getBean(String name) {
        return null;
    }

    public <T> T getBean(String name, Class<T> c) {
        return null;
    }

    public File getResource(String path) {
        return null;
    }

    public ClassLoader getClassLoader() {
        return null;
    }

    /**
     * 初始化资源解析类
     */
    public void initBeanDefinitionReader(TinyXmlBeanDefinitionReader reader) {

    }

    /**
     * 加载资源解析类, 完成beanDefinition的加载
     */
    public void loadBeanDefinitions(TinyXmlBeanDefinitionReader reader) {

    }
}
