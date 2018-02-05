package cn.tinytiny.context;

public interface TinyBeanFactory {
    Object getBean(String name);

    <T> T getBean(String name, Class<T> c);
}
