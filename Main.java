import java.io.IOException;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int rozpoznanie=1;
    while(rozpoznanie!=0){
      System.out.println("1-Dodaj studenta\n2-Wypisz wszystkich studentów\n3-Wyjdź");
      rozpoznanie=sc.nextInt();
      while(rozpoznanie !=1&rozpoznanie !=2&rozpoznanie!=0){
        System.out.println("Nie ma takiej opcji.\nWybierz ponownie:");
         rozpoznanie=sc.nextInt();}
      
    if(rozpoznanie==0){}
    else{
      switch(rozpoznanie){
        case 1:
          System.out.println("Podaj imię: ");
          sc.nextLine();
          String imie=sc.nextLine();
          System.out.println("Podaj Wiek: ");
          int wiek=sc.nextInt();
    try {
      Service1 s = new Service1();
      s.addStudent(new Student(imie,wiek));
      }
      catch (IOException e) {}
     break;
      case 2:
      try{
        Service1 s = new Service1();
        var students = s.getStudents();
        for(Student current: students)
          {
            System.out.println(current.ToString());
            }}
     catch (IOException e) {}
      break;
        default:
          break;}
          }
      }
}
}


  
