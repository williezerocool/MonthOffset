/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monthoffset;

/**
 *
 * @author kendrabooker
 */
public class MonthOffset {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
                System.out.println( "Offset for month 1: " + month_offset(1) );
		System.out.println( "Offset for month 2: " + month_offset(2) );
		System.out.println( "Offset for month 3: " + month_offset(3) );
		System.out.println( "Offset for month 4: " + month_offset(4) );
		System.out.println( "Offset for month 5: " + month_offset(5) );
		System.out.println( "Offset for month 6: " + month_offset(6) );
		System.out.println( "Offset for month 7: " + month_offset(7) );
		System.out.println( "Offset for month 8: " + month_offset(8) );
		System.out.println( "Offset for month 9: " + month_offset(9) );
		System.out.println( "Offset for month 10: " + month_offset(10) );
		System.out.println( "Offset for month 11: " + month_offset(11) );
		System.out.println( "Offset for month 12: " + month_offset(12) );
		System.out.println( "Offset for month 43: " + month_offset(43) );
    }
    
    public static String month_offset(int month){
           String Jan, Feb, Mar, Apr, May, Jun, Jul, Aug,Sep, Oct, Nov, Dec, err;
           err = "-1";
          
       switch(month){
            case 1: {
               Jan = "1";
               return  Jan;
            }
            case 2:{
                Feb = "4";
               return  Feb;
            }
            case 3:{
                Mar = "4";
               return  Mar;
            }
            case 4:{
                Apr = "0";
               return  Apr;
            }
            case 5:{
                May = "2";
               return  May;
            }
            case 6:{
                Jun = "5";
               return  Jun;
            }
            case 7:{
                Jul = "0";
               return  Jul;
            }
            case 8:{
                Aug = "3";
               return  Aug;
            }
            case 9:{
                Sep = "6";
               return  Sep;
            }
            case 10:{
                Oct = "1";
               return  Oct;
            }
            case 11:{
                Nov = "4";
               return  Nov;
            }
            case 12:{
                Dec = "6";
               return  Dec;
            }
            default:{
            
                return err;
                
            }
            
         
        }
                
        
            
        
    }
    
}
