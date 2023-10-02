package Inheritance;
// Demo for Multilevel inheritance
public class WhatsApp 
{
	public static void main(String[] args)
	{
		WhatsAppV3 wh3=new WhatsAppV3();
		wh3.Testmsg();
		wh3.AudioCalling();
		wh3.Videocalling();
		//create an obj for whatsappv2
		WhatsAppV2 v2=new WhatsAppV2();
		v2.Testmsg();
		v2.AudioCalling();
	
	}

}
