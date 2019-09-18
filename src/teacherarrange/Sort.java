package teacherarrange;

public class Sort {
	
	public static void sort(Time ctime[]) {
		int i,j;
		Time []temp = new Time[1];
		for(i=0;i<ctime.length-1;i++){                     //外层循环控制排序趟数，按时间排序
			for(j=0;j<ctime.length-1-i;j++){               //内层循环控制每一趟排序多少次
			if(ctime[j].getTime().compareTo(ctime[j+1].getTime())>=0){
			temp[0]=ctime[j];
			ctime[j]=ctime[j+1];
			ctime[j+1]=temp[0];}}}
	}
}
