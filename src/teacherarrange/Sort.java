package teacherarrange;

public class Sort {
	
	public static void sort(Time ctime[]) {
		int i,j;
		Time []temp = new Time[1];
		for(i=0;i<ctime.length-1;i++){                     //���ѭ������������������ʱ������
			for(j=0;j<ctime.length-1-i;j++){               //�ڲ�ѭ������ÿһ��������ٴ�
			if(ctime[j].getTime().compareTo(ctime[j+1].getTime())>=0){
			temp[0]=ctime[j];
			ctime[j]=ctime[j+1];
			ctime[j+1]=temp[0];}}}
	}
}
