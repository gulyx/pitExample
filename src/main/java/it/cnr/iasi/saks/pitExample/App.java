package it.cnr.iasi.saks.pitExample;

/**
 * Hello world!
 *
 */
public class App 
{
    public void foo( String str ){
        String outStr;
        if ((str.length()%2)==0){
            outStr="even-";        
        } else {
            outStr="odd-";        
        }
        outStr=outStr+str;
        
        System.out.println( "This is the string manipulated by foo:"+ outStr);
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
