using System;

public class GoaUniversityApp
{
    static void Main(string[] args)
    {
        Console.WriteLine("***************   Welcome to Goa University *********************************");

        Console.WriteLine("Please Enter your name below: ");
        string username = Console.ReadLine();
        Console.WriteLine($"Hello {username}, please make your selection as mentioned below: ");
        while (true)
        {
            MainMenu();
        }
    }

    static void MainMenu()
    {
        Console.WriteLine("\n1. Select to know about Goa university.\n2. Academics\n3. Contact Us\n4. Exit");

        int select = int.Parse(Console.ReadLine());

        switch (select)
        {
            case 1:
                About();
                break;

            case 2:
                Academics();
                break;

            case 3:
                Console.WriteLine("\nAddress: Goa University, Taleigao Plateau, Goa \nMail: registrar@unigoa.ac.in \nReception/Helpline: +91-8669609048\nHere is the link to contact URL: https://www.unigoa.ac.in/goa-university-contact-us.php\n");
                break;

            case 4:
                Environment.Exit(0);
                break;

            default:
                Console.WriteLine("Please select the correct option.");
                break;
        }
    }

    static void About()
    {
        Console.WriteLine("\n**********************************************************************");
        Console.WriteLine("\nYou have selected About. Please select options below as per your interest.");
        Console.WriteLine("1. Performance\n2. Statutes\n3. Annual Report\n4. Go Back to Main Menu\n5. Exit");

        int i = int.Parse(Console.ReadLine());

        switch (i)
        {
            case 1:
                Console.WriteLine("\nGoa University has been accredited with a CGPA of 2.87 on a seven-point scale at B++ grade valid for five years from 27 Dec 2022 by the National Assessment and Accreditation Council (NAAC) of India. NAAC is an autonomous body established by the University Grants Commission (UGC) of India to assess and accredit institutions of higher education.\nTo know more in detail, please visit URL: https://www.unigoa.ac.in/about-us/a/general-info/performance.html\n");
                break;

            case 2:
                Console.WriteLine("\nGoa University was established in June 1985 by the Goa University Act, 1984 (Act No. 7 of 1984).\nTo know more, here is the link to PDF URL: https://www.unigoa.ac.in/uploads/confg_docs/20240819.113034~Statute_24Jun24.pdf\n");
                break;

            case 3:
                Console.WriteLine("\nHere is the link to the Annual Report URL: https://www.unigoa.ac.in/about-us/a/university-documents/annual-reports.html\n");
                break;

            case 4:
                MainMenu();
                break;

            case 5:
                Environment.Exit(0);
                break;

            default:
                Console.WriteLine("Please select the correct option.");
                break;
        }
    }

    static void Academics()
    {
        int exit = 0;
        Console.WriteLine("\n**********************************************************************");
        Console.WriteLine("\nYou have selected Academics");

        while (exit == 0)
        {
            Console.WriteLine("1. Programmes offered\n2. University-Wide list\n3. Fee Structure\n4. Fee Refund\n5. Academic Terms\n6. Go to Main Menu\n7. Exit");

            int i = int.Parse(Console.ReadLine());

            switch (i)
            {
                case 1:
                    Console.WriteLine("1. Bachelors URL: https://www.unigoa.ac.in/academics/programmes/bachelors.html\n2. Masters URL: https://www.unigoa.ac.in/academics/programmes/masters.html");
                    Console.WriteLine("3. Masters of Philosophy URL: https://www.unigoa.ac.in/academics/programmes/masters-of-philosophy.html\n4. Doctoral Program URL: https://www.unigoa.ac.in/academics/programmes/doctoral-programmes.html\n5. PG Diploma URL: https://www.unigoa.ac.in/academics/programmes/pg-diploma.html");
                    Console.WriteLine("6. Diploma URL: https://www.unigoa.ac.in/academics/programmes/diploma.html\n");
                    break;

                case 2:
                    Console.WriteLine("\nLink to Faculty list URL: http://info.unigoa.ac.in/faculty_A-Z.php\n");
                    break;

                case 3:
                    Console.WriteLine("\nHere is the link to Fee Structure PDF URL: https://www.unigoa.ac.in/uploads/confg_docs/20240531.054831~Notific_Tuit_fee_2024-25.pdf\n");
                    break;

                case 4:
                    Console.WriteLine("\nHere is the link to Fee Refund portal URL: https://www.unigoa.ac.in/a/fee-refund.html\n");
                    break;

                case 5:
                    Console.WriteLine("\nHere is the link to Academic Term portal URL: https://www.unigoa.ac.in/academics/a/general-info/calendar.html\n");
                    break;

                case 6:
                    MainMenu();
                    break;

                case 7:
                    Environment.Exit(0);
                    break;

                default:
                    Console.WriteLine("Please select the correct option.\n");
                    break;
            }
        }
    }
}
