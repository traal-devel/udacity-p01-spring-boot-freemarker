

# Learning

With spring boot 2.2.0 and freemaker the followig bean has to be apparently 
defined:

```java
  @Bean 
  public FreeMarkerViewResolver freemarkerViewResolver() { 
    FreeMarkerViewResolver resolver = new FreeMarkerViewResolver(); 
    resolver.setCache(true); 
    resolver.setPrefix(""); 
    resolver.setSuffix(".ftl"); 
    return resolver; 
  }
``` 