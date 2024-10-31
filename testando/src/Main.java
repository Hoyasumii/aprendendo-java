public class Main {
    public static void main(String[] args) {
        User user;
        for (int i = 0; i < 10_000_000; i++) {
            user = new User("Alan", 19);
            System.out.println(user.age - i);
        }
    }
}
