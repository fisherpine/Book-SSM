package com.ggbz.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ServletConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcConfig.class};
    }

    /*WebConfig配置类中主要是内容是启用组件扫描，配置视图解析器，配置静态资源的处理。
    RootConfig配置类加载的是驱动应用后端的中间层和数据层组件，是父上下文。*/
    @Override
    protected String[] getServletMappings() {
        //拦截所有的请求，让所有的请求都走mvc
        return new String[]{"/"};
    }
}
