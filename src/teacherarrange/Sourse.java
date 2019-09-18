package teacherarrange;

public class Sourse {
       
	
	public static void main(String[] args) {
		//int i,j; 
	    //int tem;
		
		//Time []temp = new Time[1];
		
		Teacher []human = {new Teacher("小李","数据通信"),new Teacher("小赵","计算机网络"),
				new Teacher("小钱","计算国际组成原理"),new Teacher("小舜","数值分析"),
				new Teacher("小舜","结构原理"),new Teacher("小周","英语"),
				new Teacher("小无","汇编"),new Teacher("小郑","毛概"),	
				new Teacher("小李","计算机网络"),new Teacher("小赵","高等数学"),
				new Teacher("小钱","人文教育"),new Teacher("小舜","历史"),
				new Teacher("小李","人文教育"),new Teacher("小舜","人文教育")
		};
		
		ViceTeacher []vteacher = {new ViceTeacher("小李"),new ViceTeacher("小李"),
				new ViceTeacher("小赵"),new ViceTeacher("小钱"),
				new ViceTeacher("小舜"),new ViceTeacher("小周"),
				new ViceTeacher("小无"),new ViceTeacher("小郑")};
		
		Time []ctime = new Time[human.length];
		for(int i=0;i<ctime.length;i++) {
		ctime[i] = new Time(human[i].getName(),human[i].getSubject());
		}
		
		//Time.dupCheck(ctime); 
		//Time index;
	    //index = dupCheck(ctime);
			Time.dupCheck(ctime);                  //若名字相同但时段冲突，only（时间）。时间段场次划分，即排后N天考试
			
		    Sort.sort(ctime);                      //按时间段排序以便输出,貌似功能重复
		    
		
		String newr[] = new String[ctime.length];    //副考官新数组     
		ViceTeacher.setNum(vteacher);    //教师名称数组赋对应的个数值  
		newr=ViceTeacher.viceDupCheck(ctime, vteacher);     //副考官添加与查重
	                                                        //ctime[]要换成total[]
		
		Outputer.output(newr);
		
		/*for(i=0;i<ctime.length;i++) {                             //总结果输出函数
		System.out.print("科目："+ctime[i].getMatchSubject()+"   时间："+ctime[i].getTime()+"   主考官："+ctime[i].getMatchName()+"   ");
        System.out.print("副考官："+newr[i]);
        System.out.println();}*/
		
		// TODO Auto-generated method stub
	}
} 
