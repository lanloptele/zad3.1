public class Student {

  private String Name;
  private int Age;
 private String Data;
  public Student(String name, int age,String data) {
    Name = name;
    Age = age;
    Data=data;
  }

  public String GetName() {return Name;}
  public int GetAge() {return Age;}
  public String GetData(){return Data;}

  public String ToString() {
    return Name + " " + Integer.toString(Age)+" "+Data;
  }

  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if(data.length != 3) 
      return new Student("Parse Error", -1,"parse Error");
    return new Student(data[0],Integer.parseInt(data[1]),data[2]);
  }
}