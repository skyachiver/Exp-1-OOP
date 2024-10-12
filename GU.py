import sys

def main_menu():
    print("\n1. Select to know about Goa University.\n2. Academics\n3. Contact Us\n4. Exit")
    
    try:
        select = int(input())
    except ValueError:
        print("Please enter a valid number.")
        main_menu()
        return
    
    if select == 1:
        about()
    elif select == 2:
        academics()
    elif select == 3:
        print("\nAddress: Goa University, Taleigao Plateau, Goa \nMail: registrar@unigoa.ac.in \nReception/Helpline: +91-8669609048\nHere is the link to contact URL: https://www.unigoa.ac.in/goa-university-contact-us.php\n")
    elif select == 4:
        sys.exit(0)
    else:
        print("Please select a correct option.")
        main_menu()

def about():
    print("\n**********************************************************************")
    print("\nYou have selected About. Please select options below as per your interest.")
    print("1. Performance \n2. Statutes \n3. Annual Report \n4. Go Back to Main Menu\n5. Exit")

    try:
        i = int(input())
    except ValueError:
        print("Please enter a valid number.")
        about()
        return
    
    if i == 1:
        print("\nGoa University has been accredited with a CGPA of 2.87 on a seven-point scale at B++ grade. Visit: https://www.unigoa.ac.in/about-us/a/general-info/performance.html\n")
    elif i == 2:
        print("\nGoa University was established in June 1985. Read more at: https://www.unigoa.ac.in/uploads/confg_docs/20240819.113034~Statute_24Jun24.pdf\n")
    elif i == 3:
        print("\nHere is the link to open the Annual Report: https://www.unigoa.ac.in/about-us/a/university-documents/annual-reports.html\n")
    elif i == 4:
        main_menu()
    elif i == 5:
        sys.exit(0)
    else:
        print("Please select a correct option.")
        about()

def academics():
    exit_flag = False
    print("\n**********************************************************************")
    print("\nYou have selected Academics.")

    while not exit_flag:
        print("1. Programmes offered \n2. University-Wide List \n3. Fee Structure \n4. Fee Refund \n5. Academic Terms\n6. Go to Main Menu\n7. Exit")

        try:
            i = int(input())
        except ValueError:
            print("Please enter a valid number.")
            continue

        if i == 1:
            print("1. Bachelors: https://www.unigoa.ac.in/academics/programmes/bachelors.html\n2. Masters: https://www.unigoa.ac.in/academics/programmes/masters.html")
            print("3. M.Phil: https://www.unigoa.ac.in/academics/programmes/masters-of-philosophy.html\n4. Doctoral: https://www.unigoa.ac.in/academics/programmes/doctoral-programmes.html")
            print("5. PG Diploma: https://www.unigoa.ac.in/academics/programmes/pg-diploma.html\n6. Diploma: https://www.unigoa.ac.in/academics/programmes/diploma.html")
        elif i == 2:
            print("\nLink to Faculty List: http://info.unigoa.ac.in/faculty_A-Z.php\n")
        elif i == 3:
            print("\nFee Structure: https://www.unigoa.ac.in/uploads/confg_docs/20240531.054831~Notific_Tuit_fee_2024-25.pdf\n")
        elif i == 4:
            print("\nFee Refund: https://www.unigoa.ac.in/a/fee-refund.html\n")
        elif i == 5:
            print("\nAcademic Term: https://www.unigoa.ac.in/academics/a/general-info/calendar.html\n")
        elif i == 6:
            main_menu()
            exit_flag = True
        elif i == 7:
            sys.exit(0)
        else:
            print("Please select a correct option.")

def main():
    print("*************** Welcome to Goa University *********************************")
    username = input("Please enter your name: ")
    print(f"Hello {username}, please make your selection as mentioned below: ")

    while True:
        main_menu()

if __name__ == "__main__":
    main()
