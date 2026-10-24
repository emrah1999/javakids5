package lesson48.designpattern;

public class User  {
    private String name;
    private int age;
    private String email;

    public User(BuilderUser builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }
    public static BuilderUser builder() {
        return new BuilderUser();
    }

    public static class BuilderUser {
        private String name;
        private int age;
        private String email;

        public BuilderUser name(String name) {
            this.name = name;
            return this;
        }

        public BuilderUser age(int age) {
            this.age = age;
            return this;
        }

        public BuilderUser email(String email) {
            this.email = email;
            return this;
        }


        public User build() {
            return new User(this);
        }

    }
}
