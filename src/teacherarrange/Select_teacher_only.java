package teacherarrange;
import java.util.Scanner;
import java.util.ArrayList;
public class Select_teacher_only {      //����ĳһ��ʦ��ȫ���γ̣�tchoose[]����timetotal[]��name��������ҵ���ʦ

	public static Time[] select_only(Time tchoose[],String name) {  //����ArrayList��toArray()���������
		//Time teacher_only[] = new Time[tchoose.length];
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in); 
		System.out.print("���������ѯ�Ľ�ʦ���ƣ�");
	    name = sc.nextLine(); 
		System.out.println();
		
		ArrayList<Time> tonly = new ArrayList<Time> ();

		for(int i=0;i<tchoose.length;i++)
		if(tchoose[i].getMatchName().equals(name))
	       tonly.add(tchoose[i]);             
			
		Time[] tperson = (Time[]) tonly.toArray(new Time[0]);
		 
		return tperson;
	}//only_end             
}
