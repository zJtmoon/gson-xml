
import org.json.CDL;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.*;
public class Test {

    public static void main(String[] args) {
        System.out.println("==============================================");//fastjsoN
//        JSONArray jsonArray=new JSONArray();
//        List list=new LinkedList();
//        Map map=new HashMap();
//        map.put("size",3);
//        map.put("siez1",4);
//        list.add(map);
//        JSONObject a=new JSONObject();
//        a.put("name","a");
//        a.put("age",2);
//        a.put("map",list);
//        System.out.println(a.toJSONString());
//        System.out.println(a.toString());
//        jsonArray.add(a);
//        System.out.println(jsonArray.toString());

        System.out.println("==============================================");


        JSONArray jsonArray=new JSONArray();    //ORG.JSON
        List list=new LinkedList();
        Map map=new HashMap();
        map.put("size",3);
        map.put("siez1",4);
        list.add(map);
        JSONObject a=new JSONObject();
        a.put("name","a");
        a.put("age",2);
        a.put("map",list);
        System.out.println(a.toString());
        System.out.println(a.toString());
        jsonArray.put(a);
        System.out.println(jsonArray.toString());
        String csv =CDL.toString(jsonArray);
        System.out.println(csv);

        }
}
