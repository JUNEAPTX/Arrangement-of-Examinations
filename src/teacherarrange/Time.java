package teacherarrange;
import java.util.ArrayList;
import java.util.Random;
public  class Time {
     private  String matchname;
     private String matchsubject;
     private String matchtime;
     public static String []time = {"08:00~10:00","10:20~12:20","13:30~15:30","15:50~17:50"};
     public String only;
     private static int templ;
     private int num;
     
     private static int room_limit = 4;
	 
     public  Time(String matchname,String matchsubject){
    	 Random rnd = new Random();
    	 templ = rnd.nextInt(4);
    	 only = time[templ];
    	 this.setMatchName(matchname);
    	 this.setMatchSubject(matchsubject);
    	 this.setTime();
     }
     
     public void setMatchName(String m) {
    	 this.matchname = m;
     }
     
     public void setMatchSubject(String n) {
     	 this.matchsubject = n;
     }
     
     public String getMatchName(){
    	 return matchname;
     }
     
     public String getMatchSubject(){
    	 return matchsubject;
     }
     
     public int getNum() {
    	 return num;
     }
     
     public void reSetTime() {
    	 
     }
     
     public void setTime() {       //Ϊ����ʱ�丳���
    	 this.matchtime = only;
    	 if(matchtime.equals(time[0]))
    		 num = 0;
    	 else if(matchtime.equals(time[1]))
    		 num = 1;
    	 else if(matchtime.equals(time[2]))
    		 num = 2;
    	 else if(matchtime.equals(time[3]))
    		 num = 3;
     } 
     
     public String getTime() {
    	 return matchtime;
     }
     
     public  static void dupCheck(Time []check) {          //ʱ��β���
    	 ArrayList<Time> time_0 = new ArrayList<Time> ();
    	 ArrayList<Time> time_1 = new ArrayList<Time> ();
    	 ArrayList<Time> time_2 = new ArrayList<Time> ();
    	 ArrayList<Time> time_3 = new ArrayList<Time> ();
    	 ArrayList<Time> timetotal = new ArrayList<Time> ();
    	 for(int i=0;i<check.length;i++)
   	   	   for(int j=0;j<check.length;j++){
   	   		 if(j==i) continue;
else if(check[i].getMatchName().equals(check[j].getMatchName())&check[i].getTime().equals(check[j].getTime()))
   	   		 {             //��ʦ������ͬ��ʱ�����ͬ��ˢ��ʱ�䣬ʱ��θ�ֵ���������
   	   			 check[i].num=check[i].num+1;
   	   				 if(check[i].num>=4)
   	   					 check[i].num=check[i].num-4;
   	   		     check[i].matchtime=time[check[i].num];
   	   		     i--;
   	   		     if(i==-1)
   	   		    	 i=0;
   	   		 }
   	   	
   	   		                                               
   	   		 
   	   	for(i=0;i<check.length;i++)          //��ͬ��Ŀʱ�����ͬ
			for(j=i+1;j<check.length;j++)
			{
				if(check[i].getMatchSubject().equals(check[j].getMatchSubject()))
						check[j].matchtime=time[check[i].num];
			}
   	   		 
   	   		 
   	   		 
   	   		 
   	   		 
   	   		 
   	   	if(check[i].getTime().equals(time[0]))           //&time_0.size()<=room_limit
   	   	{                              //���ArrayList����ͬ��������ӻ򣨺���ͬ���ֵ��γ̲�ͬ����ӣ�
            if(time_0.contains(check[i].getMatchName())==false|(time_0.contains(check[i].getMatchName())&time_0.contains(check[i].getMatchSubject())==false))   
   	   	   time_0.add(check[i]);              //if...contains�ж�Ϊ������ӣ�Ϊ�治ִ�в���
   	   		}
   	   	
   		if(check[i].getTime().equals(time[1]))          //&time_1.size()<=room_limit
   	   		{
   			if(time_1.contains(check[i].getMatchName())==false|(time_1.contains(check[i].getMatchName())&time_1.contains(check[i].getMatchSubject())==false))
   			   time_1.add(check[i]);
   	   		}
   		if(check[i].getTime().equals(time[2]))         //&time_2.size()<=room_limit
   		{
   			if(time_2.contains(check[i].getMatchName())==false|(time_2.contains(check[i].getMatchName())&time_2.contains(check[i].getMatchSubject())==false))
   	   		   time_2.add(check[i]);
   		}
   		if(check[i].getTime().equals(time[3]))        //&time_3.size()<=room_limit
   		{
   			if(time_3.contains(check[i].getMatchName())==false|(time_3.contains(check[i].getMatchName())&time_3.contains(check[i].getMatchSubject())==false))
   			time_3.add(check[i]);
   	   		}
   		
   	   	 }
    	 
    	
    	for(int i=0;i<time_0.size();i++)                    //��4������ϳ�һ�����飬�����Ժ�ʹ�ã���ɾ
    		timetotal.add(time_0.get(i));
    	for(int i=0;i<time_1.size();i++)
    		timetotal.add(time_1.get(i));
    	for(int i=0;i<time_2.size();i++)
    		timetotal.add(time_2.get(i));
    	for(int i=0;i<time_3.size();i++)
    		timetotal.add(time_3.get(i));
    		
   		Time[] timeone = (Time[]) time_0.toArray(new Time[0]);               //ArrayListתΪ��������toArray()
   		Time[] timetwo = (Time[]) time_1.toArray(new Time[0]);  
   		Time[] timethree = (Time[]) time_2.toArray(new Time[0]);  
   		Time[] timefour = (Time[]) time_3.toArray(new Time[0]); 
   		Time[] total = (Time[]) timetotal.toArray(new Time[0]);              //������
   		
   		//return timeone,timetwo,timethree,timefour,total;
     }
}