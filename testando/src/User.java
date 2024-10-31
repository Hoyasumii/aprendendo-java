public class User {
    public String name;
    public int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected void finalize() {
        System.out.println("OBJ vai ser removido");
        
    }

}
