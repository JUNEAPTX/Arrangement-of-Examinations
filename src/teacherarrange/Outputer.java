package teacherarrange;
import java.util.ArrayList;


public class Outputer {

	public static void output(String newr_temp[]) {
		int count=0;
		int times=0;     //�ڼ����������
		/*String newr[] = new String[ctime.length];    //������������
		ViceTeacher.setNum(vteacher);    //��ʦ�������鸳��Ӧ�ĸ���ֵ
		newr=ViceTeacher.viceDupCheck(ctime, vteacher);     //��������������*/
	    
		for(;count<4;)
		{           //day one
			int day=1;
			if(day == 1)
			System.out.println("��"+day+"�죺");
			
System.out.print("��Ŀ��"+timeone[count+4*times].getMatchSubject()+"   ʱ�䣺"+timeone[count+4*times].getTime()+"   �����٣�"+timeone[count+4*times].getMatchName());         //�����ʱ����Ϣ
                System.out.print("�����٣�"+newr_temp[count+4*times]);        //����count����
                System.out.println();
			count++;
			
		if(count==4)
			{
			times++;
			System.out.println();
			System.out.println("��"+day+1+"�죺");
			count-=4;                    //count++ ???
			}
		}         //dayone_end
		
		          //daytwo_start
		
		          //daythree_start
		
		          //dayfour_start

		}    //output-end
	
		
		
	}
