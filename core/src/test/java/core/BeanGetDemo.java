package core;

import model.Person;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BeanGetDemo {
    @Test
    public void beanFetch() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring-config.xml");
        Person person = (Person)beanFactory.getBean("person");
        assertThat(person.getName(), is("jd"));
    }
}
