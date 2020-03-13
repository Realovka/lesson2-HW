package com.company;

public class Main {

    public static void main(String[] args) {

                Customer customer1 = new Customer();
                customer1.firstName = "Петр";
                customer1.lastName = "Иванов";
                customer1.telephone = "80293101122";
                customer1.city = "Минск";
                customer1.street = "Октябрьская";
                customer1.house = 21;
                Customer customer2 = new Customer();
                customer2.firstName = "Иван";
                customer2.lastName = "Петров";
                customer2.telephone = "80295609834";
                customer2.city = "Минск";
                customer2.street = "Ленинградская";
                customer2.house = 34;
                Customer customer3 = new Customer();
                customer3.firstName = "Анна";
                customer3.lastName = "Сидорова";
                customer3.telephone = "80294590033";
                customer3.city = "Минск";
                customer3.street = "Жудро";
                customer3.house = 1;

            }
        }
        class Customer {
            String firstName;
            String lastName;
            String telephone;
            String city;
            String street;
            int house;

            void  getFullName() {
                System.out.println("Имя и фамилия заказчика: " + firstName + " " + lastName);
            }
            void getFullAddress(){
                System.out.println("Адрес заказчика:"+city+", "+street+", "+house);
            }
        }




