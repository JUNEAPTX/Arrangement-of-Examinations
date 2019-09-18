package teacherarrange;

public class Teacher {
	private String tname;
	private String subject;
	
	public Teacher(String tname,String subject){
		this.setName(tname);
		this.setSubject(subject);
	}
	
	public void setName(String m)
	{this.tname = m;}
	
	public String getName()
	{return tname;}
	
	public void setSubject(String n)
	{this.subject = n;}
	
	public String getSubject()
	{return subject;}

	/*public void tell()
	{System.out.println("教工姓名："+tname+"，"+"科目："+subject+"时间：");}*/
}
