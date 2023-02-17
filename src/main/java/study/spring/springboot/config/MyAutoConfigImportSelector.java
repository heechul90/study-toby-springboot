package study.spring.springboot.config;

import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyAutoConfigImportSelector implements DeferredImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[] {
                "study.spring.springboot.config.DispatcherServletConfig",
                "study.spring.springboot.config.TomcatWebServerConfig"
        };
    }
}
