package com.company;

import oracle.jrockit.jfr.openmbean.ProducerDescriptorType;

public class Main
{

    public static void main(String[] args)
    {
        private String name;
        private double price;
        private int ounces;
        public class Drink extends Product
        {
            int ounces;
            public Drink(String nameNew, double priceNew, int ouncesNew)
            {
                name = nameNew;
                price = priceNew;
                ounces = ouncesNew;
            }
            public void setName(String nameNew)
            {
                this.name = nameNew;
            }
            public String getName()
            {
                return this.name;
            }
            public void setPrice(String priceNew)
            {
                this.price = priceNew;
            }
            public double getPrice()
            {
                return this.price;
            }
            public String toString()
            {
                return name + "\n" + price + "\n" + ounces;

            }
        }
        public class Candy extends Product
        {
            int ounces;
            public Candy(string name, double price, int ounces)
            {
                name = nameNew;
                price = priceNew;
                ounces = ouncesNew;
            }
            public void setName(String nameNew)
            {
                this.name = nameNew;
            }
            public String getName()
            {
                return this.name;
            }
            public void setPrice(String priceNew)
            {
                this.price = priceNew;
            }
            public double getPrice()
            {
                return this.price;
            }
            public String toString()
            {
                return name + "\n" + price + "\n" + ounces;

            }
        }
        public class Chips extends Product
        {
            int ounces;
            public Chips(string name, double price, int ounces)
            {
                name = nameNew;
                price = priceNew;
                ounces = ouncesNew;
            }
            public void setName(String nameNew)
            {
                this.name = nameNew;
            }
            public String getName()
            {
                return this.name;
            }
            public void setPrice(String priceNew)
            {
                this.price = priceNew;
            }
            public double getPrice()
            {
                return this.price;
            }
            public String toString()
            {
                return name + "\n" + price + "\n" + ounces;

            }
        }
    }
}
