package com.yrdomain.ch07;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ���","����",10);
		
		System.out.println("�� :"+ dmbCellPhone.model);
		System.out.println("���� :"+ dmbCellPhone.color);
		
		System.out.println("ä�� :"+ dmbCellPhone.channel);
		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("�ȳ��ϼ���! ���� ȫ�浿�ε���");
		dmbCellPhone.receiveVoice("�� �� �ݰ����ϴ�");
		dmbCellPhone.hangUp();
		
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}

}
