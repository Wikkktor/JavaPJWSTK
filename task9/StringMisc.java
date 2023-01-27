
public class StringMisc {

    public static void main(String[] args) {
        System.out.println(norm("caravaggio"));
        System.out.println(norm("VERMEER"));

        System.out.println(init("johann sebastian bach"));
        System.out.println(init("i. babeL"));
        System.out.println(init("jorge LUIS BORGES"));
        System.out.println(init("WOLFGANG a. mozart"));
        System.out.println(tr("November 2016",
        "abcdefghijklmnopqrstuvwyz",
        "ABCDEFGHIJKLMNOPQRSTUVWYZ"));
        System.out.println(tr("abcXYZ","aZcX","||Cx"));
    }


    public static String norm(String name) {
        return name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
    }


    public static String init(String name) {
        String[] parts = name.split(" ");
        String result = "";
        for (int i = 0; i < parts.length; i++) {
            if (i == parts.length -1) {
                result += parts[i].substring(0,1).toUpperCase() + parts[i].substring(1).toLowerCase();
                break;
            } 
            result += parts[i].substring(0,1).toUpperCase() + ". ";
          }
        return result;
    }

    public static String tr(String s, String from, String to) {
        int len = from.length();

        for (int i = 0; i < len; i++){
            char fr = from.charAt(i);
            char t = to.charAt(i);
            s = s.replace(fr, t);
        }

        return s;
    }

}