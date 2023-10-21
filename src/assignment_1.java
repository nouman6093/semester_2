import java.util.*;
public class assignment_1 {

    class Friend {
        private int FID;
        private String FNAME;
        private String FTN;
        private DVD[] borrowedDVDs = new DVD[2];
        private int dvdCount = 0;

        public Friend(int FID, String FNAME, String FTN) {
            this.FID = FID;
            this.FNAME = FNAME;
            this.FTN = FTN;
        }

        // Getter methods for Friend class
        public int getFID() {
            return FID;
        }

        public String getFNAME() {
            return FNAME;
        }

        public String getFTN() {
            return FTN;
        }

        public DVD[] getBorrowedDVDs() {
            return borrowedDVDs;
        }

        // Setter methods for Friend class
        public void setFNAME(String FNAME) {
            this.FNAME = FNAME;
        }

        public void setFTN(String FTN) {
            this.FTN = FTN;
        }

        // Setter method to add borrowed DVD
        public void addBorrowedDVD(DVD dvd) {
            if (dvdCount < 2) {
                borrowedDVDs[dvdCount++] = dvd;
                System.out.println(dvd.getDTITLE() + " added to " + FNAME + "'s collection.");
            } else {
                System.out.println(FNAME + " can only borrow a maximum of 2 DVDs.");
            }
        }

        // Setter method to remove borrowed DVD
        public void removeBorrowedDVD(DVD dvd) {
            for (int i = 0; i < dvdCount; i++) {
                if (borrowedDVDs[i] == dvd) {
                    borrowedDVDs[i] = null;
                    dvdCount--;
                    System.out.println(dvd.getDTITLE() + " returned by " + FNAME + ".");
                    return;
                }
            }
            System.out.println(dvd.getDTITLE() + " was not borrowed by " + FNAME + ".");
        }

        public void displayFriendInfo() {
            System.out.println("Friend ID: " + FID);
            System.out.println("Name: " + FNAME);
            System.out.println("Telephone Number: " + FTN);
        }
    }

    class DVD {
        private int DID;
        private String DTITLE;

        public DVD(int DID, String DTITLE) {
            this.DID = DID;
            this.DTITLE = DTITLE;
        }

        // Getter methods for DVD class
        public int getDID() {
            return DID;
        }

        public String getDTITLE() {
            return DTITLE;
        }

        // Setter method for DVD class
        public void setDTITLE(String DTITLE) {
            this.DTITLE = DTITLE;
        }

        public void displayDVDInfo() {
            System.out.println("DVD ID: " + DID);
            System.out.println("Title: " + DTITLE);
        }
    }

    public class Test {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Friend[] friends = new Friend[100]; // Maximum 100 friends
            DVD[] dvds = new DVD[100]; // Maximum 100 DVDs
            int friendID = 1;
            int dvdID = 1;

            for (int choice = 0; choice != 7;) {
                System.out.println("\nMenu:");
                System.out.println("1. Add Friend");
                System.out.println("2. Add DVD");
                System.out.println("3. Borrow DVD");
                System.out.println("4. Return DVD");
                System.out.println("5. Display Friend Info");
                System.out.println("6. Display DVD Info");
                System.out.println("7. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                if (choice == 1) {
                    System.out.print("Enter Friend Name: ");
                    String friendName = scanner.nextLine();
                    System.out.print("Enter Telephone Number: ");
                    String telephoneNumber = scanner.nextLine();
                    friends[friendID - 1] = new Friend(friendID, friendName, telephoneNumber);
                    System.out.println("Friend added successfully.");
                    friendID++;
                } else if (choice == 2) {
                    System.out.print("Enter DVD Title: ");
                    String dvdTitle = scanner.nextLine();
                    dvds[dvdID - 1] = new DVD(dvdID, dvdTitle);
                    System.out.println("DVD added successfully.");
                    dvdID++;
                } else if (choice == 3) {
                    System.out.print("Enter Friend ID: ");
                    int friendIDToBorrow = scanner.nextInt();
                    System.out.print("Enter DVD ID to borrow: ");
                    int dvdIDToBorrow = scanner.nextInt();
                    Friend borrower = friends[friendIDToBorrow - 1];
                    DVD dvdToBorrow = dvds[dvdIDToBorrow - 1];
                    if (borrower != null && dvdToBorrow != null) {
                        borrower.borrowDVD(dvdToBorrow);
                    } else {
                        System.out.println("Invalid Friend ID or DVD ID.");
                    }
                } else if (choice == 4) {
                    System.out.print("Enter Friend ID: ");
                    int friendIDToReturn = scanner.nextInt();
                    System.out.print("Enter DVD ID to return: ");
                    int dvdIDToReturn = scanner.nextInt();
                    Friend returner = friends[friendIDToReturn - 1];
                    DVD dvdToReturn = dvds[dvdIDToReturn - 1];
                    if (returner != null && dvdToReturn != null) {
                        returner.returnDVD(dvdToReturn);
                    } else {
                        System.out.println("Invalid Friend ID or DVD ID.");
                    }
                } else if (choice == 5) {
                    System.out.print("Enter Friend ID: ");
                    int friendIDToDisplay = scanner.nextInt();
                    Friend friendToDisplay = friends[friendIDToDisplay - 1];
                    if (friendToDisplay != null) {
                        friendToDisplay.displayFriendInfo();
                    } else {
                        System.out.println("Invalid Friend ID.");
                    }
                } else if (choice == 6) {
                    System.out.print("Enter DVD ID: ");
                    int dvdIDToDisplay = scanner.nextInt();
                    DVD dvdToDisplay = dvds[dvdIDToDisplay - 1];
                    if (dvdToDisplay != null) {
                        dvdToDisplay.displayDVDInfo();
                    } else {
                        System.out.println("Invalid DVD ID.");
                    }
                } else if (choice == 7) {
                    System.out.println("Exiting the program.");
                } else {
                    System.out.println("Invalid choice. Please enter a valid option.");
                }
            }
        }
    }
