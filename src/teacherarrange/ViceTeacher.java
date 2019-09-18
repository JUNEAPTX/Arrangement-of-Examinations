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
	


	public static void setNum(ViceTeacher num[]) {      //统计数组元素个数，输入教师名称数组vter[]，按数组元素个数依次赋值0~num.length-1，主函数调用
	   	for(int i=0;i<num.length;i++)
	   	num[i].vnum = i;
	}
	
	public static String[] viceDupCheck(Time ter[],ViceTeacher vter[]){  //副考官添加与查重，产生新数组newr[]，元素个数与总科目数组一致，主函数输出全部数组时输出两个数组（Time[]与newr[]）
		 int temp;                                                       //ter[]接受ctime[]，vter[]接受vteacher
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
