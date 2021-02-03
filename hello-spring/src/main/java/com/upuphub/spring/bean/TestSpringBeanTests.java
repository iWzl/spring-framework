package com.upuphub.spring.bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * TestSpringBean
 *
 * @author Inspiration S.P.A Leo
 * @date create time 2021-02-03 23:48
 **/
public class TestSpringBeanTests {
	public static void main(String[] args) {
		BeanFactory beanFactory =new DefaultListableBeanFactory();
		BeanDefinitionReader beanDefinitionReader =new XmlBeanDefinitionReader((BeanDefinitionRegistry) beanFactory);
		beanDefinitionReader.loadBeanDefinitions(new ClassPathResource("bean/beans-spring.xml"));
		TestSpringBean testSpringBean = (TestSpringBean) beanFactory.getBean("testSpringBean");
		System.out.println(testSpringBean.getName());
	}
}
