package cn.tinytiny.loader;

import java.io.File;

public interface TinyResourceLoader {
    File getResource(String path);

    ClassLoader getClassLoader();
}
