package com.company;

public class Database {
    public static BankAccount allAccounts[] = new BankAccount[10];

    static {

        allAccounts[0] = new CityBankAccount("Ilyas", "Zhuanyshev", 300, "KZ0102", "2222");
        allAccounts[1] = new CityBankAccount("Erbol", "Assanbek", 400, "KZ0101", "1111");
        allAccounts[2] = new CityBankAccount("Erzhan", "Shakenov", 500, "KZ0501", "4444");
        allAccounts[3] = new CityBankAccount("Erlan", "Imanov", 600, "KZ0303", "7777");
        allAccounts[4] = new CityBankAccount("Zhanibek", "Kakenov", 700, "KZ0406", "5555");
        allAccounts[5] = new NationalBankAccount("Isa Smagulov", 800, "KZ0702", "3333");
        allAccounts[6] = new NationalBankAccount("Diaz Abdulov", 900, "KZ0102", "9999");
        allAccounts[7] = new NationalBankAccount("Dias Suleymenov", 1000, "KZ0134", "6666");
        allAccounts[8] = new NationalBankAccount("Arsen Kairbekov", 1200, "KZ0765", "8888");
        allAccounts[9] = new NationalBankAccount("Daniyar Kuanysh", 1300, "KZ0435", "1313");

    }
}
