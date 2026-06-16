package lesson20String3;

public class StringMetn {
    public static void main(String[] args) {
        String s1="Hello \nRafiq\nHow are you?";
        System.out.println(s1);
        System.out.println("***********");
        String s2= """
                Hello                             Salam
                "Rafiq"
                How are you?
                """;
        System.out.println(s2);

        System.out.println("***********");

        String html= """
                <html>
                    <head>
                        <title>%s</title>
                    </head>
                    <body>
                        <h1>Welcome to my page</h1>
                        <p>This is a sample HTML page.</p>
                    </body>
                """;
        System.out.printf(html,"My page");

    }
}
