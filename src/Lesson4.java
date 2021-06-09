import java.lang.StringBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson4 {
    public static void main(String[] args) {
        /*StringBuilder builder = new StringBuilder("StringBuilder");
        builder.append("- blablabla");
        System.out.println(builder);*/



        /*String text = "<strike>Это удалить!</strike>А это хороший текст, его трогать не надо.<strike> и это не нужно!</strike>";
        Pattern regec = Pattern.compile("<strike>.*?</strike>");
        Matcher match = regec.matcher(text);
        while (match.find()) {
            int start = match.start();
            int end = match.end();
            System.out.println("found match end \n" + text.substring(start, end) + "\nfrom " + start + "\nto " + (end - 1));
        }
        System.out.println("Clean the text");
        System.out.println(match.replaceAll(""));
    }*/


        String text = "Regular Expressions or Regex is an API for defining String patterns that can be used for searching, manipulating and editing a text. It is widely used to define a constraint on strings such as a password. Regular Expressions are provided under java.util.regex package.";
        Pattern pattern = Pattern.compile("\\bs\\w+?s\\b");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }


    }

}

