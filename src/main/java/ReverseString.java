/**
 * Created by jaymilnamow on 6/18/16.
 */
public class ReverseString {

    public String reverseString(String input){

//        String output = "";
//
//        for(int i=input.length()-1; i>=0; i--){
//
//            output += input.charAt(i);
//
//        }
//        return output;

        if(input.length() == 0){
            return input;
        }
        return input.charAt(input.length()-1)+reverseString(input.substring(0,input.length()-1));

    }

}

//  if String == "string" == 5 char length so:
//  input.substring(0,5);
//  but length will be interchangeable
