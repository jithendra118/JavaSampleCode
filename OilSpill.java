import java.util.*;

public class OilSpill {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        String noOfTestCases = s1.nextLine();
       int noOfTests =Integer.valueOf(noOfTestCases);
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i <noOfTests ; i++) {
            String noOfContainers = s1.nextLine();
            List<String> individualCap = new ArrayList<>();
            for (int j = 0; j <2; j++) {
              individualCap.add(s1.nextLine());
            }
            String ret =calculateVolumeMethod(individualCap);
            list.add(ret);
        }
        list.stream().forEach(System.out::println);
    }

    private static String calculateVolumeMethod(List<String> individualCap) {
        HashMap<Integer,Integer> map = new HashMap<>();
        String[] totalIndividualCapacity = individualCap.get(0).split(" ");// 3 3 4
        String[] intialCapacity = individualCap.get(1).split(" ");//1 2 1
        int overflow = 0;
        int filltoNext = 0;
        int finalVal = 0;
        for (int i = 0; i < totalIndividualCapacity.length; i++) {
            int cap1 = Integer.valueOf(totalIndividualCapacity[i]);
            int intial1 = Integer.valueOf(intialCapacity[i]);
            if (cap1 >= intial1 & intial1 != 0) {
                int diff = cap1 - intial1;//3
                if (filltoNext > diff) {//2
                    overflow = overflow + filltoNext - diff;//0+2-1=1
                    filltoNext = cap1;
                    finalVal = cap1;
                } else if (filltoNext == diff) {
                    finalVal = cap1;
                    filltoNext = cap1;
                } else {
                    filltoNext = diff;
                    finalVal = intial1 + filltoNext;
                }
            }
        }
      return  finalVal+" "+overflow;
    }
}
