package agh.po.lab3;

import java.lang.Math;
import java.util.Map;
import java.util.HashMap;

public class CodingBat {
    public static void main(String[] args) {
        CodingBat codingBat = new CodingBat();
    }

    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> mapa = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            mapa.put(strings[i], strings[i].length());
        }
        return mapa;
    }


    public Map<String, String> mapAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a") + map.get("b"));
        }
        return map;
    }




    public int diff21(int n) {
        if (n > 21){
            return (Math.abs(n-21)*2);
        }else {
            return Math.abs(n-21);
        }
    }

    public boolean startHi(String str) {
        if(str.length() >=2) {
            if (str.charAt(0) == 'h' && str.charAt(1) == 'i') {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    public int countEvens(int[] nums) {
        int evens = 0;
        for (int i=0; i < nums.length; i++){
            if (nums[i]%2 == 0) {
                evens = evens + 1;
            }
        }
        return evens;
    }
    public String helloName(String name) {
        return "Hello " + name + "!";
    }

}