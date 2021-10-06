import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

public class StringSplit {
    public static void main(String[] args) {
        String[] entries = "key1:999,key2:768,key3:645".split(",");
        String str = "{0:137, 2:80, 3:60}";
        str = str.replace("{","");
        str = str.replace("}","");
        //System.out.println(str);


        byte[] bye ={1,2,3};
        Charset charset = StandardCharsets.UTF_16;
        byte[] byteArrray = str.getBytes(charset);
        System.out.println(byteArrray);
        String s = new String(byteArrray,StandardCharsets.UTF_16);
        System.out.println("String: "+s);
        String by = byteArrray.toString();
        System.out.println(by);
        byte[] byteArrray1 = by.getBytes(charset);
        System.out.println(byteArrray1);
        String s1 = new String(byteArrray1,StandardCharsets.UTF_16);
        System.out.println("String: "+s1);
        //byte[] bits = (byte);

        Map<String,String> map = new HashMap<String,String>();
        for (String entry : entries) {
            int i=0;
            String[] keyValue = entry.split(":");
            map.put(keyValue[0],keyValue[1]);
            byte[] num = new byte[entry.length()];
                  // num[i] = Byte.parseByte(String.valueOf(100));
            num[i] =  Byte.valueOf(String.valueOf(30));
            System.out.println(num[0]);
         Integer text = Integer.valueOf(10004);
            Byte b =Byte.valueOf(text.byteValue());
            System.out.println(b+"4574574574");
            Integer a  = b.intValue();
            System.out.println(a+"000000");

          /*  // Convert Integer number to byte value
            byte b = a.byteValue();
            Byte b1 = new Byte();
           int out = b1.intValue();
            System.out.println(b1+"----"+out);
*/
            //System.out.println(num[0]);
        }
        map.forEach((k,v)->System.out.println(k+"----"+v));
    }

}
