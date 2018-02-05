package cn.tinytiny.loader;

import java.io.File;

/**
 * 资源加载实现类
 */
public class TinyDefaultResouceLoader implements TinyResourceLoader {
    /*类加载器*/
    private ClassLoader classLoader;

    /*获取路径下的资源文件*/
    public File getResource(String path) {
        return null;
    }

    public ClassLoader getClassLoader() {
        return null;
    }
}
