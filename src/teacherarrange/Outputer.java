package teacherarrange;
import java.util.ArrayList;


public class Outputer {

	public static void output(String newr_temp[]) {
		int count=0;
		int times=0;     //第几次输出数组
		/*String newr[] = new String[ctime.length];    //副考官新数组
		ViceTeacher.setNum(vteacher);    //教师名称数组赋对应的个数值
		newr=ViceTeacher.viceDupCheck(ctime, vteacher);     //副考官添加与查重*/
	    
		for(;count<4;)
		{           //day one
			int day=1;
			if(day == 1)
			System.out.println("第"+day+"天：");
			
System.out.print("科目："+timeone[count+4*times].getMatchSubject()+"   时间："+timeone[count+4*times].getTime()+"   主考官："+timeone[count+4*times].getMatchName());         //输出该时段信息
                System.out.print("副考官："+newr_temp[count+4*times]);        //上面count存疑
                System.out.println();
			count++;
			
		if(count==4)
			{
			times++;
			System.out.println();
			System.out.println("第"+day+1+"天：");
			count-=4;                    //count++ ???
			}
		}         //dayone_end
		
		          //daytwo_start
		
		          //daythree_start
		
		          //dayfour_start

		}    //output-end
	
		
		
	}
