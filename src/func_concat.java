public class func_concat {
    public static String leters (String p, int n){
        String fields = "";
        for (int i = 0; i<n; i++){
            fields += p;
        }
        return fields;
    }

    public static void main(String[] args) {
        System.out.println(leters("_", 100));
    }
}

