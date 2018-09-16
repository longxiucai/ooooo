package scd.fff;

public class Telphone 
{
	String screen;
	float cpu;
	public Telphone() 
	{
		System.out.println("无参数构造器已执行！");
	}
	
	public Telphone(String newscreen,float newcpu) 
	{
		screen = newscreen;
		cpu = newcpu;
		System.out.println("有参数构造器已执行！");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		scd.fff.Telphone phone = new scd.fff.Telphone();
		Telphone phone2 = new Telphone("5.9英寸全面屏",3.9f);
		System.out.println("screen:"+phone2.screen +'\n'  + "cpu频率:"+phone2.cpu);
	}
	
	
}
