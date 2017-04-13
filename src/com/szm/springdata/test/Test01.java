package com.szm.springdata.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.szm.springdata.dao.PersonDao;
import com.szm.springdata.entity.Person;

import junit.framework.TestCase;

public class Test01 extends TestCase {

	
	public static void main(String[] args) {
		try {
			ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
			PersonDao pd = ctx.getBean(PersonDao.class);
			Person p = pd.getPersonByName("уехЩ");
			System.out.println(p);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
