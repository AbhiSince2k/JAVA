public class pgm27 {
    public static void main(String args[]){    
        StringBuilder sb=new StringBuilder();    
        System.out.println(sb.capacity());//default 16    
        sb.append("Hello");    
        System.out.println(sb.capacity());//now 16    
        sb.append("Java is my favourite language");    
        System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2    
        sb.ensureCapacity(10);//now no change    
        System.out.println(sb.capacity());//now 34    
        sb.ensureCapacity(50);//now (34*2)+2    
        System.out.println(sb.capacity());//now 70    
        }

    }----------------------------------------------------------------------------------------------

    public static void main(String[] args) {
                StringBuilder str = new StringBuilder("AAAABBBCCCC");
        
            // print string
            System.out.println("String = "+ str.toString());
        
            // reverse the string
            StringBuilder reverseStr = str.reverse();
        
            // print string
            System.out.println("Reverse String = "+ reverseStr.toString());
        
            // Append ', '(44) to the String
            str.appendCodePoint(44);
        
            // Print the modified String
            System.out.println("Modified StringBuilder = "+ str);
        
            str.appendCodePoint(45);
        
            // Print the modified String
            System.out.println("Modified StringBuilder = "+ str);
            
            str.append("CCCCBBBAAAACCCCBBBAAAA");
            
            // get capacity
            int capacity = str.capacity();
        
            // print the result
            System.out.println("StringBuilder = " + str);
            System.out.println("Capacity of StringBuilder = "+ capacity);
        
                }

}
