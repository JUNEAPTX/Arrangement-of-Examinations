package teacherarrange;

public class Select_teacher {        //��ĳһ��ʦΪ��λ�������������ʦ�Ŀ����г�
                                     
	public static Time[] Select(Time all[]) {     //all[]����total[]
		int count=0;
		int count2=0;
		Time temp[] = new Time[1]; 
		for(int i=0;i<all.length;i++)
			for(int j=i+1;j<all.length;j++)
			{
				if(all[i].getMatchName().equals(all[j].getMatchName()))
				{
					//Time temp[] = new Time[1]; 
					temp[0]=all[j];
					all[j]=all[i+1];
					all[i+1]=temp[0];
					count++;
				}
				i+=count;                 //ʹall[]�жϴ�all[i]֮��count�Ŀ�ʼ
			}
		
		 //Sort.sort(all);
		
		for(int i=0;i<all.length-1;i++)                     //���ѭ������������������ʱ������
			for(int j=0;j<all.length-1-i;j++)               //�ڲ�ѭ������ÿһ��������ٴ�
				{
					if(all[j].getMatchName().equals(all[i].getMatchName()))
						count2++;
			if(all[j].getTime().compareTo(all[j+1].getTime())>=0)
			{
			temp[0]=all[j];
			all[j]=all[j+1];
			all[j+1]=temp[0];                             //������@
			}
			   i+=count2;
			   count2-=count2;
				}
				
		        	
		
		
				return all;      
	}  //select_end
	
}
