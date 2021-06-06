package org.ex23;

import java.util.Scanner;

public class ex23 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Is the car silent when you turn the key? ");
        String answer = scanner.nextLine();

        if (answer.equals("y")){
            System.out.print("Are the battery terminals corroded?");
            answer = scanner.nextLine();
            if(answer.equals("y")){
                System.out.println("Clean the terminals and try starting again.");
            }
            else if(answer.equals("n")){
                System.out.print("Replace cables and try again.");
                }
        else if (answer.equals("n")){
            System.out.println("Does the car make a slicking noise?");
            answer = scanner.nextLine();
            if(answer.equals("y")){
                System.out.print("Replace the battery.");
            }
            else if(answer.equals("n")){
                System.out.print("Does the car crank up but fail to start");
                if (answer.equals("y")){
                    System.out.print("Check spark plug connections.");
                }
                else if(answer.equals("n")){
                    System.out.print("Does the engine start and then die?");
                    if (answer.equals("y")){
                        System.out.print("Does your car have fuel injection?");
                        if (answer.equals("y")){
                            System.out.print("Get it in for service.");
                        }
                        else if(answer.equals("no")){
                            System.out.print("Check to ensure that the choke is opening and closing");
                        }
                     else if(answer.equals("no")){
                         System.out.print("This should not be possible.");
                        }
                    }
                }



            }



            }


        }


    }
}
