package teacherarrange;

public class Select_teacher {        //以某一老师为单位，扎堆输出各老师的考试行程
                                     
	public static Time[] Select(Time all[]) {     //all[]接受total[]
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
				i+=count;                 //使all[]判断从all[i]之后count的开始
			}
		
		 //Sort.sort(all);
		
		for(int i=0;i<all.length-1;i++)                     //外层循环控制排序趟数，按时间排序
			for(int j=0;j<all.length-1-i;j++)               //内层循环控制每一趟排序多少次
				{
					if(all[j].getMatchName().equals(all[i].getMatchName()))
						count2++;
			if(all[j].getTime().compareTo(all[j+1].getTime())>=0)
			{
			temp[0]=all[j];
			all[j]=all[j+1];
			all[j+1]=temp[0];                             //有问题@
			}
			   i+=count2;
			   count2-=count2;
				}
				
		        	
		
		
				return all;      
	}  //select_end
	
}
