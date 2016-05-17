
import java.io.*;
 
public class ByteArrayInputOutputTest {
 
       public static void main(String[] args) {
              if(args.length != 1){
                     System.out.println("���� : java ByteArrayInputOutputTest ���ϸ�");
                     System.exit(0);
              } // if end
             
              FileInputStream fis = null;
              ByteArrayInputStream bais = null;
              ByteArrayOutputStream baos = null;
              
              try{
                     fis = new FileInputStream(args[0]);
                     baos = new ByteArrayOutputStream();
                     byte[] buffer = new byte[512];
                     int readcount = 0;
                     // ���Ϸκ��� �о���� ����Ʈ �迭�� ByteArrayOutputStream���� ����Ѵ�.
                     while((readcount = fis.read(buffer)) != -1){
                           baos.write(buffer, 0, readcount);
                     }
                    
                    
                     // ByteArrayOutputStream�� ���ΰ����� �����
                     byte[] fileArray = baos.toByteArray();
                     System.out.println("������ ������ ��� �о� byte[]�� ��������ϴ�.");
                     System.out.println("�о���� byte�� �� :" + fileArray.length);
                    
                     // byte[]�κ��� �о���̴� ByteArrayInputStream�� �����Ѵ�.
                     bais = new ByteArrayInputStream(fileArray);
                     // ByteArrayInputStream�����ؼ� �о� ���� byte�迭�� ǥ�������ġ(�����)�� ����Ѵ�.
                     while((readcount = bais.read(buffer)) != -1){
                           System.out.write(buffer, 0, readcount); 
                     }
                     System.out.println("\n\n");
                     System.out.println("�о���� ������ ��� ����߽��ϴ�.");                    
              }catch(Exception ex){
                     System.out.println(ex);
              }finally{
                     try{
                           fis.close();
                           bais.close();
                           baos.close();
                     }catch(IOException ioe){
                           System.out.println(ioe);
                     }
              }
       }
}