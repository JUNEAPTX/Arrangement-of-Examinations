package teacherarrange;

public class Sourse {
       
	
	public static void main(String[] args) {
		//int i,j; 
	    //int tem;
		
		//Time []temp = new Time[1];
		
		Teacher []human = {new Teacher("С��","����ͨ��"),new Teacher("С��","���������"),
				new Teacher("СǮ","����������ԭ��"),new Teacher("С˴","��ֵ����"),
				new Teacher("С˴","�ṹԭ��"),new Teacher("С��","Ӣ��"),
				new Teacher("С��","���"),new Teacher("С֣","ë��"),	
				new Teacher("С��","���������"),new Teacher("С��","�ߵ���ѧ"),
				new Teacher("СǮ","���Ľ���"),new Teacher("С˴","��ʷ"),
				new Teacher("С��","���Ľ���"),new Teacher("С˴","���Ľ���")
		};
		
		ViceTeacher []vteacher = {new ViceTeacher("С��"),new ViceTeacher("С��"),
				new ViceTeacher("С��"),new ViceTeacher("СǮ"),
				new ViceTeacher("С˴"),new ViceTeacher("С��"),
				new ViceTeacher("С��"),new ViceTeacher("С֣")};
		
		Time []ctime = new Time[human.length];
		for(int i=0;i<ctime.length;i++) {
		ctime[i] = new Time(human[i].getName(),human[i].getSubject());
		}
		
		//Time.dupCheck(ctime); 
		//Time index;
	    //index = dupCheck(ctime);
			Time.dupCheck(ctime);                  //��������ͬ��ʱ�γ�ͻ��only��ʱ�䣩��ʱ��γ��λ��֣����ź�N�쿼��
			
		    Sort.sort(ctime);                      //��ʱ��������Ա����,ò�ƹ����ظ�
		    
		
		String newr[] = new String[ctime.length];    //������������     
		ViceTeacher.setNum(vteacher);    //��ʦ�������鸳��Ӧ�ĸ���ֵ  
		newr=ViceTeacher.viceDupCheck(ctime, vteacher);     //��������������
	                                                        //ctime[]Ҫ����total[]
		
		Outputer.output(newr);
		
		/*for(i=0;i<ctime.length;i++) {                             //�ܽ���������
		System.out.print("��Ŀ��"+ctime[i].getMatchSubject()+"   ʱ�䣺"+ctime[i].getTime()+"   �����٣�"+ctime[i].getMatchName()+"   ");
        System.out.print("�����٣�"+newr[i]);
        System.out.println();}*/
		
		// TODO Auto-generated method stub
	}
} 
