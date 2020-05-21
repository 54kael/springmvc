package com.kael.javaconfigssm.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/* Servlet3.0容器中的时候，容器会自动发现他，并用它来配置Servlet上下文 */
public class AppInitializerConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

    /* 另一个上下文，他是由ContextLoaderListener创建的，加载应用中的其他bean，即RootConfig来实现 */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{RootConfig.class};
    }

    /* 创建Spring应用的上下文，并加载配置文件或配置类中的所有生命的bean，加载我们在WebConfig中的配置bean */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{ServletConfig.class};
    }

    /* servlet映射路径 */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
