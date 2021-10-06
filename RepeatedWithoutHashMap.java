import java.util.Arrays;

public class RepeatedWithoutHashMap {
    public static void main(String[] args) {
       String s = "aabbccddfgaaccbbbcccfgh";
        //String s = "aabbaa";
        String[] arr = new String[s.length()];
        int val =0;
        for (int i = 0; i <s.length() ; ) {
            int count =1;
            char temp = s.charAt(i);
            String com = String.valueOf(temp);
            String value="";
            if(i==s.length()-1){// this condition for last single value print in string
                arr[i]=com+count;
                break;
            }
            for(int j=i+1;j<s.length();j++){
               String newCmp =  String.valueOf(s.charAt(j));
               if(j>1){
                   String preValue =  String.valueOf(s.charAt(j-2));
                   if(!preValue.equals(com)&&!com.equalsIgnoreCase(newCmp)) {// middle single value print
                       value = com + count;
                       arr[i] = value;
                       val = val + 1;
                   }
               }

                if(com.equalsIgnoreCase(newCmp)){// count increase if repeat in adjacent
                    ++count;
                   value = com+count;
                    val=j;
                    arr[i]=value;
                    if(j==arr.length-1){
                        arr[i]=value;
                        val =val+1;
                        break;
                    }
                }else{

                    if(value.equals("")){
                        arr[i]=value;
                        val=val+1;
                    }
                    break;
                }

            }
            i=val;
        }
       Arrays.stream(arr).filter(x->x!=null)
                .forEach(e->System.out.print(e + " "));
       /* for (int i = 0; i < arr.length; i++) {
            if(!"".equals(arr[i]) && arr[i]!=null)
            System.out.print(arr[i]);
        }*/
    }

}
