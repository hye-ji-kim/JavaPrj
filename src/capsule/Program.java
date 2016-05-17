package capsule;

public class Program {

   public static void main(String[] args) {
      
      Exam exam = new Exam();
      
      Exam.getKor(exam, 30);
      Exam.setKor(exam, 30);
      
      Exam.getEng(exam, 30);
      Exam.setEng(exam, 30);
      
      Exam.getMath(exam, 30);
      Exam.setMath(exam, 30);
 
      Exam.printExam(exam);
   }
}