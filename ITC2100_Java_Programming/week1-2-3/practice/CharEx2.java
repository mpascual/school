class CharEx2 {
    public static void main(String args[]) {
        int ch;

        // assign ch to capital "A"
        ch=65;

       // now display the value
       System.out.println("the value of ch is " + ch);

       // you can also display the value as an char
       System.out.println("the value of ch is " + (char)ch);

       // in this way you can do the following
       ++ch;

       // note what is displayed now
       System.out.println("the value of ch is " + ch);
       System.out.println("the value of ch is " + (char)ch);

       // what will be the output if I do this
       --ch;

       System.out.println("the value of ch is " + ch);
       System.out.println("the value of ch is " + (char)ch);
    }
}
