package teacherarrange;
import java.util.Random;
public class ViceTeacher {
	private String vname;
	private String vsubject;
	private int vnum;
	//private int tem;
	
	public ViceTeacher(String vname){
		this.setName(vname);
	}
	
	public void setName(String m)
	{this.vname = m;}
	
	public void setSubject(String n) {
		this.vsubject = n;
	}
	
	public String getVname()
	{return vname;}
	
	public int getVnum() {
		return vnum;
	}
	
	public String getVsubject() {
		return vsubject;
	}
	


	public static void setNum(ViceTeacher num[]) {      //ͳ������Ԫ�ظ����������ʦ��������vter[]��������Ԫ�ظ������θ�ֵ0~num.length-1������������
	   	for(int i=0;i<num.length;i++)
	   	num[i].vnum = i;
	}
	
	public static String[] viceDupCheck(Time ter[],ViceTeacher vter[]){  //�������������أ�����������newr[]��Ԫ�ظ������ܿ�Ŀ����һ�£����������ȫ������ʱ����������飨Time[]��newr[]��
		 int temp;                                                       //ter[]����ctime[]��vter[]����vteacher
		 String newr[] = new String[ter.length];
		 //String sub[] = new String[ter.length];
		 /*for(count=0;count<ter.length;count++)                 //@
			 sub[count] = ter[count].getMatchSubject();    */    //@
		 Random rnd = new Random();
		 for(int i=0;i<ter.length;i++) {
    	 temp = rnd.nextInt(vter.length);
		 newr[i] = vter[temp].getVname();
		// newr[i] = vter[temp].getVsubject();                   //@
		 if(newr[i].equals(ter[i].getMatchName())) {   //@   ||sub[i].equals(ter[i])
			// temp = rnd.nextInt(vter.length);
			// newr[i] = vter[temp].getVname();
			 i--;
		 }
	   }
		 return newr;
	}
	}
