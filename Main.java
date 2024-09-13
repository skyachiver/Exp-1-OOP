
import java.util.Scanner;

public class Main{

    static Scanner scan = new Scanner(System.in);

    static void main_menu(){

        System.out.println("\n1. Select to know about Goa univerity.\n2. Acadmics\n3. Contact Us  \n4. Exit  ");
        
        int select = scan.nextInt();
        switch (select) {

            case 1:
                about();
              break;

            case 2:
                Acadmics();
             break;
             
            case 3:
                System.out.println("\nAddress: Goa University, Taleigao Plateau, Goa \nMail: registrar@unigoa.ac.in \nReception/Helpline: +91-8669609048\nHere is the link to contact URL: https://www.unigoa.ac.in/goa-university-contact-us.php\n");
                break;
            case 4:
                System.exit(0);
                break;

            default:
                System.out.println("Please select Correct Option");
   
        } //End of switch
    }// End of Main Menu



    static void about(){

        System.out.println("\n********************************************************************** ");
        System.out.println("\nYou have selected About Please slect options below as per your interest. ");
        System.out.println("1. Performance \n2. Statutes  \n3. Annual Report \n4. Go Back to Main Menu\n5. Exit ");

        int i = scan.nextInt();
        switch (i) {

            case 1:
            System.out.println("\nGoa University has been accredited with a CGPA of 2.87 on a seven point scale at B++ grade valid for five years from 27 Dec 2022 by the National Assessment and Accreditation Council (NAAC) of India. NAAC is an autonomous body established by the University Grants Commission (UGC) of India to assess and accredit institutions of higher education.\nTo know more in detail Please visit URL: https://www.unigoa.ac.in/about-us/a/general-info/performance.html\n");
              break;

            case 2:
             System.out.println("\nGoa University was established in June 1985 by the Goa University Act, 1984(Act No.7of1984).\nThe first Statutes of the University were set out in the Schedule of the Act.\nThis digital document is an updated compilation of all amendments and notificationsoftheStatutes on the Goa University that have been carried out so far (as on 15.05.2024). It offersanup to date ready reference to the teaching community, student community, andofficialsandpublic at large. This digital document is an updated compilation of all amendments and notificationsoftheStatutes on the Goa University that have been carried out so far.\nIt offers anuptodatereadyreference to the teaching community, student community, officials and public at large.\nTo know more here is the link to pdf URL: https://www.unigoa.ac.in/uploads/confg_docs/20240819.113034~Statute_24Jun24.pdf\n");
             break;  
             
            case 3:
             System.out.println("\nHere is the link to open Annual Report URL: https://www.unigoa.ac.in/about-us/a/university-documents/annual-reports.html\n");
             break; 
            
            case 4:
                   main_menu();
                break;

            case 5:
                  System.exit(0);
                break;

            default:
                System.out.println("Please select Correct Option");
        }// end of witch
    }// End of about

    
    static void Acadmics(){
        int exit = 0;
        System.out.println("\n**********************************************************************");
        System.out.println("\nYou have selected Acadmics ");

        while(exit == 0){

            System.out.println(" 1. Programmes offered \n 2. University Wide list \n 3. Fee Structure \n 4. Fee Refund \n 5. Acadmic Terms\n 6. Goto Main Menu\n 7. Exit ");
       
            int i = scan.nextInt();
            switch (i) {

                case 1:
                System.out.println("1. Bachelors Url: https://www.unigoa.ac.in/academics/programmes/bachelors.html\n2. Masters URL: https://www.unigoa.ac.in/academics/programmes/masters.html" );
                System.out.println("3. Masters of Philopsophy URL: https://www.unigoa.ac.in/academics/programmes/masters-of-philosophy.html \n4. Doctoral Programm URL: https://www.unigoa.ac.in/academics/programmes/doctoral-programmes.html\n5. PG Diploma URL: https://www.unigoa.ac.in/academics/programmes/pg-diploma.html");
                System.out.println("6. Diploma URL: https://www.unigoa.ac.in/academics/programmes/diploma.html\n");
                break;

                case 2: 
                    System.out.println("\nLink to Faculty list URL: http://info.unigoa.ac.in/faculty_A-Z.php\n");
                    break;
                
                case 3:
                    System.out.println("\nHere is the link to Fee Structure PDF URL: https://www.unigoa.ac.in/uploads/confg_docs/20240531.054831~Notific_Tuit_fee_2024-25.pdf\n");
                    break;
                
                case 4:
                    System.out.println("\nHere is the link to Fee Refund portal URL: https://www.unigoa.ac.in/a/fee-refund.html\n");
                    break;

                case 5:
                    System.out.println("\nHere is the link to Acadmic Term portal URL: https://www.unigoa.ac.in/academics/a/general-info/calendar.html\n");
                    break;

                case 6:
                    main_menu();
                    break;

                case 7:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Please select Correct Option\n");
            }// end of switch
        }// end loop
    }// End of acadmics
    
    
    public static void main(String[] args) {

        System.out.println("***************   Welcome to Goa University *********************************");

        System.out.println("Please Enter yor name below: ");
        Scanner scan = new Scanner(System.in);
        String Username = scan.nextLine();
        System.out.println("Hello " + Username + " please Make your Selection as mentioned below: ");
        while (true) { 
            main_menu();
        }
        
    }// End of main

}//End of class