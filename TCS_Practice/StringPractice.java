import java.util.*;

public class StringPractice {

    public static void countCharacters(String S){
        int vowels=0;
        int consonants=0;
        int space=0;
        S=S.toLowerCase();

        int n=S.length();
        for(int i=0;i<n;i++){
            char ch=S.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                vowels++;
            }else if(ch>='a' && ch<='z'){
                consonants++;
            }else if(ch==' '){
                space++;
            }
        }
        System.out.println("Vowels: "+vowels);
        System.out.println("Consonants: "+consonants);
        System.out.println("White Spaces: "+space);
    }
    public static void removeVowels(String S){
        S=S.toLowerCase();
        // StringBuilder sb=new StringBuilder();                                    //using stringbuilder
        // int n=sb.length();
    
        // for(int i=0;i<S.length();i++){
        //     char ch=S.charAt(i);
        //     if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u'){
        //         sb.append(ch);
        //     }
        // }
        // String result=sb.toString();
        // System.out.println("result:"+result);

        for(int i=0;i<S.length();i++){                                         //Using string
            char ch=S.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                S=S.substring(0,i)+S.substring(i+1);
                i--;
            }
        }
        System.out.println(S);
    }
    public static String removeCharacter(String S){
        // StringBuilder sb=new StringBuilder();

        // for(int i=0;i<S.length();i++){
        //     int ascii=S.charAt(i);
        //     if(ascii>=97 && ascii<=122 || ascii>=65 && ascii<=90){
        //         sb.append(S.charAt(i));
        //     }
        // }
        // //System.out.println(sb.toString());
        // return sb.toString();

        StringBuilder sb=new StringBuilder();

        for(int i=0;i<S.length();i++){                              // Without using ascii value
            char ch=S.charAt(i);
            if(Character.isLetter(ch)){
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static String reverse(String str){
        int i=0;
        int j=str.length()-1;
        StringBuilder sb=new StringBuilder(str);

        while(i<=j){
            sb.setCharAt(i,str.charAt(j));
            sb.setCharAt(j,str.charAt(i));
            i++;
            j--;
        }
        return sb.toString();
    }
    public static String Capitalize(String str){
        // StringBuilder sb=new StringBuilder(str);                              //Using function

        // for(int i=0;i<str.length();i++){
        //     char ch=str.charAt(i);
        //     if(i==0 || i==str.length()-1){
        //         sb.setCharAt(i,Character.toUpperCase(ch));
        //     }
        //     else if(ch==' '){
        //         sb.setCharAt(i-1,Character.toUpperCase(str.charAt(i-1)));
        //         sb.setCharAt(i+1,Character.toUpperCase(str.charAt(i+1)));
        //     }
        // }
        // return sb.toString();

        StringBuilder sb=new StringBuilder(str);                               // Without function
        
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if((i==0 || i==str.length()-1) && (int)ch>=97){
                sb.setCharAt(i,(char)((int)ch-32));
            }
            else if(ch==' '){
                sb.setCharAt(i-1,(char)((int)str.charAt(i-1)-32));
                sb.setCharAt(i+1,(char)((int)str.charAt(i+1)-32));
            }
        }
        return sb.toString();

    }
    public static void FrequencyCharacter(String str){
        str=str.toLowerCase();
        int freq[]=new int[26];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            freq[ch-'a']++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0){
                System.out.print((char)(i+'a'));
                System.out.println(freq[i]);
            }
        }
    }
    public static void NonRepeating(String s){
        s=s.toLowerCase();
        int freq[]=new int[26];                              //Approach -01- Using Frequency Array
        for(int i=0;i<s.length();i++){                                //order preserved
            char ch=s.charAt(i);
            freq[ch-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(freq[(int)s.charAt(i)-'a']==1){
                System.out.print(s.charAt(i)+",");
            }
        }

        // s=s.toLowerCase();                                 //Approach 2 - Sorting
        // char arr[]=s.toCharArray();
        // Arrays.sort(arr);
        // String str=new String(arr);
        // if(str.charAt(0)!=str.charAt(1)){
        //     System.out.print(str.charAt(0)+",");
        // }
        // for(int i=1;i<str.length()-1;i++){
        //     if(str.charAt(i)!=str.charAt(i-1) && str.charAt(i)!=str.charAt(i+1)){
        //         System.out.print(str.charAt(i)+",");
        //     }
        // }
        // if(str.charAt(str.length()-1)!=str.charAt(str.length()-2)){
        //     System.out.print(str.charAt(str.length()-1)+",");
        // }
    }
    public static void MaxOccurence(String s){
        int freq[]=new int[26];
        // int max,result=0;
        int max=0;

        for(int i=0;i<s.length();i++){
            freq[(int)(s.charAt(i)-'a')]++;
        }
        for(int i=0;i<freq.length;i++){
            // max=freq[i];
            // result=Math.max(max,result);
            if(freq[i]>max){
                max=freq[i];
            }
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]==max){
                System.out.print((char)(i+'a'));
                break;
            }
        }
        
    }
    public static String DuplicateRemove(String s){
        HashSet<Character> set= new HashSet<>(26);  
        StringBuilder sb=new StringBuilder(26);
        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
        }
        for(Character i:set){
            sb.append(i);
        }
        return sb.toString();
    }
    public static void printDuplicates(String s){
        //Using HashMap
        HashMap<Character,Integer> map=new HashMap<>(26);  //can use LinkedHashMap - insertion order is preserved
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(char ch:map.keySet()){
            if(map.get(ch)>1){
                System.out.println(ch+"-"+map.get(ch));
            }
        }
        // Approach - 02 - Use freq array
    }
    public static String nextLexicographicAlphabet(String s){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='z'){
                sb.append('a');
            }else if(s.charAt(i)=='Z'){
                sb.append('A');
            }
            else{
                sb.append((char)(s.charAt(i)+1));
            }
        }
        return sb.toString();
    }
    public static String LargestWord(String s){
        String words[]=s.split("\\s+");
        int maxlength=0;
        String largestword="";
        for(String word:words){
            if(word.length()>maxlength){
                maxlength=word.length();
                largestword=word;
            }
        }
        return largestword;
    }
    public static String HighestRepeated(String s){
        String words[]=s.split("\\s+");
        String str="-1";
        int repeat=0;
        int maxcount=0;
        for(String word:words){
            repeat=MaximumRepeatedLetters(word);
            if(repeat>maxcount){
                maxcount=repeat;
                str=str+word;
            }
        }
        return str;
    }
    public static int MaximumRepeatedLetters(String s){
        int freq[]=new int[26];
        int count=0;
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq[i]>1){
                count++;
            }
        }
        return count;
    }
    public static char[] ReverseWords(String s){
        // String words[]=s.split("\\s+");                //TC-O(n), SC-O(n)
        // StringBuilder sb=new StringBuilder();

        // for(int i=words.length-1;i>=0;i--){
        //     sb.append(words[i]);
        //     if(i!=0){
        //         sb.append(" ");
        //     }
        // }
        // return sb.toString();

        char arr[]=s.toCharArray();
        reverseHelper(arr, 0, arr.length-1);

        int start=0;
        for(int i=0;i<=arr.length;i++){
            if(i==arr.length || arr[i]==' '){
                reverseHelper(arr, start, i-1);
                start=i+1;
            }
        }
        return arr;
    }
    public static char[] reverseHelper(char arr[],int i,int j){
        while(i<=j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return arr;
    }
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter your String: ");
        // String S=sc.nextLine();
        //String S = "take12% *&u ^$#forward";
        //countCharacters(S);
        //removeVowels(S);
        //System.out.println(removeCharacter(S));
        //String str="Hello ravi how are you";
        //System.out.println(reverse(str));
        //System.out.println(Capitalize(str));
        String str="My name is Ravi";
        //FrequencyCharacter(str);
        //NonRepeating(str);
        //MaxOccurence(str);
        //System.out.println(DuplicateRemove(str));
        //printDuplicates(str);
        //System.out.println(nextLexicographicAlphabet(str));
        //System.out.println(LargestWord(str));
        //System.out.println(HighestRepeated(str));
        System.out.println(ReverseWords(str));
    }
}
