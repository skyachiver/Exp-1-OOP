#include <iostream>
#include <string>

using namespace std;

void main_menu();
void about();
void acadmics();

void main_menu() {
    int select;
    cout << "\n1. Select to know about Goa University.\n2. Academics\n3. Contact Us\n4. Exit\n";
    cin >> select;

    switch (select) {
        case 1:
            about();
            break;
        case 2:
            acadmics();
            break;
        case 3:
            cout << "\nAddress: Goa University, Taleigao Plateau, Goa\nMail: registrar@unigoa.ac.in\nReception/Helpline: +91-8669609048\nHere is the link to contact URL: https://www.unigoa.ac.in/goa-university-contact-us.php\n";
            break;
        case 4:
            exit(0);
        default:
            cout << "Please select the Correct Option\n";
    }
}

void about() {
    int i;
    cout << "\n**********************************************************************\n";
    cout << "You have selected About. Please select options below as per your interest.\n";
    cout << "1. Performance\n2. Statutes\n3. Annual Report\n4. Go Back to Main Menu\n5. Exit\n";
    cin >> i;

    switch (i) {
        case 1:
            cout << "\nGoa University has been accredited with a CGPA of 2.87 on a seven-point scale at B++ grade valid for five years from 27 Dec 2022 by the NAAC.\nFor more details, visit: https://www.unigoa.ac.in/about-us/a/general-info/performance.html\n";
            break;
        case 2:
            cout << "\nGoa University was established in June 1985 by the Goa University Act.\nFor more details, visit: https://www.unigoa.ac.in/uploads/confg_docs/20240819.113034~Statute_24Jun24.pdf\n";
            break;
        case 3:
            cout << "\nFor the Annual Report, visit: https://www.unigoa.ac.in/about-us/a/university-documents/annual-reports.html\n";
            break;
        case 4:
            main_menu();
            break;
        case 5:
            exit(0);
        default:
            cout << "Please select the Correct Option\n";
    }
}

void acadmics() {
    int exit = 0;
    int i;
    cout << "\n**********************************************************************\n";
    cout << "You have selected Academics\n";

    while (exit == 0) {
        cout << "1. Programmes offered\n2. University Wide list\n3. Fee Structure\n4. Fee Refund\n5. Academic Terms\n6. Go to Main Menu\n7. Exit\n";
        cin >> i;

        switch (i) {
            case 1:
                cout << "1. Bachelors URL: https://www.unigoa.ac.in/academics/programmes/bachelors.html\n2. Masters URL: https://www.unigoa.ac.in/academics/programmes/masters.html\n";
                break;
            case 2:
                cout << "\nFaculty list URL: http://info.unigoa.ac.in/faculty_A-Z.php\n";
                break;
            case 3:
                cout << "\nFee Structure URL: https://www.unigoa.ac.in/uploads/confg_docs/20240531.054831~Notific_Tuit_fee_2024-25.pdf\n";
                break;
            case 4:
                cout << "\nFee Refund URL: https://www.unigoa.ac.in/a/fee-refund.html\n";
                break;
            case 5:
                cout << "\nAcademic Terms URL: https://www.unigoa.ac.in/academics/a/general-info/calendar.html\n";
                break;
            case 6:
                main_menu();
                break;
            case 7:
                exit(0);
            default:
                cout << "Please select the Correct Option\n";
        }
    }
}

int main() {
    string username;
    cout << "***************   Welcome to Goa University   ******************************\n";
    cout << "Please Enter your name below: ";
    cin >> username;
    cout << "Hello " << username << ", please make your selection as mentioned below: \n";

    while (true) {
        main_menu();
    }

    return 0;
}
