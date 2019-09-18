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
            book= Workbook.getWorkbook(new File("E:\\学术基金\\智能排考系统\\读取\\teachers.xls"));//读取excel文件  
            sheet=book.getSheet(0);        //获得ecxel表的第一个对象      
            cell=sheet.getCell(0,0);		//获取左上角的单元格
            System.out.println(cell.getContents());
            while(true)
            {
                //获取每一行的单元格 
            	Student_Name=sheet.getCell(0,i);		//（列，行）
            	Student_Num=sheet.getCell(1,i);
                if("".equals(Student_Name.getContents())==true)    //如果读取的数据为空
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
   //获得Excel文件
   Workbook wb=Workbook.getWorkbook(new File("c://test.xls")); 
   //打开一个文件的副本，并且指定数据写回到原文件
   WritableWorkbook book=
   Workbook.createWorkbook(new File("c://test.xls"),wb); 
   //添加一个工作表eet,在第一行第一列填写内容
   WritableSheet sheet=book.createSheet("第二页",1);
   sheet.addCell(new Label(0,0,"http://www.sunleap.com")); 
   book.write();
   book.close();
  }catch(Exception e){
   System.out.println(e);
  }
  System.out.println("操作结束！");
   
 }
}
*/