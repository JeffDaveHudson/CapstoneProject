package view;

import connection.HibernateProvider;

public class Demo {
	public static void main(String[] args) {
		System.out.println("---"+HibernateProvider.getSessionFactory());
	}
}
