package scd.fff;

public class Telphone 
{
	String screen;
	float cpu;
	public Telphone() 
	{
		System.out.println("�޲�����������ִ�У�");
	}
	
	public Telphone(String newscreen,float newcpu) 
	{
		screen = newscreen;
		cpu = newcpu;
		System.out.println("�в�����������ִ�У�");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		scd.fff.Telphone phone = new scd.fff.Telphone();
		Telphone phone2 = new Telphone("5.9Ӣ��ȫ����",3.9f);
		System.out.println("screen:"+phone2.screen +'\n'  + "cpuƵ��:"+phone2.cpu);
	}
	
	
}
