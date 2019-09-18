package teacherarrange;
import java.util.Scanner;
import java.util.ArrayList;
public class Select_teacher_only {      //返回某一老师的全部课程，tchoose[]接受timetotal[]，name接受想查找的老师

	public static Time[] select_only(Time tchoose[],String name) {  //可用ArrayList，toArray()输出该数组
		//Time teacher_only[] = new Time[tchoose.length];
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in); 
		System.out.print("请输入想查询的教师名称：");
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
