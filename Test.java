import java.io.*;
import java.util.*;
import java.math.*;

import static java.util.stream.Collectors.joining;

public class Test {
    public static void main(String[] args) throws IOException {
        List<String> firstlist= new ArrayList<String>();
        firstlist.add("pa1, mel");
        firstlist.add("pa2, de");
        firstlist.add("pa3, mel");

        List<String> secondlist= new ArrayList<String>();
        secondlist.add("pa1, d1");
        secondlist.add("pa2, d2");
        secondlist.add("pa3, d2");
        secondlist.add("pa3, d1");

        List<String> thirdlist= new ArrayList<String>();
        thirdlist.add("mel, d1");
        thirdlist.add("de, d2");
        thirdlist.add("mel, d3, d1");

        Result.solution(firstlist,secondlist,thirdlist);
    }
}
    class Result {

        public static List<String> solution(List<String> illnesses, List<String> drugs, List<String> cohorts) {
            HashMap<String, List<String>> hashedMapIllness= new HashMap<String, List<String>>();
            HashMap<String, List<String>> hashedMapDrugs= new HashMap<String, List<String>>();
            HashMap<String, List<String>> hashedMapCohorts= new HashMap<String, List<String>>();
            hashedMapIllness=getMap(illnesses);
            hashedMapDrugs=getMap(drugs);
            List<String> patientlist=new ArrayList<>();
            List<String> list=new ArrayList<>();
            List<String> secondlist=new ArrayList<>();
            List<String> thirdlist =new ArrayList<>();

            for(int i=0; i< cohorts.size();i++) {
                String[] cohort_split = cohorts.get(i).split(", ");
                for (int j=0; j <cohort_split.length; j++){
                    if((hashedMapIllness.containsKey(cohort_split[j]))){
                        list = hashedMapIllness.get(cohort_split[j]);
                    }
                    if((hashedMapDrugs.containsKey(cohort_split[j]))){
                        secondlist = hashedMapDrugs.get(cohort_split[j]);
                    }
                }
               List<String> resultlist=new ArrayList<>(list);
                list.retainAll(secondlist);
                resultlist=list;
               System.out.println(resultlist);
            }



            return null;
        }

        public static HashMap<String,List<String>> getMap(List<String> illnesses){
            HashMap<String, List<String>> hashedtable= new HashMap<String, List<String>>();
            List<String> secondvalue;
            for(int i=0; i< illnesses.size();i++) {
                String[] splitted = illnesses.get(i).split(", ");
                if(!(hashedtable.containsKey(splitted[1]))){
                    secondvalue= new ArrayList<>();
                    secondvalue.add(splitted[0]);
                    hashedtable.put(splitted[1], secondvalue);
                }
                else{
                    secondvalue=hashedtable.get(splitted[1]);
                    secondvalue.add(splitted[0]);

                }
            }
            return hashedtable;
        }

    }

