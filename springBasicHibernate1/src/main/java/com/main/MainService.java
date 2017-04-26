package com.main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Service;

import com.model.Father;
import com.model.Son;

@Service
public class MainService {
	
	@Autowired
	private HibernateTemplate ht;
	
	public HibernateTemplate getHt() {
		return ht;
	}
	
	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		MainService  ms = (MainService)context.getBean("myService");
		Father f = new Father();
		f.setFatherName("HSB");
		Son son = new Son();
		son.setSonName("Harish");
		son.setFather(f);
		List<Son> sons = new ArrayList<Son>();
		sons.add(son);
		f.setSons(sons);
		System.out.println(ms.getHt().save(f));
		//System.out.println(ms.getHt().save(son));
	}
}
