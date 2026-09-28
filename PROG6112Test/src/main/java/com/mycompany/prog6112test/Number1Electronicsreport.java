package com.mycompany.prog6112test;

public class Number1Electronicsreport
        public static void main(String[] args){
            
            String[]cities = {"Cape Town", "Port elizabeth", "Pretoria"};
            String[] console = {"PS5","XBOX","SWITCH"};
            int[][]sales = {
                {1000, 2000, 3000},
                    {2000, 3000, 4000},
                    {1500,1100,1200},
            };
                    int[]totalsales = newint[cities.length];
                    for(int i = 0;i< cities.length;i++) {
                        for(int j = 0; j < console.length; j++) {
                            totalsales[i]+=sales[i][j];
                        }
                    }
                    int maxsales = totalsales[0];
                    int maxIndex = 0;
                    for(int i = 1;i< totalsales.length;i++){
                        if(totalsales[i]>maxsales){
                            maxsales = totalsales[i];
                            maxIndex = i;
                        }
                    }
                    System.out.println("---------------------------------");
                    System.out.println("GAMING CONSOLE REPORT");
                    System.out.println("---------------------------------");
                    System.out.println("%-20s%-%10-%-10s%-10s/n","",console[0],console[1],console[2];
                    System.out.println("---------------------------------");
                    for(int i = 0; i < cities.length; i++){
                        System.out.printf("%-20s %s")
                        }
                    }
                       
                    }
                    
                    
                    
                        

                   
                        

                       
