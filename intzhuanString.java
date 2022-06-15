package text_5_25;

import java.util.Arrays;

public class intzhuanString {
    public static void main(String[] args) {
        String s="19 29 88 12 60";
        String [] s1=s.split(" ");
        int []arr=new int[s1.length];
        for(int i=0;i<s1.length;i++){
            arr[i]=Integer.parseInt(s1[i]);
        }
        Arrays.sort(arr);
        StringBuffer q=new StringBuffer();
        for(int i=0;i<arr.length;i++)
        {
            if(i==arr.length){
                q.append(arr[i]);
            }
            else {
                q.append(arr[i]).append(" ");
            }
        }
        String s2=q.toString();
        System.out.println("s2:"+s2);
    }
}
