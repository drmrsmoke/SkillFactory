public class string {
    public static void main(String[] args) {
        System.out.println(removeWhiteSpaces("А роза упала на лапу Азора"));
        /*String name1 = "Иван Иванов";
        String name2 = "Петр петров";
        checkUserName(name1, name2);*/

    }
    private static String removeWhiteSpaces(String str) {
        String str2 = str.replaceAll(" ", "");
        return str2;
    }
    /*private static void checkUserName(String user1, String user2) {
        if (user1.equalsIgnoreCase(user2) == true)
            System.out.println("Выберите другое имя пользователя");
        else
            System.out.println("Отличное имя! количество символов в имени "+ user2.length());
    }*/
}
