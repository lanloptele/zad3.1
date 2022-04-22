import java.util.Collection;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Service1 {
  private boolean add;

  public void addStudent(Student student) throws IOException {
    var f = new FileWriter("db.txt", true);
    var b = new BufferedWriter(f);
    b.append(student.ToString());
    b.newLine();
    b.close();
  }

  public Collection<Student> getStudents() throws IOException {
    var ret = new ArrayList<Student>();
    var f = new FileReader("db.txt");
    var reader = new BufferedReader(f);
    String line = "";
    while (true) {
      line = reader.readLine();
      if(line == null)
        break;
      ret.add(Student.Parse(line));
    }
    reader.close();
    return ret;
  }

  public Collection<Student> findStudentByName(String name) throws IOException {
    String[] words=null;
    var lista=new ArrayList<Student>();
    var f=new FileReader("db.txt");
    var reader=new BufferedReader(f);
    String s="";
    int count=0;
    while((s=reader.readLine())!=null)
      {
        words=s.split(" ");
        for(String word: words)
          {
            if(word.equals(name)){
              System.out.println(s+",");
              count++;
            }
            
          }
      }
    if(count!=0){
      System.out.println("Uzytkownik o imieniu: " +name+" \nNa liście występuje on "+count+" raz/y");
    }
    else{
      System.out.println("Nie ma użytkownika o imieniu: \n"+name);
    }
    reader.close();
    return lista;
  }
}