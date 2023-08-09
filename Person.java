public class Person{
    String name;
    String email;
    int phone;

   public Person(String name, String email, int phone){
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    void changeName(String name){
        this.name = name;
    }

    void display(){
        System.out.println(this);
        
    }

    void changeEmail(String email){
        this.email = email;
    }
    
    @Override
    public String toString() {
        return "Name: " + name + ", Email: " + email  +"\n";
    }
    public static void main(String[] args) {
        Person p1 = new Person("shakil", "example@gmail.com", 0155);
        Person p2 = new Person("Tawhid" , "test@gmail.com", 01777);

        p1.changeName("Tawhid");
        p2.changeName("Shakil");
        p1.changeEmail("shakilinfo@gmail.com");
        p2.changeEmail("astalukdar39@gmail.com");
        p1.display();
        p2.display();

    }
}