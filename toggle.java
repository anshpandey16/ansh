public class toggle {
    public static void main(String args[]){
        String s="aABbc";
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))){
             sb.append(Character.toLowerCase(s.charAt(i)));

            }
            else{
                sb.append(Character.toUpperCase(s.charAt(i)));

            }
        }
        String res=sb.toString();
        System.out.println(res);
    }
}
