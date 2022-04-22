import java.io.IOException;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    try{
      Service1 service=new Service1();
      Service1 metoda=new Service1();
      System.out.println("1-Dodaj studenta\n2-Wypisz wszystkich studentów\n3-Znajdź studenta\n4-Wyjdź");
      Scanner scanner=new Scanner(System.in);
      int opcja=scanner.nextInt();
      String imie=scanner.nextLine();
      int wiek;
      String data;
      switch(opcja){
        case 1:
          System.out.println("Wpisz imie:");
          imie=scanner.nextLine();
          System.out.println("Wpisz wiek:");
          wiek=scanner.nextInt();
           System.out.println("Wpisz rok:");
          scanner.nextLine();
          data=scanner.nextLine();
          System.out.println("Dodano studenta");
          metoda.addStudent(new Student(imie,wiek,data));
          break;
        case 2:
          var students=service.getStudents();
          for(Student current: students ){
            System.out.println(current.ToString());
          }
          break;
        case 3:
          System.out.println("Wpisz imie studenta ktorego chcesz wyszukac");
          String szukanie=scanner.nextLine();
          service.findStudentByName(szukanie);
          break;
      }
    }
    catch (IOException e){
    }
    }}

 


  
