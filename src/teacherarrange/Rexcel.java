package teacherarrange;

import java.io.*;    
import jxl.*;

public class Rexcel{
    public static void main(String[] args) {
        int i=1;
        Sheet sheet;
        Workbook book;
        Cell cell,Student_Name,Student_Num;
        try { 
            book= Workbook.getWorkbook(new File("E:\\ѧ������\\�����ſ�ϵͳ\\��ȡ\\teachers.xls"));//��ȡexcel�ļ�  
            sheet=book.getSheet(0);        //���ecxel��ĵ�һ������      
            cell=sheet.getCell(0,0);		//��ȡ���Ͻǵĵ�Ԫ��
            System.out.println(cell.getContents());
            while(true)
            {
                //��ȡÿһ�еĵ�Ԫ�� 
            	Student_Name=sheet.getCell(0,i);		//���У��У�
            	Student_Num=sheet.getCell(1,i);
                if("".equals(Student_Name.getContents())==true)    //�����ȡ������Ϊ��
                    break;
                System.out.println(Student_Name.getContents()+"\t"+Student_Num.getContents()); 
                i++;
            }
            book.close(); 
        }
        catch(Exception e)  { 
        	e.printStackTrace(); 
        } 
    }
}
/*
import java.io.*;
import jxl.*;
import jxl.write.*;
public class UpdateExcel
{
  
 public static void main(String[] args)
{
  try  {
   //���Excel�ļ�
   Workbook wb=Workbook.getWorkbook(new File("c://test.xls")); 
   //��һ���ļ��ĸ���������ָ������д�ص�ԭ�ļ�
   WritableWorkbook book=
   Workbook.createWorkbook(new File("c://test.xls"),wb); 
   //���һ��������eet,�ڵ�һ�е�һ����д����
   WritableSheet sheet=book.createSheet("�ڶ�ҳ",1);
   sheet.addCell(new Label(0,0,"http://www.sunleap.com")); 
   book.write();
   book.close();
  }catch(Exception e){
   System.out.println(e);
  }
  System.out.println("����������");
   
 }
}
*/