package teacherarrange;

public class Subject_retrieval {
	public static String []time = {"08:00~10:00","10:20~12:20","13:30~15:30","15:50~17:50"};
	public static void retrieval(Time []subtotal) {
		int i,j;
		for(i=0;i<subtotal.length;i++)
			for(j=i+1;j<subtotal.length;j++)
			{
				if(subtotal[i].getMatchSubject().equals(subtotal[j].getMatchSubject()))
						subtotal[j].matchtime=time[subtotal[i].num];
					
			}
			
			
	}

}
