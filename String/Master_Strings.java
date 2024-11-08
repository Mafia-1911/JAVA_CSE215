class Solve_any_String_Question{
    // traversing_the_string
    void character_manipulation(){
        String s1="Hell0";
        for(int i=0;i<s1.length();i++){
            char temp=s1.charAt(i);
            ///Enter your charecter Manipulation code here
            /// Printing Smthing || Counting || New String 
            /// Q1. Convert the Casing 
        
        }
    }
    void word_Manipulation(){

    }
};
class Creating_String{
   
    //Charecter Array to String 
    char[] char_Arr={'h','e','l','l','o'};
    String myString2=new String(char_Arr);
    
    String blankString=new String();
    String myString=new String("Test String");
    String easiest="Hello world";
    //Strings are immutable which means in place changing 
    //doesnt work instead a new space is allocated in the memory and over there the modufied string is kept 
    //The modified strings pointer is returned 
};
class Important_String_Methods{
   
    static String myString3="Hello";
        void checking_in_A_String(){
            //Check in a string
            myString3.contains("ell");    
            myString3.startsWith("a");
            myString3.endsWith("a");

            //Data Type comparison - to see if both are strings or not
            myString3.equals("ell"); 
            myString3.equalsIgnoreCase("ell");
            //String Comparison - compare String to another String 
            myString3.compareTo(myString3);
            myString3.compareToIgnoreCase(myString3);
        
        };
        void Position(){
            myString3.length();
            myString3.indexOf('a'); // The index of the char in that string 
            myString3.lastIndexOf('a');
            
        };
        void manipulate_String(){
            //Since in place manipulation of strings are not possible 
            //so we need to store the manipulated String somewhere 
            //We dont pass out input string to the method of string class instead use the 
            //methods on out input string directly 

            //Case Changing 
            String changed_String=myString3.toLowerCase();
            String changed_String2=myString3.toUpperCase();
            ////Trims the trailing and starting whitespaces 
            String t3=myString3.trim();
            //Concating Strings
            String c3=myString3.concat(changed_String2);
            c3=changed_String+changed_String2;
            //Replacing Charecters in a string 
            String r3=myString3.replace("Old Chars to Replace", "New Chars to replace with");
            
            //Extracting a part of String 
            String s1="This is a String";
            String s2=s1.substring(0,4);
            //In the overloaded version it takes the begainning index only and returns till the end 
            s1.substring(5); // returns 5->end

            //character at an index 
            s1.charAt(4);
        }
}

class MyStringBuilder{
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        sb.append(23);
        System.out.println("hello");
        System.out.println(sb.toString());

    }
}

class Word_Manipulation_Problems{
    static String input=new String("Great things take time");
    //Find the spaces index 
    //Split the string at the last and new Found Index 
    void extract_words(String input){
        //Adding a space at the end to make it work for the last word as well 
        input=input+" ";
        String word="";
        int end=0;int position=0;
        //IndexOf(what to search , From where to search )
        while(input.indexOf(' ',position) > 0){
            end=input.indexOf(' ',position);
            word=input.substring(position,end);
            /////Word Manipulation Logic 
            /// word.length()>longest_word ; longest_word=word
            /// Capitalize the fisrt Letter
            position=end+1;
        }
        
    }
}