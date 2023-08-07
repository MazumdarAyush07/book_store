
//To make a billing software for a bookstore which makes bills according to the purchase of different items by its customers
import java.util.*;

class book_store {
    int ch;
    String name[] = new String[30];
    int c[] = new int[30];
    int q[] = new int[30];
    double price[] = new double[30];
    double s[] = new double[30];
    double dis[] = new double[30];
    double dis_am[] = new double[30];
    static double total = 0.0;
    Scanner in = new Scanner(System.in);

    void education() {
        while (true) {
            System.out.println("---Following are the list of books available with their prices---");
            System.out.println(
                    "1.Understanding Computer Applications with BlueJ[Class X](Arya Publishing Company)--------Rs.425.00");
            System.out.println(
                    "2.Understanding ICSE Mathematics[Class X](Avichal Publishing Company)---------------------Rs.400.00");
            System.out.println(
                    "3.New ICSE History & Civics[Class X](Frank Bros.&Co.)-------------------------------------Rs.370.00");
            System.out.println(
                    "4.Modern Certificate Geography[Class X](Frank Bros.&Co.)----------------------------------Rs.485.00");
            System.out.println(
                    "5.Concise Physics[Class X](Selina Publishers)---------------------------------------------Rs.300.00");
            System.out.println(
                    "6.Concise Chemistry[Class X](Selina Publishers)-------------------------------------------Rs.270.00");
            System.out.println(
                    "7.Concise Biology[Class X](Selina Publishers)---------------------------------------------Rs.340.00");
            System.out.println(
                    "8.The Merchant of Venice(Selina Publishers)-----------------------------------------------Rs.125.00");
            System.out.println(
                    "9.ICSE A Collection of Poems and Short Stories(Inter University Press)--------------------Rs.10.08");
            System.out.println(
                    "10.Total English[Class X](Morning Star Publications)--------------------------------------Rs.225.00");
            System.out.println("0.To stop order---");
            System.out.println("-----Enter your Choice-----");
            ch = in.nextInt();
            if (ch == 1) {
                name[0] = "Understanding Computer Applications with BlueJ[Class X](Arya Publishing Company)";
                System.out.println("---Enter The Number of books required---");
                q[0] = in.nextInt();
                price[0] = 425.0;
                dis[0] = 10.0;
                s[0] = q[0] * price[0];
                dis_am[0] = dis[0] / 100.0 * s[0];
                total = total + s[0] - dis_am[0];
                c[0] = 1;
            } else if (ch == 2) {
                name[1] = "Understanding ICSE Mathematics[Class X](Avichal Publishing Company)";
                System.out.println("---Enter the number of books required---");
                q[1] = in.nextInt();
                price[1] = 400.00;
                dis[1] = 10.0;
                s[1] = q[1] * price[1];
                dis_am[1] = dis[1] / 100.0 * s[1];
                total = total + s[1] - dis_am[1];
                c[1] = 1;
            } else if (ch == 3) {
                name[2] = "New ICSE History & Civics[Class X](Frank Bros.&Co.)";
                System.out.println("---Enter The Number of books required---");
                q[2] = in.nextInt();
                price[2] = 370.0;
                dis[2] = 7.5;
                s[2] = q[2] * price[2];
                dis_am[2] = dis[2] / 100.0 * s[2];
                total = total + s[2] - dis_am[2];
                c[2] = 1;
            } else if (ch == 4) {
                name[3] = "Modern Certificate Geography[Class X](Frank Bros.&Co.)";
                System.out.println("---Enter The Number of books required---");
                q[3] = in.nextInt();
                price[3] = 485.0;
                dis[3] = 12.0;
                s[3] = q[3] * price[3];
                dis_am[3] = dis[3] / 100.0 * s[3];
                total = total + s[3] - dis_am[3];
                c[3] = 1;
            } else if (ch == 5) {
                name[4] = "Concise Physics[Class X](Selina Publishers)";
                System.out.println("---Enter The Number of books required---");
                q[4] = in.nextInt();
                price[4] = 300.0;
                dis[4] = 7.5;
                s[4] = q[4] * price[4];
                dis_am[4] = dis[4] / 100.0 * s[4];
                total = total + s[4] - dis_am[4];
                c[4] = 1;
            } else if (ch == 6) {
                name[5] = "Concise Chemistry[Class X](Selina Publishers)";
                System.out.println("---Enter The Number of books required---");
                q[5] = in.nextInt();
                price[5] = 270.0;
                dis[5] = 5.0;
                s[5] = q[5] * price[5];
                dis_am[5] = dis[5] / 100.0 * s[5];
                total = total + s[5] - dis_am[5];
                c[5] = 1;
            } else if (ch == 7) {
                name[6] = "Concise Biology[Class X](Selina Publishers)";
                System.out.println("---Enter The Number of books required---");
                q[6] = in.nextInt();
                price[6] = 340.0;
                dis[6] = 7.5;
                s[6] = q[6] * price[6];
                dis_am[6] = dis[6] / 100.0 * s[6];
                total = total + s[6] - dis_am[6];
                c[6] = 1;
            } else if (ch == 8) {
                name[7] = "The Merchant of Venice(Selina Publishers)";
                System.out.println("---Enter The Number of books required---");
                q[7] = in.nextInt();
                price[7] = 125.0;
                dis[7] = 0.0;
                s[7] = q[7] * price[7];
                dis_am[7] = dis[7] / 100.0 * s[7];
                total = total + s[7] - dis_am[7];
                c[7] = 1;
            } else if (ch == 9) {
                name[8] = "ICSE A Collection of Poems and Short Stories(Inter University Press)";
                System.out.println("---Enter The Number of books required---");
                q[8] = in.nextInt();
                price[8] = 10.08;
                dis[8] = 0.0;
                s[8] = q[8] * price[8];
                dis_am[8] = dis[8] / 100.0 * s[8];
                total = total + s[8] - dis_am[8];
                c[8] = 1;
            } else if (ch == 10) {
                name[9] = "Total English[Class X](Morning Star Publications)";
                System.out.println("---Enter The Number of books required---");
                q[9] = in.nextInt();
                price[9] = 225.0;
                dis[9] = 5.0;
                s[9] = q[9] * price[9];
                dis_am[9] = dis[9] / 100.0 * s[9];
                total = total + s[9] - dis_am[9];
                c[9] = 1;
            } else if (ch == 0)
                break;
            else {
                System.out.println("Wrong Choice");
                System.out.println("You will be redirected");
            }
        }

    }

    void fiction() {
        while (true) {
            System.out.println("---Following are the list of books available with their prices---");
            System.out.println("1.Harry Potter[Full Series-7 books](J.K.Rowling)-------------------Rs.1550.00");
            System.out.println("2.The Jungle Book(Rudyard Kipling)---------------------------------Rs.175.00");
            System.out.println("3.Three Mistakes of My Life(Chetan Bhagat)-------------------------Rs.225.00");
            System.out.println("4.You are Trending in my Dreams(Sudeep Nagarkar)-------------------Rs.220.00");
            System.out.println("5.It All Started with a Friend Request(Sudeep Nagarkar)------------Rs.230.00");
            System.out.println("6.The Girl of my Dreams(Durjoy Dutta)------------------------------Rs.199.00");
            System.out.println("7.Revolution 2020(Chetan Bhagat)-----------------------------------Rs.210.00");
            System.out.println("8.Hold my Hand(Durjoy Dutta)---------------------------------------Rs.224.00");
            System.out.println("9.Sorry You are not my Types(Sudeep Nagarkar)----------------------Rs.230.00");
            System.out.println("10.Half GirlFriend(Chetan Bhagat)----------------------------------Rs.225.00");
            System.out.println("0.To stop order---");
            System.out.println("----Enter your choice----");
            ch = in.nextInt();
            if (ch == 1) {
                name[10] = "Harry Potter[Full Series-7 books](J.K.Rowling)";
                System.out.println("---Enter The Number of books required---");
                q[10] = in.nextInt();
                price[10] = 1550.0;
                dis[10] = 20.0;
                s[10] = q[10] * price[10];
                dis_am[10] = dis[10] / 100.0 * s[10];
                total = total + s[10] - dis_am[10];
                c[10] = 1;
            } else if (ch == 2) {
                name[11] = "The Jungle Book(Rudyard Kipling)";
                System.out.println("---Enter The Number of books required---");
                q[11] = in.nextInt();
                price[11] = 175.0;
                dis[11] = 5.0;
                s[11] = q[11] * price[11];
                dis_am[11] = dis[11] / 100.0 * s[11];
                total = total + s[11] - dis_am[11];
                c[11] = 1;
            } else if (ch == 3) {
                name[12] = "Three Mistakes of My Life(Chetan Bhagat)";
                System.out.println("---Enter The Number of books required---");
                q[12] = in.nextInt();
                price[12] = 225.0;
                dis[12] = 7.5;
                s[12] = q[12] * price[12];
                dis_am[12] = dis[12] / 100.0 * s[12];
                total = total + s[12] - dis_am[12];
                c[12] = 1;
            } else if (ch == 4) {
                name[13] = "You are Trending in my Dreams(Sudeep Nagarkar)";
                System.out.println("---Enter The Number of books required---");
                q[13] = in.nextInt();
                price[13] = 220.0;
                dis[13] = 7.5;
                s[13] = q[13] * price[13];
                dis_am[13] = dis[13] / 100.0 * s[13];
                total = total + s[13] - dis_am[13];
                c[13] = 1;
            } else if (ch == 5) {
                name[14] = "It All Started with a Friend Request(Sudeep Nagarkar)";
                System.out.println("---Enter The Number of books required---");
                q[14] = in.nextInt();
                price[14] = 230.0;
                dis[14] = 10.0;
                s[14] = q[14] * price[14];
                dis_am[14] = dis[14] / 100.0 * s[14];
                total = total + s[14] - dis_am[14];
                c[14] = 1;
            } else if (ch == 6) {
                name[15] = "The Girl of my Dreams(Durjoy Dutta)";
                System.out.println("---Enter The Number of books required---");
                q[15] = in.nextInt();
                price[15] = 199.0;
                dis[15] = 5.0;
                s[15] = q[15] * price[15];
                dis_am[15] = dis[15] / 100.0 * s[15];
                total = total + s[15] - dis_am[15];
                c[15] = 1;
            } else if (ch == 7) {
                name[16] = "Revolution 2020(Chetan Bhagat)";
                System.out.println("---Enter The Number of books required---");
                q[16] = in.nextInt();
                price[16] = 210.0;
                dis[16] = 5.0;
                s[16] = q[16] * price[16];
                dis_am[16] = dis[16] / 100.0 * s[16];
                total = total + s[16] - dis_am[16];
                c[16] = 1;
            } else if (ch == 8) {
                name[17] = "Hold my Hand(Durjoy Dutta)";
                System.out.println("---Enter The Number of books required---");
                q[17] = in.nextInt();
                price[17] = 224.0;
                dis[17] = 10.0;
                s[17] = q[17] * price[17];
                dis_am[17] = dis[17] / 100.0 * s[17];
                total = total + s[17] - dis_am[17];
                c[17] = 1;
            } else if (ch == 9) {
                name[18] = "Sorry You are not my Types(Sudeep Nagarkar)";
                System.out.println("---Enter The Number of books required---");
                q[18] = in.nextInt();
                price[18] = 230.0;
                dis[18] = 10.0;
                s[18] = q[18] * price[18];
                dis_am[18] = dis[18] / 100.0 * s[18];
                total = total + s[18] - dis_am[18];
                c[18] = 1;
            } else if (ch == 10) {
                name[19] = "Half GirlFriend(Chetan Bhagat)";
                System.out.println("---Enter The Number of books required---");
                q[19] = in.nextInt();
                price[19] = 225.0;
                dis[19] = 10.0;
                s[19] = q[19] * price[19];
                dis_am[19] = dis[19] / 100.0 * s[19];
                total = total + s[19] - dis_am[19];
                c[19] = 1;
            } else if (ch == 0)
                break;
            else {
                System.out.println("Wrong Choice");
                System.out.println("You will be redirected");
            }
        }

    }

    void stationary() {
        while (true) {
            System.out.println("----------------Welcome---------------------");
            System.out.println("---You have entered the Stationary section---");
            System.out.println("--------These are the items available--------");
            System.out.println("1.Reynolds Pen-------------Rs.20.00");
            System.out.println("2.Pencil-------------------Rs.5.00");
            System.out.println("3.Eraser-------------------Rs.3.00");
            System.out.println("4.Higlighter---------------Rs.15.00");
            System.out.println("5.Pen Refill---------------Rs.4.00");
            System.out.println("6.Oil Pastels--------------Rs.50.00");
            System.out.println("7.Water Colours------------Rs.125.00");
            System.out.println("8.Colouring Brush----------Rs.7.00");
            System.out.println("9.Art Paper----------------Rs.2.00");
            System.out.println("10.Stapler pins------------Rs.20.00");
            System.out.println("0.To stop order---");
            System.out.println("---Enter your choice---");
            ch = in.nextInt();
            if (ch == 1) {
                name[20] = "Reynolds Pen";
                System.out.println("Enter the number of entities needed");
                q[20] = in.nextInt();
                price[20] = 20.0;
                s[20] = q[20] * price[20];
                total = total + s[20];
                c[20] = 1;
            } else if (ch == 2) {
                name[21] = "Pencil";
                System.out.println("Enter the number of entities required");
                q[21] = in.nextInt();
                price[21] = 5.0;
                s[21] = q[21] * price[21];
                total = total + s[21];
                c[21] = 1;
            } else if (ch == 3) {
                name[22] = "Eraser";
                System.out.println("Enter the number of entities required");
                q[22] = in.nextInt();
                price[22] = 3.0;
                s[22] = q[22] * price[22];
                total = total + s[22];
                c[22] = 1;
            } else if (ch == 4) {
                name[23] = "Highlighter";
                System.out.println("Enter the number of entities required");
                q[23] = in.nextInt();
                price[23] = 15.0;
                s[23] = q[23] * price[23];
                total = total + s[23];
                c[23] = 1;
            } else if (ch == 5) {
                name[24] = "Pen Refill";
                System.out.println("Enter the number of entities required");
                q[24] = in.nextInt();
                price[24] = 4.0;
                s[24] = q[24] * price[24];
                total = total + s[24];
                c[24] = 1;
            } else if (ch == 6) {
                name[25] = "Oil Pastels";
                System.out.println("Enter the number of entities required");
                q[25] = in.nextInt();
                price[25] = 50.0;
                s[25] = q[25] * price[25];
                total = total + s[25];
                c[25] = 1;
            } else if (ch == 7) {
                name[26] = "Water Colours";
                System.out.println("Enter the number of entities required");
                q[26] = in.nextInt();
                price[26] = 125.0;
                s[26] = q[26] * price[26];
                total = total + s[26];
                c[26] = 1;
            } else if (ch == 8) {
                name[27] = "Colouring Brush";
                System.out.println("Enter the number of entities required");
                q[27] = in.nextInt();
                price[27] = 7.0;
                s[27] = q[27] * price[27];
                total = total + s[27];
                c[27] = 1;
            } else if (ch == 9) {
                name[28] = "Art Paper";
                System.out.println("Enter the number of entities required");
                q[28] = in.nextInt();
                price[28] = 2.0;
                s[28] = q[28] * price[28];
                total = total + s[28];
                c[28] = 1;
            } else if (ch == 10) {
                name[29] = "Stapler pins";
                System.out.println("Enter the number of entities required");
                q[29] = in.nextInt();
                price[29] = 20.0;
                s[29] = q[29] * price[29];
                total = total + s[29];
                c[29] = 1;
            } else if (ch == 0)
                break;
            else {
                System.out.println("Wrong Choice");
                System.out.println("You will be redirected");
            }
        }

    }

    void books() {
        int ch1;
        while (true) {
            System.out.println("-----------------Welcome----------------");
            System.out.println("---You have entered the books section---");
            System.out.println("---Choose the type of book you will like to buy---");
            System.out.println("---1.Educational Books---");
            System.out.println("---2.Fictional Books-----");
            System.out.println("---0.To stop order-------");
            System.out.println("---Enter your Choice---");
            ch1 = in.nextInt();
            if (ch1 == 1)
                education();
            else if (ch1 == 2)
                fiction();
            else if (ch == 0)
                break;
        }
    }

    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            book_store ob = new book_store();
            int ch2, i, a = 0;
            while (true) {
                System.out.println("----Press 1 to enter books section-----------");
                System.out.println("----Press 2 to enter stationary section------");
                System.out.println("----Press 0 to stop--------------------------");
                System.out.println("----Enter your choice---------");
                ch2 = in.nextInt();
                if (ch2 == 1)
                    ob.books();
                else if (ch2 == 2)
                    ob.stationary();
                else if (ch2 == 0)
                    break;
            }
            System.out.println("---Thank You for placing your order---");
            System.out.println("---Please wait till your transaction is being processed---");
            System.out.println("S.No.\tName of Item\tUnit Price\tQuantity\tDiscount\tDiscount Amount\tAmount");
            for (i = 0; i < 30; i++) {
                if (ob.c[i] == 1) {
                    a++;
                    System.out
                            .println(a + "\t" + ob.name[i] + "\t Rs." + ob.price[i] + "\t" + ob.q[i] + "\t" + ob.dis[i]
                                    + "\t Rs." + ob.dis_am[i] + "\t Rs." + (ob.s[i] - ob.dis_am[i]));
                }
            }
        }
        System.out.println("-----------------------------------------------Total= Rs." + total);

    }
}
