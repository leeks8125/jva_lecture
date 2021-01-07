package com.yrdomain.ch06;
import java.lang.reflect.Method;
import java.security.Provider.Service;
public class PrintAnnotationExample {

	public static void main(String[] args) {
		//Service Ŭ�����κ��� �޼ҵ� ������ ����
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		
		//Method ��ü�� �ϳ��� ó��
		for(Method method : declaredMethods) {
			//PrintAnnotation�� ����ƴ��� Ȯ��
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
				
				
				//�޼ҵ� �̸� ���
				System.out.println("["+method.getName()+"]");
				//���м� ���
				for(int i =0; i <printAnnotation.number(); i++) {
					System.out.print(printAnnotation.value());
				}
				System.out.println();
				
				try {
					//�޼ҵ� ȣ��
					method.invoke(new Service());
				} catch (Exception e) {}
				System.out.println();
			}
		}

	}

}
