/**
 * Demo method to run the animal interface.
 * 
 * @version 8/21/2024
 * @author Josh Martin
 * @author Omar ALchab
 * @author Leah Anderson
 */
import java.util.Scanner;
public class demo implements Animal
{
    public static void main(String[] args) 
    {
        System.out.println("What animal would you like to hear?\nCat or Dog?");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        Animal animal;
        if (s.equals("Cat") || s.toString().equals("cat"))
        {
            animal = new Cat();
            animal.noise();
        } 
        else if (s.toString().equals("Dog") || s.toString().equals("dog"))
        {
            animal = new Dog();
            animal.noise();
        }
        else
        {
            System.out.println("Please enter the right animal");
        }
        scan.close();
    }

    @Override
    public void noise() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'noise'");
    }
}
