import java.util.*;
public class XOR_encrypt_algorithm{
    public static void main(String[] args){
        String key = "01101011";
        Scanner scn = new Scanner(System.in);

    }

    public static void encrypt(String key, String str){
        int[] array_str = Integer.parseInt(str.split(""));
        int[] array_key = Integer.parseInt(key.split(""));
        String encrypt_str = "";
        for(int i=0;i<array_str.length;i++){
            if(array_str[i] == array_key[i]){
                encrypt_str += "0";
            }else{
                encrypt_str += "1";
            }
        }
    }
}